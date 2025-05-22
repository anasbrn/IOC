package org.brnanas.pres;

import org.brnanas.dao.IDao;
import org.brnanas.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PresExtend {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("Result: " + metier.calculate());
    }
}
