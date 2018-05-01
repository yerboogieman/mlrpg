package com.dollarquest.rest;

import com.custsoft.rest.GenericRestService;
import com.dollarquest.model.Friend;
import com.dollarquest.service.FriendService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.Path;

@Component(name = "MLRPG Friend REST service",
		property = ("client=${parentArtifactId}"),
		service = FriendRestService.class)
@Path("/mlrpg")
public class FriendRestService extends GenericRestService<Friend, Long, FriendService> {

	@Reference
	private FriendService friendService;

	@Reference
	public void setFriendService(FriendService service) {
		super.setService(service);
	}

}