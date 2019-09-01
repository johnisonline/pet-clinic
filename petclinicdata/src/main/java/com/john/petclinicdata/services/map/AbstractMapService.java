package com.john.petclinicdata.services.map;

import com.john.petclinicdata.model.BaseEntity;
import com.john.petclinicdata.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
         return map.get(id);
    }

    @Override
    public T save(T object) {
        return null;
    }

    protected T saveUsingId(ID id, T object){
        map.put(id,object);
        return object;
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    /* @Override
    public T save(T object) {
        return null;
    }


    protected Map<ID, T> map = new HashMap<>();


    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
*/
   /* @Override
    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }


    @Override
    void deleteById(ID id){
        map.remove(id);
    }

    @Override
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }


*/

}
