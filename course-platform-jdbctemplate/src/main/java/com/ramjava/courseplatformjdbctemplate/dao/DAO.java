package com.ramjava.courseplatformjdbctemplate.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    // Every DAO that will be created on this project should implement these CRUD implementation
    List<T> list();
    void create(T t);
    Optional<T> get(int id);
    void update(T t, int id);
    void delete(int id);
}
