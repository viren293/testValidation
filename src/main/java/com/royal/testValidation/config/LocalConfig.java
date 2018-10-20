package com.royal.testValidation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Profile("local")
@Configuration
public class LocalConfig {

    public LocalConfig(){
        System.out.println("LocalConfig.LocalConfig");
        //System.setProperty("thisurl","http://localhost:9083/something");

/*
        try {
            Resource resource = new ClassPathResource("testFile");
            File file = resource.getFile();
            System.out.println("---" + Files.readAllLines(file.toPath()));
        } catch (IOException e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }
*/

        try {
                ClassPathResource resource = new ClassPathResource("testFile");
                File file = resource.getFile();
                System.out.println("-class path --" + Files.readAllLines(file.toPath()));
        } catch (IOException e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }


    }
}

/**P.S.
 * there can be an issue if the project has been compiled on one machine and after that has been launched on another or you run your app in Docker.
 * In this case, paths to your resource folder can be invalid. In this case it would be better to determine paths to your resources at runtime:

 ClassPathResource res = new ClassPathResource("jsonschema.json");
 File file = new File(res.getPath());
 */