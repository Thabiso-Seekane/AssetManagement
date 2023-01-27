package com.AssetManagement.service.LaptopService;

import com.AssetManagement.dao.LaptopRepository;
import com.AssetManagement.model.electronics.Laptop;
import com.AssetManagement.model.electronics.Tower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl {
    //TODO add service implementations

    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> getAllLaptops() {
        return laptopRepository.selectAllLaptop();
    }

    public int addLaptop(Laptop laptop) {
        return laptopRepository.insertLaptop(laptop);
    }

    public int updateLaptop(String serialNumber, Laptop newLaptop) {
        return laptopRepository.updateLaptopBySerialNumber(serialNumber, newLaptop);
    }

    public int deleteLaptop(String serialNumber)
    {
        return laptopRepository.deleteLaptopBySerialNumber(serialNumber);
    }
}
