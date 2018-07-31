package com.faac.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faac.sample.dao.ConfigurationDao;
import com.faac.sample.domain.Configuration;

@Controller
public class HelloController {
    
    @Autowired
    private ConfigurationDao configurationDao;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
    
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String select(ModelMap model) {
        List<Configuration> configurations = configurationDao.getAll();
        model.addAttribute("configurations", configurations);
        return "config";
    }
    
}
