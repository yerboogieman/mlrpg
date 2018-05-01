package com.dollarquest.service.impl.jpa;

import com.custsoft.service.impl.jpa.GenericJpaService;
import com.dollarquest.model.Friend;
import com.dollarquest.service.FriendService;
import org.apache.aries.jpa.template.JpaTemplate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Created by eric on 11/8/16.
 */
@Component(name = "MLRPG Friend service",
		property = {"client=mlrpg"},
		service = FriendService.class)
public class FriendJpaService extends GenericJpaService<Friend, Long> implements FriendService {

	public FriendJpaService() {
		super(Friend.class);
	}

	@Override
	@Reference(target = "(osgi.unit.name=mlrpg)")
	public void setJpa(JpaTemplate jpa) {
		this.jpa = jpa;
	}

}
