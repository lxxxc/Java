package com.qrcode.qrcode;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		String content = "http://lxxxc.github.io";
		File fileName = new File(".\\testqrcode.png");

		try {
			QRCodeCreater.create(content, fileName);
			System.out.println("���ɶ�ά��ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			QRCodeReader.read(fileName);
			System.out.println("��ȡ��ά��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}