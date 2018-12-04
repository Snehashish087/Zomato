package com.zomato.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.logging.Logger;

public class Categories
{
	@Test
	public void verify_the_value()
	{
		//Response res = given().header("User-key", "c695a7633da355fb79bb09c87380000c").when().contentType(ContentType.JSON).get("https://developers.zomato.com/api/v2.1/categories").getBody();
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		System.out.println(resp.getBody());
	}

}


