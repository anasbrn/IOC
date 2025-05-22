package org.brnanas.dao;

import org.springframework.stereotype.Component;

@Component("d1")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("First implementation");
        return 14.4;
    }
}
