const QUESTION_TEXT = {
  state: {
    "en-IN": "Which state do you live in?",
    "hi-IN": "आप किस राज्य में रहते हैं?",
    "mr-IN": "तुम्ही कोणत्या राज्यात राहता?",
    "ta-IN": "நீங்கள் எந்த மாநிலத்தில் வசிக்கிறீர்கள்?",
  },
  district: {
    "en-IN": "Which district do you live in?",
    "hi-IN": "आप किस जिले में रहते हैं?",
    "mr-IN": "तुम्ही कोणत्या जिल्ह्यात राहता?",
    "ta-IN": "நீங்கள் எந்த மாவட்டத்தில் வசிக்கிறீர்கள்?",
  },
  age: {
    "en-IN": "What is your age? Please say the number like 20.",
    "hi-IN": "आपकी उम्र क्या है? कृपया 20 जैसा अंक बोलें।",
    "mr-IN": "तुमचे वय किती आहे? कृपया 20 सारखा अंक बोला.",
    "ta-IN": "உங்கள் வயது என்ன? 20 போன்ற எண்ணாகச் சொல்லவும்.",
  },
  occupation: {
    "en-IN": "What is your occupation?",
    "hi-IN": "आपका पेशा क्या है?",
    "mr-IN": "तुमचा व्यवसाय काय आहे?",
    "ta-IN": "உங்கள் தொழில் என்ன?",
  },
  income: {
    "en-IN": "What is your annual family income range?",
    "hi-IN": "आपकी वार्षिक पारिवारिक आय किस सीमा में आती है?",
    "mr-IN": "तुमच्या कुटुंबाचे वार्षिक उत्पन्न कोणत्या श्रेणीत येते?",
    "ta-IN": "உங்கள் குடும்பத்தின் ஆண்டு வருமானம் எந்த வரம்பில் வருகிறது?",
  },
  category: {
    "en-IN": "Do you belong to General, OBC, SC or ST category?",
    "hi-IN": "क्या आप सामान्य, ओबीसी, एससी या एसटी वर्ग से हैं?",
    "mr-IN": "तुम्ही जनरल, ओबीसी, एससी की एसटी प्रवर्गातील आहात का?",
    "ta-IN": "நீங்கள் பொதுப் பிரிவு, ஓபிசி, எஸ்சி அல்லது எஸ்டி வகையைச் சேர்ந்தவரா?",
  },
  land: {
    "en-IN": "How many acres of land do you own?",
    "hi-IN": "आपके पास कितने एकड़ जमीन है?",
    "mr-IN": "तुमच्याकडे किती एकर जमीन आहे?",
    "ta-IN": "உங்களிடம் எத்தனை ஏக்கர் நிலம் உள்ளது?",
  },
  education: {
    "en-IN": "What is your education level? You can say school, undergraduate, postgraduate, or diploma.",
    "hi-IN": "आपकी शिक्षा का स्तर क्या है? आप स्कूल, कॉलेज, पोस्टग्रेजुएट, या डिप्लोमा कह सकते हैं।",
    "mr-IN": "तुमचे शिक्षणाचे स्तर काय आहे? तुम्ही स्कूल, कॉलेज, पोस्टग्रॅज्युएट, किंवा डिप्लोमा असे सांगू शकता.",
    "ta-IN": "உங்கள் கல்வி நிலை என்ன? பள்ளி, கல்லூரி, முதுநிலை அல்லது டிப்ளமோ என்று சொல்லலாம்.",
  },
  employmentCategory: {
    "en-IN": "What type of worker are you? You can say salaried, daily wage, contract, or informal.",
    "hi-IN": "आप किस प्रकार के कामगार हैं? आप सैलरीड, दिहाड़ी, कॉन्ट्रैक्ट, या अनौपचारिक कह सकते हैं।",
    "mr-IN": "तुम्ही कोणत्या प्रकारचे कामगार आहात? तुम्ही सॅलरीड, दैनंदिन मजूर, कॉन्ट्रॅक्ट, किंवा अनौपचारिक असे सांगू शकता.",
    "ta-IN": "நீங்கள் எந்த வகை தொழிலாளர்? சம்பளதாரி, தினக்கூலி, ஒப்பந்தம், அல்லது ஒழுங்கற்ற வேலை என்று சொல்லலாம்.",
  },
  sector: {
    "en-IN": "Which sector do you work in? You can say retail, services, or manufacturing.",
    "hi-IN": "आप किस क्षेत्र में काम करते हैं? आप रिटेल, सर्विसेज, या मैन्युफैक्चरिंग कह सकते हैं।",
    "mr-IN": "तुम्ही कोणत्या क्षेत्रात काम करता? तुम्ही रिटेल, सर्व्हिसेस, किंवा मॅन्युफॅक्चरिंग असे सांगू शकता.",
    "ta-IN": "நீங்கள் எந்த துறையில் வேலை செய்கிறீர்கள்? ரீட்டெயில், சேவைகள், அல்லது உற்பத்தி என்று சொல்லலாம்.",
  },
  complete: {
    "en-IN": "Thank you. Your details are complete.",
    "hi-IN": "धन्यवाद। आपकी जानकारी पूरी हो गई है।",
    "mr-IN": "धन्यवाद. तुमची माहिती पूर्ण झाली आहे.",
    "ta-IN": "நன்றி. உங்கள் தகவல்கள் முழுமையாக கிடைத்துவிட்டன.",
  },
};

function getText(key, language = "en-IN") {
  return QUESTION_TEXT[key]?.[language] || QUESTION_TEXT[key]?.["en-IN"] || "";
}

export function nextQuestion(missing, language = "en-IN") {
  if (missing.includes("state")) return getText("state", language);
  if (missing.includes("district")) return getText("district", language);
  if (missing.includes("age")) return getText("age", language);
  if (missing.includes("occupation")) return getText("occupation", language);
  if (missing.includes("income")) return getText("income", language);
  if (missing.includes("category")) return getText("category", language);
  if (missing.includes("land")) return getText("land", language);
  if (missing.includes("education")) return getText("education", language);
  if (missing.includes("employmentCategory")) return getText("employmentCategory", language);
  if (missing.includes("sector")) return getText("sector", language);

  return getText("complete", language);
}