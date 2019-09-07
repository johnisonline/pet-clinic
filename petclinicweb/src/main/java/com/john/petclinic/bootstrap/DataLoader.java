package com.john.petclinic.bootstrap;


import com.john.petclinic.model.Owner;
import com.john.petclinic.model.Vet;
import com.john.petclinic.services.OwnerService;
import com.john.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("john");
        owner1.setLastName("joseph");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("joe");
        owner2.setLastName("doe");

        ownerService.save(owner2);

        System.out.println("Owners Loaded....");

      //  System.out.println("id: " + owner1.getFirstName());

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("jingo");
        vet1.setLastName("daba");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("jungo");
        vet2.setLastName("dubo");

        vetService.save(vet2);

        System.out.println("vet loaded...");
    }
}

