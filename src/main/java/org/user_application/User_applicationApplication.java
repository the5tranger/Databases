package org.user_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.user_application.repository.mysql")
@EnableMongoRepositories("org.user_application.repository.mongo")
public class User_applicationApplication {









    public static void main(String[] args) {
        SpringApplication.run(User_applicationApplication.class, args);
    }

}
