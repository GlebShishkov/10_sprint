package ru.yandex.mocktestingwebinarproject.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.yandex.mocktestingwebinarproject.dao.annotation.BdUserDao;
import ru.yandex.mocktestingwebinarproject.entity.User;

import javax.annotation.PostConstruct;

import static ru.yandex.mocktestingwebinarproject.dao.impl.DbUserDao.DB_USER_DAO;
import static ru.yandex.mocktestingwebinarproject.dao.impl.MapUserDao.MAP_USER_DAO;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// Singleton - Prototype
//@RequiredArgsConstructor
public class UserServiceDaoExample {

    ApplicationContext applicationContext;

    @BdUserDao
    @Autowired
    private UserDao userDao;

//    public UserServiceDaoExample(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @PostConstruct
    public void init(){
        System.out.println("User dao class name: " + userDao.getClass().getName());

        Object name = applicationContext.getBean("name");


    }
}
