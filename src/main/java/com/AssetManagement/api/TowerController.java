package com.AssetManagement.api;

import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Mouse;
import com.AssetManagement.model.electronics.Tower;
import com.AssetManagement.service.TowerService.TowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("asset/electronics")
@RestController
public class TowerController {

    @Autowired
    private TowerService towerService;

    @PostMapping(path = "tower")
    public void addTower(@RequestBody @Valid Tower tower) {
        towerService.addTower(tower);
    }

    @GetMapping(path = "tower")
    public List<Tower> getAllTowers() {
        return towerService.getAllTowers();
    }

    @PutMapping(path = "/tower/{serial_number}")
    public void updateTowerBySerialNumber(@PathVariable("serial_number") String serial_number, @RequestBody Tower tower) {
        towerService.updateTower(serial_number, tower);
    }

    @DeleteMapping(path = "/tower/{serial_number}")
    public void deleteTowerBySerialNo(@PathVariable("serial_number") String serial_number) {
        towerService.deleteTower(serial_number);
    }

}
