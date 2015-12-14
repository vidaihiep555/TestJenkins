package com.mtouche.locationservice.business;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mtouche.locationservice.config.ServletInitializer;
import com.mtouche.locationservice.config.WebMvcConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServletInitializer.class, WebMvcConfig.class})
@WebAppConfiguration
public class CheckingTypeManagerTest {

    @Autowired
    CheckingTypeManager checkingTypeManager;

    @Test
    public void checkingTypeManagerLoads(){
        assertNotNull(checkingTypeManager);
    }

    @Test
    public void testGetCheckingType(){
        String appName = "app1";
        String platform = "ios";
        try {
            checkingTypeManager.getCheckingType(appName, platform);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
