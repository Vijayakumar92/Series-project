package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.SeriesService;

@RestController
public class SeriesController {
	
	@Autowired
	private SeriesService sservice;
	
	@PostMapping("/add")
	public String addSeries(@RequestBody Series name) {
		return sservice.addSeriesName(name);
		
	}
	
	public List<Series> gettAll(){
		return sservice.getAllSerieses();
		
	}
	

}
