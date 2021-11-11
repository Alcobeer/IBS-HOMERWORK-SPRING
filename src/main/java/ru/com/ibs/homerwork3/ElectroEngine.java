package ru.com.ibs.homerwork3;

import org.springframework.stereotype.Component;

@Component("carElectroBean")
public class ElectroEngine implements Cars{
    @Override
    public String getMove() {
        return "electro";
    }
}
