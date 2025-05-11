package net.amina.metier;

import net.amina.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    //qualifier("d")
    private IDao dao;

    public MetierImpl() {
    }
//qualifier("d")
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*Math.PI/2;
        return t*43/3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
