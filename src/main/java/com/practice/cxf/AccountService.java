package com.practice.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/accounts")
public class AccountService {

	@GET
	@Path("/get")
	@Produces("text/plain")
	public boolean isDatasourcePresent(){
		return true;
	}
}
