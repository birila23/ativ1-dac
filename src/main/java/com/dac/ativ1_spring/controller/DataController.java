package com.dac.ativ1_spring.controller;

import com.dac.ativ1_spring.model.ModelPostgres;
import com.dac.ativ1_spring.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataService dataService;

    @PostMapping
    public String save(@RequestBody ModelPostgres request) {
        dataService.saveData(
                request.getCode(),
                request.getText(),
                request.getConfirmed()
        );
        return "Dados salvos com sucesso nos dois bancos";
    }

}
