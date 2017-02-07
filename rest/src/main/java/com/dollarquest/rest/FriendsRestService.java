package com.dollarquest.rest;

import com.custsoft.client.web.JsonResponse;
import com.dollarquest.model.Friend;
import com.dollarquest.service.FriendService;
import org.apache.aries.blueprint.annotation.Reference;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Collection;

import static com.custsoft.client.web.JsonResponse.Status.OK;
import static com.custsoft.client.web.JsonResponse.Status.SYSTEM_FAULT;

/**
 * Created by Eric Green on 11/9/16.
 */
@Path("/mlrpg")
public class FriendsRestService {

	@Reference
	private FriendService friendService;

	@GET
	@Produces("application/json")
	public JsonResponse findAll() {
		Collection<Friend> mlrpg = null;
		try {
			mlrpg = friendService.findAll();
		} catch (Exception ex) {
			return new JsonResponse(SYSTEM_FAULT).withMessage(ex.getMessage());
		}
		return new JsonResponse(OK).withData(mlrpg);
	}
	
	public void setFriendService(final FriendService friendService) {
		this.friendService = friendService;
	}
}
