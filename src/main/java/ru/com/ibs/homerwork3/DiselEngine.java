package ru.com.ibs.homerwork3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("carDiselBean")
@Scope("prototype")
public class DiselEngine implements Cars{
    @Override
    public String getMove() {
        return "disel";
    }
    @PostConstruct
    public void doMyInitMetod(){
        System.out.println(" Inin is work!");
    }
    @PreDestroy
    public void doMyDestroyMetod(){
        System.out.println(" Destroy is work!");
    }
}
