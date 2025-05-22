package org.brnanas.ext;

import org.brnanas.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Second implementation");
        return 20;
    }
}
