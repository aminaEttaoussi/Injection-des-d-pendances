package net.amina.ext;

import net.amina.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur.....");
        double t=12;
        return t;
    }
}
