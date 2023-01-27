package com.AssetManagement.api;

import com.AssetManagement.model.electronics.Electronics;
import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Tower;
import com.AssetManagement.service.KeyboardService.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("asset/electronics")
@RestController
public class KeyboardController {

    @Autowired
    private KeyboardService keyboardService;

    @PostMapping(path = "keyboard")
    public void addKeyboard(@RequestBody @Valid Keyboard keyboard) {
        keyboardService.addKeyboard(keyboard);
    }


    @GetMapping(path = "keyboard")
    public List<Keyboard> getAllKeyboard() {
        return keyboardService.getAllKeyboard();
    }


    @DeleteMapping(path = "/keyboard/{serial_number}")
    public void deleteKeyboardBySerialNo(@PathVariable("serial_number") String serial_number) {
        keyboardService.deleteKeyboard(serial_number);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/keyboard/{serial_number}")
    public void updateKeyboard(@PathVariable("serial_number") String serial_number,@Valid @NonNull @RequestBody Keyboard keyboard){
         keyboardService.updateKeyboard(serial_number,keyboard);
    }
}
