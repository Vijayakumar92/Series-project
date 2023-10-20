package com.cg.dao;

import java.util.List;

import org.springframework.http.HttpStatus.Series;

import com.cg.model.SeriesModel;

public interface SeriesDao {
	public String addSeriesName(SeriesModel name);
	public List<SeriesModel> getAllSerieses();

}
