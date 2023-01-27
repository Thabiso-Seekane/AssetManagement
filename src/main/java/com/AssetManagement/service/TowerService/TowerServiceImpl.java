package com.AssetManagement.service.TowerService;

import com.AssetManagement.dao.TowerRepository;
import com.AssetManagement.model.electronics.Tower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TowerServiceImpl implements TowerService {

    @Autowired
    private TowerRepository towerRepository;

    public int addTower(Tower tower) {
        return towerRepository.insertTowers(tower);
    }

    public List<Tower> getAllTowers() {
        return towerRepository.selectAllTowers();
    }

    public int updateTower(String serialNumber, Tower newTower) {
        return towerRepository.updateTowerBySerialNumber(serialNumber, newTower);
    }

    public int deleteTower(String serialNumber)
    {
        return towerRepository.deleteTowerBySerialNumber(serialNumber);
    }
}
