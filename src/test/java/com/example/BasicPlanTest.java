package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicPlanTest {
    @Test
    void shouldReturnBasePriceWithStarterCostFactor() {
        PlanType starter = new Starter();
        BasicPlan plan = new BasicPlan(50.0f);
        plan.setPlanType(starter);
        assertEquals(50.0f, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithProCostFactor() {
        PlanType pro = new Pro();
        BasicPlan plan = new BasicPlan(50.0f);
        plan.setPlanType(pro);
        float finalPrice = 50.0f * (1 + pro.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }

    @Test
    void shouldReturnBasePriceWithPremiumCostFactor() {
        PlanType premium = new Premium();
        BasicPlan plan = new BasicPlan(50.0f);
        plan.setPlanType(premium);

        float finalPrice = 50.0f * (1 + premium.getCostFactor());
        assertEquals(finalPrice, plan.calculatePrice());
    }
}
