package com.AssetManagement.service.KeyboardService;

import com.AssetManagement.dao.KeyboardRepository;
import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Tower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardServiceImpl implements KeyboardService {

    @Autowired
    private KeyboardRepository keyboardRepository;

    public int addKeyboard(Keyboard keyboard) { return keyboardRepository.insertKeyboard(keyboard);}

    public List<Keyboard> getAllKeyboard(){return  keyboardRepository.selectAllKeyboards();}

    public int updateKeyboard(String serialNumber, Keyboard newKeyboard) {
        return keyboardRepository.updateKeyBoardBySerialNumber(serialNumber, newKeyboard);
    }

    public int deleteKeyboard(String serialNumber ) {
        return keyboardRepository.deleteKeyboardBySerialNumber(serialNumber);
    }

    public Keyboard get(String serial_number) {
        return null;
    }

}
