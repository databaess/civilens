export const personaTemplate = {
  geographic: {
    state: null,
    district: null,
  },

  demographics: {
    age: null,
    category: null, // GENERAL | OBC | SC | ST
    educationLevel: null, // SCHOOL | UNDERGRADUATE | POSTGRADUATE | DIPLOMA
  },

  occupation: {
    type: null, // FARMER | WORKER | STUDENT | SELF_EMPLOYED

    details: {
      farmerDetails: {
        landHolding: {
          value: null,
          unit: "ACRE",
        },
      },

      workerDetails: {
        employmentCategory: null, // SALARIED | DAILY_WAGE | CONTRACT | INFORMAL
        sector: null, // RETAIL | SERVICES | MANUFACTURING
      },

      studentDetails: {
        educationLevel: null, // SCHOOL | UNDERGRADUATE | POSTGRADUATE | DIPLOMA
      },

      selfEmployedDetails: {
        sector: null,
      },
    },
  },

  economic: {
    incomeBracket: null, 
    /*
      ZERO_TO_1L
      ONE_TO_3L
      THREE_TO_5L
      FIVE_L_PLUS
      ANY
      NONE
    */
  },
};