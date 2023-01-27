package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Monitor;

import java.util.List;
import java.util.UUID;

public interface MonitorRepository {

    int insertMonitor(UUID id, Monitor monitor);
    default int insertMonitor(Monitor monitor) {
        UUID id = UUID.randomUUID();
        return insertMonitor(id, monitor);
    }

    List<Monitor> selectAllMonitors();

    int updateMonitor(Monitor newMonitor, String serial_number);

    int deleteMonitorBySerialNumber(String serialNumber);
}
