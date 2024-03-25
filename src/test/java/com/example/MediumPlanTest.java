package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediumPlanTest {
    @Test
    void shouldReturnBasePriceWithStarterCostFactor() {
        PlanType starter = new Starter();
        MediumPlan plan = new MediumPlan(75.0f);
        plan.setPlanType(starter);
        assertEquals(75.0f, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithProCostFactor() {
        PlanType pro = new Pro();
        MediumPlan plan = new MediumPlan(75.0f);
        plan.setPlanType(pro);
        float finalPrice = 75.0f * (1 + pro.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithPremiumCostFactor() {
        PlanType premium = new Premium();
        MediumPlan plan = new MediumPlan(75.0f);
        plan.setPlanType(premium);

        float finalPrice = 75.0f * (1 + premium.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }
}
