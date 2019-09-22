package com.john.petclinic.services.map;

import com.john.petclinic.model.Owner;
import com.john.petclinic.model.Pet;
import com.john.petclinic.services.OwnerService;
import com.john.petclinic.services.PetService;
import com.john.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner save(Owner object) {
        if(object!=null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet-> {
                    if(pet.getPetType() !=null){
                        if(pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else{
                        throw new RuntimeException("Pet Type is required!!!");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
