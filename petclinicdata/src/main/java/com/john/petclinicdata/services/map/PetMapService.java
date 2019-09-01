package com.john.petclinicdata.services.map;

import com.john.petclinicdata.model.Pet;

/**
 * Created by jmarias on 9/1/19.
 */
public class PetMapService extends AbstractMapService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.saveUsingId(object.getId(),object);
    }

}
