package com.example;

public class BasicPlan extends Plan{
    public BasicPlan(float basePrice) {
        super(basePrice);
    }

    @Override
    public float calculatePrice() {
        return getBasePrice() * (1 + getPlanType().getCostFactor());
    }
}
