package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Service;

import com.cg.repository.SeriesRepository;

@Service
public class SeriesService {

	@Autowired
	private SeriesRepository srepository;
	
}
