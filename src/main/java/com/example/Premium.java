package com.example;

public class Premium implements PlanType{
    @Override
    public float getCostFactor() {
        return 0.5f;
    }
}
