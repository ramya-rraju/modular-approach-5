package com.freshworks.modular;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CRSTest {

    CRSService crsService = new CRSService();

    @BeforeAll
    public static void setup() {
        System.out.println("Inside Before All");
    }

    @Before
    public void setup2() {
        System.out.println("Does not support");
    }

    @Test
    public void testGetService() {
        assert crsService.getService().equals("Welcome to CRS..!! (Final Approach)");
    }
}
