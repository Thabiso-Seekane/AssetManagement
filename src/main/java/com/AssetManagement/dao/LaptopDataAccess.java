package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Laptop;
import com.AssetManagement.model.electronics.Tower;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class LaptopDataAccess implements LaptopRepository {

    private final JdbcTemplate jdbcTemplate;

    public LaptopDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertLaptop(UUID id, Laptop laptop) {
        String sql = "insert into tower (id,type,status,assigned_to,availability,serial_number, make ,cpu ,ram ,data_storage) values (?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, id, laptop.getType(), laptop.getStatus(), laptop.getAssignedTo(),
                laptop.getAvailability(), laptop.getSerialNumber(), laptop.getMake(), laptop.getCpu(),
                laptop.getRam(), laptop.getDataStorage());
    }

    @Override
    public List<Laptop> selectAllLaptop() {
        String sql = "select * from tower";
        return jdbcTemplate.query(sql, mapLaptopFromDB());
    }

    @Override
    public int updateLaptopBySerialNumber(String serialNumber, Laptop Newlaptop) {
        String sql = "update tower set status =? ,assigned_to=?,availability=?,cpu = ?,ram=?,data_storage=? where serial_number =? ";
        return jdbcTemplate.update(sql, serialNumber, Newlaptop);
    }

    @Override
    public int deleteLaptopBySerialNumber(String serialNumber) {
        String sql = "delete from laptop where serial_number =?";
        return jdbcTemplate.update(sql, serialNumber);
    }
    private RowMapper<Laptop> mapLaptopFromDB() {
        return (resultSet, i) -> {
            String status = resultSet.getString("status");
            String assignedTo = resultSet.getString("assigned_to");
            String availability = resultSet.getString("availability");
            String serialNumber = resultSet.getString("serial_number");
            String make = resultSet.getString("make");
            String cpu = resultSet.getString("cpu");
            String ram = resultSet.getString("ram");
            String dataStorage = resultSet.getString("data_storage");
            return new Laptop(status, availability, assignedTo, serialNumber, make, cpu, ram, dataStorage);
        };
    }
}
