package com.neo.mytalker.activity;

import com.neo.mytalker.R;
import com.neo.mytalker.fragments.ChatBarFragment;
import com.neo.mytalker.fragments.ChatRecordFragment;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.v4.app.FragmentActivity;

public class ChatActivity extends FragmentActivity {
	public ChatRecordFragment mChatRecFrag;
	public ChatBarFragment mChatBarFrag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat);
		mChatRecFrag=new ChatRecordFragment(this);
		mChatBarFrag=new ChatBarFragment(this);
		SetFragment(R.id.chat_recordfrag, mChatRecFrag);
		SetFragment(R.id.chat_bottombarfrag,mChatBarFrag);
		
	}
	

	private void SetFragment(int content, Fragment frag) {
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		transaction.replace(content, frag);
		transaction.commit();
	}
}
