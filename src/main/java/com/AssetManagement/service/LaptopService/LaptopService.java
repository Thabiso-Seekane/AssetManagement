package com.AssetManagement.service.LaptopService;

import com.AssetManagement.model.electronics.Laptop;
import com.AssetManagement.model.electronics.Tower;

import java.util.List;

public interface LaptopService {

    int addLaptop(Laptop laptop);

    List<Laptop> getAllLaptops();

    int updateLaptop(String serial_number, Laptop laptop);

    int deleteLaptop(String serial_number);
}
