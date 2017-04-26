package com.dc.blink.endpoints.controller;

import com.dc.blink.be.service.BlinkService;
import com.google.gson.Gson;

public class BlinkController {
	BlinkService service = new BlinkService();

	public String getAllBlinks(){
		return new Gson().toJson(service.getAllBlinks());
	}

	public Object getBlinkById(String id) {
		return new Gson().toJson(service.getBlink(Integer.parseInt(id)));
	}
}
