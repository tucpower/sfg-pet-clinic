package com.jrt.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petYType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetYType() {
        return petYType;
    }

    public void setPetYType(PetType petYType) {
        this.petYType = petYType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
