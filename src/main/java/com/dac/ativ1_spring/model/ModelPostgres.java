package com.dac.ativ1_spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_data")
public class ModelPostgres {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private Boolean confirmed;

    public ModelPostgres() {}

    public ModelPostgres(String code, String text, Boolean confirmed) {
        this.code = code;
        this.text = text;
        this.confirmed = confirmed;
    }

}
