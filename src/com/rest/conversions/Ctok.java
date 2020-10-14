package com.rest.conversions;

/**
 * @author Charmaine de Beer
 * * Description: This program converts unit from Celcius to Kelvin.
 * Last updated: 14/10/2020
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/ctok")


public class Ctok {
	
	@GET
	@Produces("application/json")
	public Response convertCtok() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double celcius = 0.0;
		Double kelvin;
		kelvin = celcius + 273.15;
		jsonObject.put("C Value", celcius);
		jsonObject.put("K Value", kelvin);
 
		String result = "@Produces(\"application/json\") Output: \n\nC to K Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
 
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response convertCtoKfromInput(@PathParam("c") float c) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float kelvin;
		kelvin = c + 273.15F;
		jsonObject.put("C Value", c);
		jsonObject.put("K Value", kelvin);
 
		String result = "@Produces(\"application/json\") Output: \n\nC to K Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();	
	}
}
