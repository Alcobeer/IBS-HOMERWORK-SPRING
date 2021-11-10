package ru.com.ibs.homerwork3;


import java.util.ArrayList;
import java.util.List;


public class Model {
private List<Cars> carsList=new ArrayList<>();
private String mark;
private int strong;



    public Model(){}

    public void setCarsList(List<Cars> carsList) {
        this.carsList = carsList;
    }

    public List<Cars> getCarsList() {
        return carsList;
    }

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
       // System.out.println( "Car drive on " + carsList);
        for (Cars car:carsList){
            System.out.println("Car drive on " + car.getMove());
        }

       // System.out.println("Car drive on "+ car.getMove());
    }
}