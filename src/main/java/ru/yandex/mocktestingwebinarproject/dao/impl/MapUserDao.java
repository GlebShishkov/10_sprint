package ru.yandex.mocktestingwebinarproject.dao.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.yandex.mocktestingwebinarproject.dao.UserDao;
import ru.yandex.mocktestingwebinarproject.entity.User;

import java.util.HashMap;
import java.util.Map;

@Component(MapUserDao.MAP_USER_DAO)
public class MapUserDao implements UserDao {

    public static final String MAP_USER_DAO = "mapUserDao";

    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public User getUserById(Long id) {
        // return from map
        return new User();
    }
}
