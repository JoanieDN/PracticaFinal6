package com.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.boot.model.*;

public interface EspecialidadRepository extends CrudRepository<Especialidad, Long>  {

}
