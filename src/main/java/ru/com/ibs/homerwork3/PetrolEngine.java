package ru.com.ibs.homerwork3;

import org.springframework.stereotype.Component;

@Component("carPetrolBean")
public class PetrolEngine implements Cars{
    @Override
    public String getMove() {
        return "petrol";
    }
}
