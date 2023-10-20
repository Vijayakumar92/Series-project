package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.dao.SeriesDao;
import com.cg.model.SeriesModel;
import com.cg.repository.SeriesRepository;

@Service
public class SeriesService implements SeriesDao {

	@Autowired   
	private SeriesRepository srepository;
	
	List<SeriesModel> lseries=new ArrayList<SeriesModel>();
	
	
	public String addSeriesName(SeriesModel name) {
		lseries.add(name);
		return "Series added successfully";
		
	}

	public List<SeriesModel> getAllSerieses() {
	
		return lseries;
	}
	
	
}
