package net.amina.presentation;

import net.amina.dao.DaoImpl;
import net.amina.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d=new DaoImpl();
        MetierImpl m=new MetierImpl(d);
        System.out.println("RES:"+m.calcul());
    }
}
