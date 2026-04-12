package com.dac.ativ1_spring.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TbData")
public class ModelMongoDB {
    @Id
    @Getter
    private String id;
    @Getter
    private String code;
    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private Boolean confirmed;

    public ModelMongoDB() {}

    public ModelMongoDB(String code, String text, Boolean confirmed) {
        this.code = code;
        this.text = text;
        this.confirmed = confirmed;
    }

}
