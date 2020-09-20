package com.project.services;

import java.util.List;

public interface BaseServices<T> {

    public T save(T entity);
    public T update(T entity);
    public void delete(T entity);
    public T findById(Long id);
    public List<T> findAll();
}
