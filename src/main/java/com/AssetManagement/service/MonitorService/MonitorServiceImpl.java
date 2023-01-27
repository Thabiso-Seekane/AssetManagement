package com.AssetManagement.service.MonitorService;

import com.AssetManagement.dao.MonitorRepository;
import com.AssetManagement.model.electronics.Monitor;
import com.AssetManagement.model.electronics.Mouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;


    public int addMonitor(Monitor monitor) {return monitorRepository.insertMonitor(monitor);}

    public List<Monitor> getAllMonitor(){return  monitorRepository.selectAllMonitors();}

    public int  deleteMonitor(String serialNumber ) {
        return monitorRepository.deleteMonitorBySerialNumber(serialNumber);
    }

    @Override
    public int updateMonitor(String serial_number, Monitor newMonitor) {
         return monitorRepository.updateMonitor(newMonitor, serial_number);
    }

}
