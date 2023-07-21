package ru.yandex.mocktestingwebinarproject.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.yandex.mocktestingwebinarproject.dao.impl.DbUserDao;

@Configuration
public class ExampleConfiguration {

    //static

//    @Bean
//    public UserDao getUserDao(){
//        return new DbUserDao();
//    }
}
