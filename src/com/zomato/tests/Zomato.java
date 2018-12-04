package com.zomato.tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Zomato
{
	public static void main(String[] args)
	{
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		System.out.println(resp.getBody());
	}
}
