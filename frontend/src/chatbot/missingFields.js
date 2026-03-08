export function getMissingFields(persona) {
  const missing = [];

  if (!persona.geographic?.state) missing.push("state");
  if (!persona.geographic?.district) missing.push("district");
  if (!persona.demographics?.age) missing.push("age");
  if (!persona.occupation?.type) missing.push("occupation");
  if (!persona.economic?.incomeBracket) missing.push("income");
  if (!persona.demographics?.category) missing.push("category");

  if (persona.occupation?.type === "FARMER") {
    if (!persona.occupation?.details?.farmerDetails?.landHolding?.value) {
      missing.push("land");
    }
  }

  if (persona.occupation?.type === "STUDENT") {
    if (!persona.occupation?.details?.studentDetails?.educationLevel) {
      missing.push("education");
    }
  }

  if (persona.occupation?.type === "WORKER") {
    if (!persona.occupation?.details?.workerDetails?.employmentCategory) {
      missing.push("employmentCategory");
    }
  }

  if (persona.occupation?.type === "SELF_EMPLOYED") {
    if (!persona.occupation?.details?.selfEmployedDetails?.sector) {
      missing.push("sector");
    }
  }

  return missing;
}