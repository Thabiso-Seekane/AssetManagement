package com.AssetManagement.api;

import com.AssetManagement.model.electronics.Laptop;
import com.AssetManagement.service.LaptopService.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("asset/electronics")
@RestController
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping(path = "laptop")
    public void addLaptop(@RequestBody @Valid Laptop laptop) {
        laptopService.addLaptop(laptop);
    }

    @GetMapping(path = "laptop")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @PutMapping(path = "/laptop/{serial_number}")
    public void updateLaptopBySerialNumber(@PathVariable("serial_number") String serial_number, @RequestBody Laptop laptop) {
        laptopService.updateLaptop(serial_number, laptop);
    }

    @DeleteMapping(path = "/laptop/{serial_number}")
    public void deleteLaptopBySerialNo(@PathVariable("serial_number") String serial_number) {
        laptopService.deleteLaptop(serial_number);
    }
}
