package com.example;

public class AdvancedPlan extends Plan{
    public AdvancedPlan(float basePrice) {
        super(basePrice);
    }

    @Override
    public float calculatePrice() {
        return getBasePrice() * (1 + getPlanType().getCostFactor());
    }
}
