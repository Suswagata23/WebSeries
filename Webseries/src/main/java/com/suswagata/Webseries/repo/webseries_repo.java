package com.suswagata.Webseries.repo;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.suswagata.Webseries.model.series;

public interface webseries_repo extends CrudRepository<series, Integer>{
	Optional<series> findByName(String name);
}
