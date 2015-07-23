package com.capgemini.MathematicalOperations;

import org.json.JSONObject;

public class JsonEncodeDemo {

	public void encode(){
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("city", "Wroclaw");
		jsonObject.put("temperature", 32.5);
		jsonObject.put("pressure", 1015);
		
		System.out.println(jsonObject);
	}
	
	public static void main(String [] args){
		JsonEncodeDemo jsonEncodeDemo = new JsonEncodeDemo();
		jsonEncodeDemo.encode();
	}
}
