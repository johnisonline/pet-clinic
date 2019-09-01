package com.john.petclinicdata.services.map;

import com.john.petclinicdata.model.Vet;

/**
 * Created by jmarias on 9/1/19.
 */
public class VetMapService extends AbstractMapService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.saveUsingId(object.getId(), object);
    }
}
