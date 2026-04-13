package com.dac.ativ1_spring.service;

import com.dac.ativ1_spring.model.ModelMongoDB;
import com.dac.ativ1_spring.model.ModelPostgres;
import com.dac.ativ1_spring.repository.DataMongoRepository;
import com.dac.ativ1_spring.repository.DataPostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataPostgresRepository postgresRepository;

    @Autowired
    private DataMongoRepository mongoRepository;

    public void saveData(String code, String text, Boolean confirmed) {

        ModelPostgres entity = new ModelPostgres(code, text, confirmed);
        postgresRepository.save(entity);

        ModelMongoDB document = new ModelMongoDB(code, text, confirmed);
        mongoRepository.save(document);
        System.out.println("SALVANDO NO MONGO...");
    }
}
