package com.zeljko.earthquakes2.controller;

import com.zeljko.earthquakes2.domain.Quake;
import com.zeljko.earthquakes2.domain.QuakeList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class QuakeController {

	@RequestMapping("/")
	public List<Quake> list(){
    	RestTemplate restTemplate = new RestTemplate();
    	QuakeList response = restTemplate.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/query?minmag=5&format=geojson&limit=10", QuakeList.class);
		assert response != null;
		return response.getFeatures();
	}
	
}
