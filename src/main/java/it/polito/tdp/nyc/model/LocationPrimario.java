package it.polito.tdp.nyc.model;

import java.util.List;

import com.javadocmd.simplelatlng.LatLng;


// in questa classe ho piu location ognuna con lat lng diversa, nella classe Locaction faro una lista di latlng per ogni location 
public class LocationPrimario {
	private String location; 
	private LatLng coordinate;
	
	public LocationPrimario(String location, LatLng coordinate) {
		super();
		this.location = location;
		this.coordinate = coordinate;
	}

	public String getLocation() {
		return location;
	}

	public LatLng getCoordinate() {
		return coordinate;
	}  
	
	
	
	

}
