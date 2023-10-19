package com.cg.dao;

import java.util.List;

import org.springframework.http.HttpStatus.Series;

public interface SeriesDao {
	public String addSeriesName(Series name);
	public List<Series> getAllSerieses();

}
