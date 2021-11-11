package ru.com.ibs.homerwork3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("modelBean")
public class Model {

//private List<Cars> carsList=new ArrayList<>();
    private DiselEngine diselEngine ;
    private PetrolEngine petrolEngine;
    private ElectroEngine electroEngine;
private String mark;
private int strong;



   // public Model(){}
   @Autowired
    public Model(DiselEngine diselEngine, PetrolEngine petrolEngine, ElectroEngine electroEngine) {
        this.diselEngine = diselEngine;
        this.petrolEngine = petrolEngine;
        this.electroEngine = electroEngine;
    }




//   public void setCarsList(List<Cars> carsList) {
//        this.carsList = carsList;
//    }
//
//    public List<Cars> getCarsList() {
//        return carsList;
//    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public void driveACar(){

//        for (Cars car:carsList){
//            System.out.println("Car drive on " + car.getMove());
//        }

        System.out.println("Car drive on "+ diselEngine.getMove());
        System.out.println("Car drive on "+ petrolEngine.getMove());
        System.out.println("Car drive on "+ electroEngine.getMove());
    }
}