package com.manny.day34_server_calc.controller;

import com.manny.day34_server_calc.data.MathRepository;
import com.manny.day34_server_calc.models.MathEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BaseController {

    @Autowired
    private MathRepository mathRepository;

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }

    //url: "/math/" + num1 + "/" + op + "/" + num2;
    @RequestMapping("/math/{num1}/{op}/{num2}")
    public String doMath(
            @PathVariable String num1,
            @PathVariable String op,
            @PathVariable String num2,
            ModelMap modelMap
    ){
        MathEntry newEntry = new MathEntry(num1, op, num2);
        //add thee above entry to our data list
        mathRepository.addEntry(newEntry);
        modelMap.put("entry", newEntry);
        return "last";
    }

    @RequestMapping("/log")
    public String getMath(ModelMap modelMap){
        modelMap.put("mathrepo", mathRepository.getAllEntries());
        return "log";
    }
}
