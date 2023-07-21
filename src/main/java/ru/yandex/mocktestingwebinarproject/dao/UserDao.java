package ru.yandex.mocktestingwebinarproject.dao;

import ru.yandex.mocktestingwebinarproject.entity.User;

public interface UserDao {

    // Data Access Object

    User getUserById(Long id);
}
