package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.SeriesService;

@RestController
public class SeriesController {
	
	@Autowired
	private SeriesService sservice;

}
