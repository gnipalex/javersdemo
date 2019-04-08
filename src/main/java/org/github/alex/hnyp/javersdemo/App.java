package org.github.alex.hnyp.javersdemo;

import org.javers.spring.boot.sql.JaversSqlAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
//        HibernateJpaAutoConfiguration.class,
//        JaversSqlAutoConfiguration.class
})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
