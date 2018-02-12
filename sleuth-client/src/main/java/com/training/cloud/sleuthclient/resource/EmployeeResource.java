package com.training.cloud.sleuthclient.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/rest/employee")
public class EmployeeResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeResource.class);
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "")
    public String getEmployee(){
        LOGGER.info("Before Calling the Server");
        String response = restTemplate.getForObject("http://localhost:8081/rest/employee/server", String.class);
        LOGGER.info("After Caling the Server");
        return response;
    }
}
