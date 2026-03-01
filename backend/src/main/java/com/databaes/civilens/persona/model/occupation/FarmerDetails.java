package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.embedded.LandHolding;
import com.databaes.civilens.persona.model.enums.farmer.CropCategory;
import com.databaes.civilens.persona.model.enums.farmer.IrrigationType;

public class FarmerDetails implements OccupationDetails {

    private LandHolding landHolding;
    private IrrigationType irrigationType;
    private CropCategory primaryCropCategory;
}
