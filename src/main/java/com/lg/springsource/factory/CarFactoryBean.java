package com.lg.springsource.factory;

import com.lg.springsource.beans.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by liuguo on 2017/4/19.
 */
public class CarFactoryBean implements FactoryBean<Car>{

    private String carInfo;

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
