package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.dao.SeriesDao;
import com.cg.repository.SeriesRepository;

@Service
public class SeriesService implements SeriesDao {

	@Autowired
	private SeriesRepository srepository;
	
	List<Series> lseries=new ArrayList<>();
	
	
	public String addSeriesName(Series name) {
		lseries.add(name);
		return "Series added successfully";
		
	}

	public List<Series> getAllSerieses() {
	
		return lseries;
	}
	
	
}
