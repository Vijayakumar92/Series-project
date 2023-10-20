package com.cg.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.SeriesModel;
import com.cg.service.SeriesService;

@RestController
@RequestMapping("/seriesapi")
public class SeriesController {
	
	@Autowired
	private SeriesService sservice;
	
	@PostMapping("/add")
	public String addSeries(@RequestBody SeriesModel name) {
		return sservice.addSeriesName(name);
		
	}
	@GetMapping("/get")
	public List<SeriesModel> gettAll(){
		return sservice.getAllSerieses();
		
	}
	

}
