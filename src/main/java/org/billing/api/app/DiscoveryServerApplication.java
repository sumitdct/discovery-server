package org.billing.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Enable eureka server
@EnableEurekaServer
public class DiscoveryServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }

    /**
     * This method is used to generate WAR of application
     * <br> No to maintain any deployment descriptor file (web.xml)
     * @param builder
     * @return SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DiscoveryServerApplication.class);
    }
}
