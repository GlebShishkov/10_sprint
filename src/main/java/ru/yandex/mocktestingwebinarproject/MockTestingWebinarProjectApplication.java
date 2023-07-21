package ru.yandex.mocktestingwebinarproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import ru.yandex.mocktestingwebinarproject.dao.UserServiceDaoExample;

@SpringBootApplication
//@EnableCaching
//@EnableJpaAuditing
public class MockTestingWebinarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockTestingWebinarProjectApplication.class, args);
    }
}
