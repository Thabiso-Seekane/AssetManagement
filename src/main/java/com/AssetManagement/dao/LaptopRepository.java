package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Laptop;
import com.AssetManagement.model.electronics.Tower;

import java.util.List;
import java.util.UUID;

public interface LaptopRepository {

    int insertLaptop(UUID id, Laptop laptop);

    default int insertLaptop(Laptop laptop){
        UUID id= UUID.randomUUID();
        return insertLaptop(id,laptop);
    }

    List<Laptop> selectAllLaptop();

    int updateLaptopBySerialNumber(String serialNumber, Laptop Newlaptop);

    int deleteLaptopBySerialNumber(String serialNumber);
}
