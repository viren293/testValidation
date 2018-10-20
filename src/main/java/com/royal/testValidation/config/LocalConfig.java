package com.royal.testValidation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.swing.plaf.synth.SynthTextAreaUI;

@Profile("local")
@Configuration
public class LocalConfig {

    public LocalConfig(){
        System.setProperty("thisurl","http://localhosthost:9083/something");
    }

}
