package com.rest.conversions;

/**
 * @author Charmaine de Beer
 * * Description: This program converts unit from Kelvin to Celcius.
 * Last updated: 14/10/2020
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ktoc")

public class Ktoc {
	@GET
	@Produces("application/xml")
	public String convertKtoc() {
 
		Double celcius;
		Double kelvin = 0.0;
		celcius = kelvin - 273.15;
 
		String result = "@Produces(\"application/xml\") Output: \n\nK to C Converter Output: \n\n" + celcius;
		return "<ktofservice>" + "<kelvin>" + kelvin + "</kelvin>" + "<ktofoutput>" + result + "</ktocoutput>" + "</ktoc>";
	}
 
	@Path("{k}")
	@GET
	@Produces("application/xml")
	public String convertKtoCfromInput(@PathParam("k") Double k) {
		Double celcius;
		Double kelvin = k;
		celcius = kelvin - 273.15;
 
		String result = "@Produces(\"application/xml\") Output: \n\nK to C Converter Output: \n\n" + celcius;
		return "<ktoc>" + "<kelvin>" + kelvin + "</kelvin>" + "<ktocoutput>" + result + "</ktocoutput>" + "</ktoc>";
	}

}
