package com.dollarquest.service.impl.jpa;

import com.custsoft.service.impl.jpa.GenericJpaService;
import com.dollarquest.model.Friend;
import com.dollarquest.service.FriendService;

import javax.transaction.Transactional;

/**
 * Created by eric on 11/8/16.
 */
@Transactional
public class FriendJpaService extends GenericJpaService<Friend, Long> implements FriendService {

	public FriendJpaService() {
		super(Friend.class);
	}
}
