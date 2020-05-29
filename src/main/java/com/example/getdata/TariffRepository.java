package com.example.getdata;

import org.springframework.data.repository.CrudRepository;
import com.example.getdata.Tariff;

public interface TariffRepository extends CrudRepository<Tariff, Integer>{
    
}