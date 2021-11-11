package ru.com.ibs.homerwork3;

import org.springframework.stereotype.Component;

@Component("carDiselBean")
public class DiselEngine implements Cars{
    @Override
    public String getMove() {
        return "disel";
    }
    public void doMyInitMetod(){
        System.out.println(" Inin is work!");
    }
    public void doMyDestroyMetod(){
        System.out.println(" Destroy is work!");
    }
}
