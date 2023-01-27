package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Tower;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public class TowerDataAccess implements TowerRepository {

    private final JdbcTemplate jdbcTemplate;

    public TowerDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insertTowers(UUID id, Tower tower) {
        String sql = "insert into tower (id,type,status,assigned_to,availability,serial_number, make ,cpu ,ram ,data_storage) values (?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, id, tower.getType(), tower.getStatus(), tower.getAssignedTo(),
                tower.getAvailability(), tower.getSerialNumber(), tower.getMake(), tower.getCpu(),
                tower.getRam(), tower.getDataStorage());
    }

    @Override
    public List<Tower> selectAllTowers() {
        String sql = "select * from tower";
        return jdbcTemplate.query(sql, mapTowerFromDB());
    }


    @Override
    public int updateTowerBySerialNumber(String serialNumber, Tower newTower) {
        String sql = "update tower set status =? ,assigned_to=?,availability=?,cpu = ?,ram=?,data_storage=? where serial_number =? ";
        return jdbcTemplate.update(sql, serialNumber, newTower);
    }

    @Override
    public int deleteTowerBySerialNumber(String serialNumber) {
        String sql = "delete from tower where serial_number =?";
        return jdbcTemplate.update(sql, serialNumber);
    }

    private RowMapper<Tower> mapTowerFromDB() {
        return (resultSet, i) -> {
            String status = resultSet.getString("status");
            String assignedTo = resultSet.getString("assigned_to");
            String availability = resultSet.getString("availability");
            String serialNumber = resultSet.getString("serial_number");
            String make = resultSet.getString("make");
            String cpu = resultSet.getString("cpu");
            String ram = resultSet.getString("ram");
            String dataStorage = resultSet.getString("data_storage");
            return new Tower(status, availability, assignedTo, serialNumber, make, cpu, ram, dataStorage);
        };
    }
}
