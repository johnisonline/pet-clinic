package com.john.petclinic.bootstrap;


import com.john.petclinic.model.*;
import com.john.petclinic.services.OwnerService;
import com.john.petclinic.services.PetTypeService;
import com.john.petclinic.services.SpecialityService;
import com.john.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        if (petTypeService.findAll().size() == 0) {
            loadDate();
        }
    }

    private void loadDate() {
        PetType dog = new PetType();
        dog.setName("dog");

        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");

        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("john");
        owner1.setLastName("joseph");
        owner1.setAddress("joe st");
        owner1.setCity("eden prairie");


        Owner owner2 = new Owner();
        owner2.setFirstName("joe");
        owner2.setLastName("doe");
        owner2.setAddress("test st");
        owner2.setCity("eden prairie");


        Pet jack = new Pet();
        jack.setBirthDate(LocalDate.of(2015, Month.AUGUST, 13));
        jack.setPetType(dog);
        jack.setName("jack");
        jack.setOwner(owner1);

        Pet robby = new Pet();
        robby.setBirthDate(LocalDate.of(2017, Month.AUGUST, 10));
        robby.setPetType(dog);
        robby.setName("roby");
        robby.setOwner(owner1);

        Set<Pet> pets = new HashSet<>();
        pets.add(jack);
        pets.add(robby);

        //1. two ways of adding a Set to an object
        owner1.setPets(pets);
        ownerService.save(owner1);

        Pet chubby = new Pet();
        chubby.setBirthDate(LocalDate.of(2015, Month.SEPTEMBER, 13));
        chubby.setPetType(cat);
        chubby.setOwner(owner2);


        //2. two ways of adding a Set to an object
        owner2.getPets().add(chubby);

        ownerService.save(owner2);

        System.out.println("owners loaded....");
        //  System.out.println("id: " + owner1.getFirstName());

        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality saveDentistry = specialityService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("jingo");
        vet1.setLastName("daba");
        vet1.getSpecialities().add(savedRadiology);
        vet1.getSpecialities().add(saveDentistry);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("jungo");
        vet2.setLastName("dubo");
        vet2.getSpecialities().add(savedSurgery);
        vet2.getSpecialities().add(saveDentistry);
        vetService.save(vet2);

        System.out.println("vet loaded...");
    }
}

