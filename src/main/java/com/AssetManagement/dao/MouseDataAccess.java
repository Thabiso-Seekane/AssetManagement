package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Mouse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public class MouseDataAccess implements MouseRepository {

    private final JdbcTemplate jdbcTemplate;

    public MouseDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insertMouse(UUID id, Mouse mouse) {
        String sql = "insert into mouse (id,type,status,assigned_to,availability,serial_number, make) values (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, id, mouse.getType(), mouse.getStatus(),
                mouse.getSerialNumber(), mouse.getAvailability(), mouse.getMake(), mouse.getAssignedTo());
    }

    @Override
    public List<Mouse> selectAllMice() {
        String sql = "select * from mouse";
        return jdbcTemplate.query(sql, mapMouseFromDB());
    }

    @Override
    public int updateMouse(Mouse newMouse, String serial_number) {
        String sql = "update tower set status =? ,assigned_to=?,availability=?,cpu = ?,ram=?,data_storage=? where serial_number =? ";
        return jdbcTemplate.update(sql, serial_number, newMouse);
    }

    @Override
    public int deleteMouseBySerialNumber(String serialNumber) {
        String sql = "delete from mouse where serial_number =?";
        return jdbcTemplate.update(sql, serialNumber);
    }


    private RowMapper<Mouse> mapMouseFromDB() {
        return (resultSet, i) -> {
//            UUID id = UUID.fromString(resultSet.getString("id"));
            String status = resultSet.getString("status");
            String assignedTo = resultSet.getString("assigned_to");
            String availability = resultSet.getString("availability");
            String serialNumber = resultSet.getString("serial_number");
            String make = resultSet.getString("make");
            return new Mouse(status, assignedTo, availability, serialNumber, make);
        };

    }
}
