package org.brnanas.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("First implementation");
        return 14.4;
    }
}
