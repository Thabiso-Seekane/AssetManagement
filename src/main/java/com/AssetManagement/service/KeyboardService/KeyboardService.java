package com.AssetManagement.service.KeyboardService;

import com.AssetManagement.model.electronics.Keyboard;

import java.util.List;

public interface KeyboardService {
    int addKeyboard(Keyboard keyboard);

    List<Keyboard> getAllKeyboard();

    Keyboard get(String serial_number);

    int deleteKeyboard(String serial_number);

    int updateKeyboard(String serial_number, Keyboard newKeyboard);
}
