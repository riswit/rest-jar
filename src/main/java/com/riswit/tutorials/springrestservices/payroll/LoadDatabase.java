package com.riswit.tutorials.springrestservices.payroll;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {
    private static Log log = LogFactory.getLog(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.warn("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.warn("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}