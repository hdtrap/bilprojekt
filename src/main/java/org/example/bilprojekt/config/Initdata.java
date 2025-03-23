package org.example.bilprojekt.config;

import org.example.bilprojekt.Model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Initdata {

    public ArrayList<Car> carList = new ArrayList<>();

    public Initdata() {

        carList.add(new Car(1,"Volvo",2012,"Sedan","Red","ABC123","GrønVWpolo.jpg"));
        carList.add(new Car(2,"Ford",1938,"SUV","Blue","ACAB1312","blåvolvostationcar.jpg"));
        carList.add(new Car(3,"VW",1986,"Coupe","Black","HH1888","GulVWBobbel.jpg"));
        carList.add(new Car(4,"Hyundai",2002,"Convertible","Silver","PETE9895","WesternstarRødTruck.jpg"));
    }

}
