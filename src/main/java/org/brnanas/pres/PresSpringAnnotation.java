package org.brnanas.pres;

import org.brnanas.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("org.brnanas");
        IMetier metier = (IMetier) springContext.getBean("metier");

        System.out.println("Result using spring annotation: " + metier.calculate());
    }
}
