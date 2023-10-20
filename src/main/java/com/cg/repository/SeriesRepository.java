package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.model.SeriesModel;

@Repository
public interface SeriesRepository extends JpaRepository<SeriesModel, Integer>{

}
