package com.john.petclinic.model;


import java.util.List;
import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pet;

    public Owner(Set<Pet> pet) {
        this.pet = pet;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }
}
