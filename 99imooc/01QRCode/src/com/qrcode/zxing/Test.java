package com.qrcode.zxing;

import java.io.File;
import java.nio.file.Path;

public class Test {

	public static void main(String[] args) {
		int width = 2000;
		int height = 2000;
		String content = "http://www.baidu.com";
		String format = "png";
		String fileName = ".\\testqrcode.png";
		
		Path path = new File(fileName).toPath();
		//"D:" + File.separator + "My Projects" + File.separator + "Java" + File.separator + "0Project" + File.separator + "99imooc" + File.separator + "01QRCode" + File.separator + "testqrcode.png"

		try {
			QRCodeCreater.writeToPath(content, format, path, width, height);
			System.out.println("生成二维码成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			QRCodeReader.readFromFile(fileName);
			System.out.println("读取二维码成功！");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
