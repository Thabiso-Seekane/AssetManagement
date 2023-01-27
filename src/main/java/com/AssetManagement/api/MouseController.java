package com.AssetManagement.api;

import com.AssetManagement.model.electronics.Monitor;
import com.AssetManagement.model.electronics.Mouse;
import com.AssetManagement.model.electronics.Tower;
import com.AssetManagement.service.MouseService.MouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("asset/electronics")
@RestController
public class MouseController {

    @Autowired
    private  MouseService mouseService;

    @PostMapping(path = "mouse")
    public void addMouse(@RequestBody @Valid Mouse mouse) {
        mouseService.addMouse(mouse);
    }


    @GetMapping(path = "mouse")
    public List<Mouse> getAllMices() {
        return mouseService.getAllMouse();
    }

    @DeleteMapping(path = "/mouse/{serial_number}")
    public void deleteMouseBySerialNo(@PathVariable("serial_number") String serial_number) {
        mouseService.deleteMouse(serial_number);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/mouse/{serial_number}")
    public void updateMouse(@PathVariable("serial_number") String serial_number, @Valid @NonNull @RequestBody Mouse mouse){
        mouseService.updateMouse(serial_number,mouse);
    }

}
