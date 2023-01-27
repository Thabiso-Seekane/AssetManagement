package com.AssetManagement.dao;

import com.AssetManagement.model.electronics.Mouse;

import java.util.List;
import java.util.UUID;

public interface MouseRepository {

    int insertMouse(UUID id, Mouse mouse);
    default int insertMouse(Mouse mouse) {
        UUID id = UUID.randomUUID();
        return insertMouse(id, mouse);
    }

    List<Mouse> selectAllMice();

    int updateMouse(Mouse newMouse, String serial_number);

    int deleteMouseBySerialNumber(String serialNumber);

}
