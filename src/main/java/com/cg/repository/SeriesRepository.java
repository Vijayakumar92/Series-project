package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer>{

}
