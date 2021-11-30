package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Especialista;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialistaRepository extends MongoRepository <Especialista, String> { }