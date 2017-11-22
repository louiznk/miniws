package com.github.vdemeester.miniws;

import com.github.vdemeester.miniws.feature.MiniwsFeatures;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(MiniwsFeatures.class);
    }
}
