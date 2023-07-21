package ru.yandex.mocktestingwebinarproject.dao.impl;

import ru.yandex.mocktestingwebinarproject.dao.UserDao;
import ru.yandex.mocktestingwebinarproject.dao.annotation.BdUserDao;
import ru.yandex.mocktestingwebinarproject.dao.annotation.Dao;
import ru.yandex.mocktestingwebinarproject.entity.User;

@BdUserDao
@Dao
public class DbUserDao implements UserDao {

    public static final String DB_USER_DAO = "dbUserDao";

    @Override
    public User getUserById(Long id) {
        // return from db
        return new User();
    }
}
