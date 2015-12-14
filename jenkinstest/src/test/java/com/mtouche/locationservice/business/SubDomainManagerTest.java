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
import com.mtouche.locationservice.entity.ServerLocation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServletInitializer.class, WebMvcConfig.class})
@WebAppConfiguration
public class SubDomainManagerTest {

    @Autowired
    SubdomainManager subdomainManager;

    @Autowired
    LocationManager locationManager;

    @Test
    public void subdomainManagerLoads(){
        assertNotNull(subdomainManager);
    }

    @Test
    public void locationManagerLoads(){
        assertNotNull(locationManager);
    }

    @Test
    public void testGetSubdomain(){
        String ip = "113.160.225.76";
        String appName = "app1";
        try {
            ServerLocation location = locationManager.getLocation(ip);
            subdomainManager.getSubdomain(location, appName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
