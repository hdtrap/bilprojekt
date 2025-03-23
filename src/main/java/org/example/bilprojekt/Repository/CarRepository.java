package org.example.bilprojekt.Repository;

import org.example.bilprojekt.Model.Car;
import org.example.bilprojekt.config.Initdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    @Autowired
    Initdata init;

    public ArrayList<Car> getCars() {
        return init.carList;
    }

}
