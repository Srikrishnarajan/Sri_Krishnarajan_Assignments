package com.naveen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/helloworld")
public class Controller {
	@GET
	@Path("/rest/checkCard/{cardType}/{cardNo}")
	public String checkCard(@PathParam("cardType") String cardType, @PathParam("cardNo") String cardNo) {
		
		System.out.println(cardNo+" "+cardNo.length());
		
		switch(cardType) {
			case "enRoute":
				if(cardNo.length()==15) {
					int x= Integer.parseInt(cardNo.substring(0, 4));
					if(x==2014 || x==2149)
						return "Valid Card";
				}
			break;
			case "JCB":
				if(cardNo.length()>=16 && cardNo.length()<=19) {
					int x= Integer.parseInt(cardNo.substring(0, 4));
					if(x>=3528 && x<=3589)
						return "Valid Card";
				}
			break;
			case "Master Card":
				if(cardNo.length()==16) {
					if(cardNo.charAt(0)=='5' && cardNo.charAt(1)>='1' && cardNo.charAt(1)<='5') {
						int x= Integer.parseInt(cardNo.substring(0, 6));
						if(x>=510000 && x<=559999)
							return "Valid Card";
					}
					if(cardNo.charAt(0)=='2' && cardNo.charAt(1)>='2' && cardNo.charAt(1)<='7') {
						int x= Integer.parseInt(cardNo.substring(0, 6));
						if(x>=222100 && x<=272099)
							return "Valid Card";
					}
				}
			break;
			case "Visa":
				if(cardNo.length()>=16 && cardNo.length()<=19) {
					if(cardNo.charAt(0)=='4')
						return "Valid Card";
				}
			
		}
		return "Invalid Card";
	}
}
