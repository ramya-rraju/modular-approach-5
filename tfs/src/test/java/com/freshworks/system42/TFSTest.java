package com.freshworks.system42;

import com.freshworks.modular.TFSService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;


public class TFSTest {

    TFSService tfsService = new TFSService();

    @BeforeAll
    public void setup() {
        System.out.println("Inside Before All");
    }

    @Before
    public void setup2() {
        System.out.println("Does not support");
    }

    @Test
    public void testGetService() {
        assert tfsService.getService().equals("Welcome to TFS..!! (Final Approach)");
    }


}
