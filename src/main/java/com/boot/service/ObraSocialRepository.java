package com.boot.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.model.*;


public interface ObraSocialRepository extends CrudRepository<ObraSocial, Long>  {

}
