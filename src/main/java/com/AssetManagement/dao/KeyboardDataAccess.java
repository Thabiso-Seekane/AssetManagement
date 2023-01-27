package com.AssetManagement.dao;


import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Tower;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class KeyboardDataAccess implements KeyboardRepository {

    private final JdbcTemplate jdbcTemplate;

    public KeyboardDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertKeyboard(UUID id, Keyboard keyboard) {
        String sql ="insert into keyboard (id,type,status,assigned_to,availability,serial_number, make) values (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,id,keyboard.getType(),keyboard.getStatus(),keyboard.getSerialNumber(),
                keyboard.getAvailability(),keyboard.getAssignedTo(),keyboard.getMake());
    }

    @Override
    public List<Keyboard> selectAllKeyboards() {
        String sql = "select * from keyboard";
        return jdbcTemplate.query(sql,mapKeyboardFromDB());
    }

    @Override
    public int updateKeyBoardBySerialNumber(String serialNumber, Keyboard newKeyboard) {
        String sql = "update tower set status =? ,assigned_to=?,availability=?,cpu = ?,ram=?,data_storage=? where serial_number =? ";
        return jdbcTemplate.update(sql, serialNumber, newKeyboard);
    }

    @Override
    public int deleteKeyboardBySerialNumber(String serialNumber) {
        String sql = "delete from keyboard where serial_number =?";
        return jdbcTemplate.update(sql,serialNumber);
    }

    private RowMapper<Keyboard> mapKeyboardFromDB(){
        return (resultSet,i) ->{
//            UUID id = UUID.fromString(resultSet.getString("id"));
            String status = resultSet.getString("status");
            String assignedTo = resultSet.getString("assigned_to");
            String availability = resultSet.getString("availability");
            String serialNumber = resultSet.getString("serial_number");
            String make = resultSet.getString("make");
            return  new Keyboard(status,assignedTo,availability,serialNumber,make);
        };
    }
}
