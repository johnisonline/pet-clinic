package com.john.petclinicdata.services.map;

import com.john.petclinicdata.model.Owner;
import com.john.petclinicdata.services.CrudService;

import java.util.Set;

/**
 * Created by jmarias on 9/1/19.
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.saveUsingId(object.getId(), object);
    }



}
