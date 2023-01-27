package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Tower;

import java.util.List;
import java.util.UUID;

public interface KeyboardRepository {

    int insertKeyboard(UUID id,Keyboard keyboard);
    default int insertKeyboard(Keyboard keyboard){
        UUID id= UUID.randomUUID();
        return insertKeyboard(id,keyboard);
    }

    List<Keyboard> selectAllKeyboards();

    int updateKeyBoardBySerialNumber(String serialNumber, Keyboard newKeyboard);

    int deleteKeyboardBySerialNumber(String serialNumber);
}
