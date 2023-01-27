package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Tower;

import java.util.List;
import java.util.UUID;

public interface TowerRepository {

    int insertTowers(UUID id,Tower tower);

    default int insertTowers(Tower tower){
        UUID id= UUID.randomUUID();
        return insertTowers(id,tower);
    }

    List<Tower> selectAllTowers();

    int updateTowerBySerialNumber(String serialNumber, Tower newTower);

    int deleteTowerBySerialNumber(String serialNumber);
}
