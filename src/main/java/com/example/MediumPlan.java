package com.example;

public class MediumPlan extends Plan{
    public MediumPlan(float basePrice) {
        super(basePrice);
    }

    @Override
    public float calculatePrice() {
        return getBasePrice() * (1 + getPlanType().getCostFactor());
    }
}
