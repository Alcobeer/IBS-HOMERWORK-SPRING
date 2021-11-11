package ru.com.ibs.homerwork3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("modelBean")
public class Model {

//private List<Cars> carsList=new ArrayList<>();


    private Cars cars;
    private Cars cars2;

    @Value("${Model.mark}")
    private String mark;
    @Value("${Model.strong}")
    private int strong;

    @Autowired
    public Model(@Qualifier("carDiselBean")Cars cars, @Qualifier("carElectroBean") Cars cars2) {
        this.cars = cars;
        this.cars2 = cars2;
    }

// public Model(){}



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

        System.out.println("Car drive on "+ cars.getMove());
        System.out.println("Car drive on "+ cars2.getMove());
    }
}