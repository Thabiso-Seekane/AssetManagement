package com.AssetManagement.service.MonitorService;

import com.AssetManagement.model.electronics.Monitor;

import java.util.List;

public interface MonitorService {
    int addMonitor(Monitor monitor);

    List<Monitor> getAllMonitor();

    int deleteMonitor(String serial_number);

    int  updateMonitor(String serial_number, Monitor newMonitor);
}
