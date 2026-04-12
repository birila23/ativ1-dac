package com.dac.ativ1_spring.repository;

import com.dac.ativ1_spring.model.ModelPostgres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataPostgresRepository extends JpaRepository<ModelPostgres, Long> {

}
