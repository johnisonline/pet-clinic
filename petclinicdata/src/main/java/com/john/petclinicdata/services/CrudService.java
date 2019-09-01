package com.john.petclinicdata.services;

import java.util.Set;

/**
 * Created by jmarias on 8/31/19.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);

    void delete(T object);

    void deleteById(ID id);





}
