package com.zgcxueyuan.interfack;

public class PlayerDome implements Player {

	@Override
	public void playerMav() {
		System.out.println("这个是mav 格式的");
	}

	@Override
	public void playerMp3() {
		System.out.println("这个是MP3格式的");
	}

}
