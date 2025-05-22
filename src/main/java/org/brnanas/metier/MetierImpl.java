package org.brnanas.metier;

import org.brnanas.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        return dao.getData();
    }
}
