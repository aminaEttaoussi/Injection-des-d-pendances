package net.amina.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnee");
        double temp=23;
        return temp;
    }

    public DaoImpl() {
    }
}
