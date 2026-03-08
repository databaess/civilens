const { app } = require("@azure/functions");
const axios = require("axios");

app.http("speechToken", {
  methods: ["GET"],
  authLevel: "anonymous",
  handler: async (request, context) => {
    const speechKey = process.env.SPEECH_KEY;
    const speechRegion = process.env.SPEECH_REGION;

    if (!speechKey || !speechRegion) {
      return {
        status: 500,
        jsonBody: { error: "Speech key or region not configured" },
      };
    }

    try {
      const response = await axios.post(
        `https://${speechRegion}.api.cognitive.microsoft.com/sts/v1.0/issueToken`,
        null,
        {
          headers: {
            "Ocp-Apim-Subscription-Key": speechKey,
            "Content-Type": "application/x-www-form-urlencoded",
          },
        }
      );

      return {
        status: 200,
        jsonBody: {
          token: response.data,
          region: speechRegion,
        },
      };
    } catch (error) {
      context.log("Speech token error:", error.message);
      return {
        status: 500,
        jsonBody: { error: "Error generating speech token" },
      };
    }
  },
});