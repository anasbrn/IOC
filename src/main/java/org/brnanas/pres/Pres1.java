package org.brnanas.pres;

import org.brnanas.dao.DaoImpl;
import org.brnanas.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        double result = metier.calculate();

        System.out.println(result);
    }
}
