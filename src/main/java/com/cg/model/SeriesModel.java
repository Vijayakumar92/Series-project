package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class SeriesModel {
	@Id
	private int seriesId;
	private String seriesName;
	private String genre;
	
	public SeriesModel() {
		
	}

	public SeriesModel(int seriesId, String seriesName, String genre) {
		super();
		this.seriesId = seriesId;
		this.seriesName = seriesName;
		this.genre = genre;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "SeriesModel [seriesId=" + seriesId + ", seriesName=" + seriesName + ", genre=" + genre + "]";
	}
	

}
