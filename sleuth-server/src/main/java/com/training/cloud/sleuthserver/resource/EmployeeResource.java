package com.training.cloud.sleuthserver.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeResource.class);

    @GetMapping(value = "server")
    public String getEmployee(){

        LOGGER.info("Reached to Server");
        return "Rahul Raj";
    }
}
