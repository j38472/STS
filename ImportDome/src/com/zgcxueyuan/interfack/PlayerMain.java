package com.zgcxueyuan.interfack;

import java.util.Scanner;

public class PlayerMain {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		PlayerDome pd= new PlayerDome();
		System.out.println("«Î ‰»Î“Ù¿÷∏Ò Ω£®MP3£¨wav£©");
		String str =  sca.next();
		switch (str.toLowerCase()) {
		case "mp3":
			pd.playerMp3();
			break;
		case "wav":
			pd.playerMav();
			break;
		default:
			sca.close();
			break;
		}
	}
}
