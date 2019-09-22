package com.john.petclinic.services.map;

import com.john.petclinic.model.Pet;
import com.john.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{
}
