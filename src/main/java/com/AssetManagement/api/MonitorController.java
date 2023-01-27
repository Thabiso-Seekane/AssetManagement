package com.AssetManagement.api;

import com.AssetManagement.model.electronics.Monitor;
import com.AssetManagement.model.electronics.Tower;
import com.AssetManagement.service.MonitorService.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("asset/electronics")
@RestController
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @PostMapping(path = "monitor")
    public void addMonitor(@RequestBody @Valid Monitor monitor) {
        monitorService.addMonitor(monitor);
    }

    @GetMapping(path = "monitor")
    public List<Monitor> getAllMonitor() {
        return monitorService.getAllMonitor();
    }


    @DeleteMapping(path = "/monitor/{serial_number}")
    public void deleteMonitorBySerialNo(@PathVariable("serial_number") String serial_number) {
        monitorService.deleteMonitor(serial_number);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/monitor/{serial_number}")
    public void updateMonitor(@PathVariable("serial_number") String serial_number, @Valid @NonNull @RequestBody Monitor monitor){
         monitorService.updateMonitor(serial_number,monitor);
    }

}
