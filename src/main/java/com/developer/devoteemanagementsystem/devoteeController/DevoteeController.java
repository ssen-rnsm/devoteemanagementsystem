package com.developer.devoteemanagementsystem.devoteeController;

import com.developer.devoteemanagementsystem.devoteeService.DevoteeService;
import com.developer.devoteemanagementsystem.entity.DevoteeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public class DevoteeController {
    @Autowired
    private final DevoteeService devoteeService;

    public DevoteeController(DevoteeService devoteeService) {
        this.devoteeService = devoteeService;
    }

    @RequestMapping(method= RequestMethod.POST, value = "/devotee")
    public DevoteeEntity add(@RequestBody DevoteeEntity devoteeEntity){
        System.out.println("add devotee called...");
        return devoteeService.addDevotee(devoteeEntity);
    }
}
