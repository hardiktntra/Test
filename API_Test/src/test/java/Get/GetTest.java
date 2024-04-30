package Get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {
@Test
	public void get_test()
	{
	//	Response response = RestAssured.get("https://republicfinance--qaph2.sandbox.lightning.force.com/lightning/r/Account/0017g00001fAYPVAA4/view");
		//System.out.println("Response code:- " +response.getStatusCode());
	//	System.out.println("Response Time:- " +response.getTime());	



		for(int i=0;i<1;i++)
		{
		Response responsee = RestAssured.get("https://reqres.in/api/users/23");
		Response res = RestAssured.post("https://reqres.in/api/users");
			System.out.println("Responsee code:- " +responsee.getStatusCode());
			System.out.println("Responsee Time:- " +responsee.getTime());
			
		
			System.out.println("Responsee code:- " +res.getStatusCode());
		}
		
		
	}
}
