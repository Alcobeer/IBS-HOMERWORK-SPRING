package ru.com.ibs.homerwork3;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.com.ibs.homerwork3.config.SpringConfig;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SpringConfig.class);

//        DiselEngine engine=context.getBean("carDiselBean",DiselEngine.class);
//        DiselEngine engine2=context.getBean("carDiselBean",DiselEngine.class);
//
//        System.out.println(engine.getMove());
//        System.out.println(engine2.getMove());



//        Model model=context.getBean("modelBean",Model.class);
//        Model model2=context.getBean("modelBean",Model.class);
//
//        boolean comprasion = model==model2;
//        System.out.println(comprasion);
//
//        model.driveACar();
//        model2.driveACar();
//
//        System.out.println(model.getMark());
//        System.out.println(model.getStrong());


//        Model model = context.getBean("modelBean",Model.class);
//        model.driveACar();
//        System.out.println(model.getMark());
//        System.out.println(model.getStrong());
//        DiselEngine diselEngine=context.getBean("carDiselBean",DiselEngine.class);
//        DiselEngine diselEngine2=context.getBean("carDiselBean",DiselEngine.class);
//        System.out.println(diselEngine2==diselEngine);
//        context.close();
    }
}