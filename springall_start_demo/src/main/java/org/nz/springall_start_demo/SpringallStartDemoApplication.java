package org.nz.springall_start_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringallStartDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringallStartDemoApplication.class, args);
    }

}
