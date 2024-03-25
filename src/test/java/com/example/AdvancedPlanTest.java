package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedPlanTest {
    @Test
    void shouldReturnBasePriceWithStarterCostFactor() {
        PlanType starter = new Starter();
        AdvancedPlan plan = new AdvancedPlan(90.0f);
        plan.setPlanType(starter);
        assertEquals(90.0f, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithProCostFactor() {
        PlanType pro = new Pro();
        AdvancedPlan plan = new AdvancedPlan(90.0f);
        plan.setPlanType(pro);
        float finalPrice = 90.0f * (1 + pro.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithPremiumCostFactor() {
        PlanType premium = new Premium();
        AdvancedPlan plan = new AdvancedPlan(90.0f);
        plan.setPlanType(premium);

        float finalPrice = 90.0f * (1 + premium.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }
}
