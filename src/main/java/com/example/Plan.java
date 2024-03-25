package com.example;

public abstract class Plan {
    protected PlanType planType;

    protected float basePrice;

    public Plan(float basePrice) {
        this.basePrice = basePrice;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public abstract float calculatePrice();
}
