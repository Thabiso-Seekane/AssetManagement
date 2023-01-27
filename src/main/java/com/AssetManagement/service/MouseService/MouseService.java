package com.AssetManagement.service.MouseService;

import com.AssetManagement.model.electronics.Mouse;
import com.AssetManagement.model.electronics.Tower;

import java.util.List;

public interface MouseService {
    int addMouse(Mouse mouse);

    List<Mouse> getAllMouse();

    int deleteMouse(String serial_number);

    int updateMouse(String serial_number, Mouse newMouse);
}
