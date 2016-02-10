package com.razor.booker.components;

import com.razor.booter.components.StoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by paul.hemmings on 2/9/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class StoreServiceTest {

    @InjectMocks
    @Spy
    private StoreService storeIntegration;

    @Before
    public void setUp() {
    }

    @Test
    public void testService() {
        Assert.assertEquals("something", storeIntegration.getStores());
    }
}
