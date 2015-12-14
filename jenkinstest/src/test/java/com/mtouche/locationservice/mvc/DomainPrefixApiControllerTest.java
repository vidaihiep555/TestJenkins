package com.mtouche.locationservice.mvc;

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
public class DomainPrefixApiControllerTest {

    @Autowired
    DomainPrefixApiController domainPrefixApiController;

    @Test
    public void domainPrefixApiControllerLoads(){
        assertNotNull(domainPrefixApiController);
    }

    @Test
    public void testGetSubDomain(){
        String ip = "113.160.225.76";
        String appname = "app1";
        String platform = "ios";
        domainPrefixApiController.getSubDomain(appname, platform, ip);
    }
}
