package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.apap.tutorial3.model.CarModel;
import org.springframework.stereotype.Service;

@Service
public class CarInMemoryService implements CarService {
	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
	}
	
	@Override
	public List<CarModel> getCarList(){
		return archiveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		CarModel carUpdate = null;
		for(CarModel car:archiveCar) {
			if(car.getId().equalsIgnoreCase(id)) {
				carUpdate = car;
				break;
			}
			else {
				carUpdate = null;
			}
		}
		return carUpdate;
	}

}
