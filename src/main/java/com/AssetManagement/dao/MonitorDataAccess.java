package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Monitor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class MonitorDataAccess implements MonitorRepository {

    private final JdbcTemplate jdbcTemplate;

    public MonitorDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertMonitor(UUID id, Monitor monitor) {
        String sql = "insert into monitor ( id,type,status,assigned_to,availability, serial_number, make ,monitor_size) values (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, id, monitor.getType(), monitor.getStatus(), monitor.getSerialNumber(), monitor.getAvailability(), monitor.getAssignedTo()
                , monitor.getMake(), monitor.getMonitorSize());
    }

    @Override
    public List<Monitor> selectAllMonitors() {
        String sql = "select * from monitor";
        return jdbcTemplate.query(sql, mapMonitorFromDB());
    }

    @Override
    public int updateMonitor(Monitor newMonitor, String serial_number) {
        String sql = "update tower set status =? ,assigned_to=?,availability=?,cpu = ?,ram=?,data_storage=? where serial_number =? ";
        return jdbcTemplate.update(sql, serial_number, newMonitor);
    }

    @Override
    public int deleteMonitorBySerialNumber(String serialNumber) {
        String sql = "delete from monitor where serial_number =?";
        return jdbcTemplate.update(sql, serialNumber);
    }


    private RowMapper<Monitor> mapMonitorFromDB() {
        return (resultSet, i) -> {
//            UUID id = UUID.fromString(resultSet.getString("id"));
            String status = resultSet.getString("status");
            String assignedTo = resultSet.getString("assigned_to");
            String availability = resultSet.getString("availability");
            String serialNumber = resultSet.getString("serial_number");
            String monitorSize = resultSet.getString("monitor_size");
            String make = resultSet.getString("make");
            return new Monitor(status, assignedTo, availability, serialNumber, monitorSize, make);
        };

    }
}
