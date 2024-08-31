package lk.ijse;

import lk.ijse.config.Config;
import lk.ijse.object.MyObj;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();

        /*register the agent*/
        ctx.register(MyObj.class);
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("Is bean singleton: "+beanFactory.isSingleton("myObj"));

    }
}