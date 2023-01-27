package com.AssetManagement.service.TowerService;

import com.AssetManagement.model.electronics.Tower;

import java.util.List;

public interface TowerService {
    int addTower(Tower tower);

    List<Tower> getAllTowers();

    int updateTower(String serial_number, Tower tower);

    int deleteTower(String serial_number);
}
