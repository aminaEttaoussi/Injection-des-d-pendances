package net.amina.presentation;

import net.amina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext springcontext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springcontext.getBean("metier");
        System.out.println("RES="+metier.calcul());

    }
}
