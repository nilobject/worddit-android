package com.reddit.worddit.commands;

import com.reddit.worddit.R;
import com.reddit.worddit.WordditHome;

public class UserFriends extends ClientCommand {
	/**
	 * Returns a list of the friends of the user invoking the call<br>
	 * <br>
	 * Required args: none
	 */
	public UserFriends() {
		super();

		mCommandType = CommandType.GET;
		
		URI = WordditHome.GetApplicationContext().getString(R.string.worddit_server) + "/user/friends";
	}
}