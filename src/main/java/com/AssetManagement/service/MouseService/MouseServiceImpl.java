package com.AssetManagement.service.MouseService;

import com.AssetManagement.dao.MouseRepository;
import com.AssetManagement.model.electronics.Keyboard;
import com.AssetManagement.model.electronics.Mouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouseServiceImpl implements MouseService {

    @Autowired
    private MouseRepository mouseRepository;

    public int addMouse(Mouse mouse) {return mouseRepository.insertMouse(mouse);}

    public List<Mouse> getAllMouse(){return mouseRepository.selectAllMice();}

    public int  deleteMouse(String serialNumber )
    { return mouseRepository.deleteMouseBySerialNumber(serialNumber); }

    @Override
    public int updateMouse(String serial_number, Mouse newMouse) {
       return mouseRepository.updateMouse(newMouse, serial_number);
    }

}
