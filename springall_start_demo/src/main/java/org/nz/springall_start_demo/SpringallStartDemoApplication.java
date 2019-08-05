package org.nz.springall_start_demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableAdminServer
public class SpringallStartDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringallStartDemoApplication.class, args);
    }

}
