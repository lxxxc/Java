package com.qrcode.zxing;

import java.io.File;
import java.nio.file.Path;

public class Test {

	public static void main(String[] args) {
		int width = 2000;
		int height = 2000;
		String content = "Java������ȫ";
		String format = "png";
		String fileName = ".\\testqrcode.png";
		
		Path path = new File(fileName).toPath();
		//"D:" + File.separator + "My Projects" + File.separator + "Java" + File.separator + "0Project" + File.separator + "99imooc" + File.separator + "01QRCode" + File.separator + "testqrcode.png"

		try {
			CreateQRCode.writeToPath(content, format, path, width, height);
			System.out.println("���ɶ�ά��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ReadQRCode.readFromFile(fileName);
			System.out.println("��ȡ��ά��ɹ���");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
