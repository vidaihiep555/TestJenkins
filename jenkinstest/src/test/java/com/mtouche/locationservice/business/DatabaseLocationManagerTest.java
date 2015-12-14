package com.mtouche.locationservice.business;

import static org.junit.Assert.assertNotNull;

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
public class DatabaseLocationManagerTest {

    @Autowired
    LocationManager locationManager;

    @Test
    public void locationManagerLoads(){
        assertNotNull(locationManager);
    }

    @Test
    public void testGetLocation(){
        String ip = "113.160.225.76";
        try {
            locationManager.getLocation(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
