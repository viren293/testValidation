package com.royal.testValidation.config;

import org.springframework.context.annotation.Configuration;


/// if no profile , this gets executed all time.. ..
@Configuration
public class ApiConfigurations {

        public  ApiConfigurations(){
            System.out.println("ApiConfigurations.ApiConfigurations");
        }

}
