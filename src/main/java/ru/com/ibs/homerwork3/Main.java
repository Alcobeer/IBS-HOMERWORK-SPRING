package ru.com.ibs.homerwork3;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Model model=context.getBean("modelBean",Model.class);
        Model model2=context.getBean("modelBean",Model.class);

        boolean comprasion = model==model2;
        System.out.println(comprasion);

        model.driveACar();
        model2.driveACar();

        System.out.println(model.getMark());
        System.out.println(model.getStrong());

        context.close();
    }
}