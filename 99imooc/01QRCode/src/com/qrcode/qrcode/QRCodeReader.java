package com.qrcode.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.data.QRCodeImage;

class MyQRCodeImage implements QRCodeImage{

	BufferedImage bufferedImage;
	
	public MyQRCodeImage(BufferedImage bufferedImage){
		this.bufferedImage = bufferedImage;
	}
	
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bufferedImage.getHeight();
	}

	@Override
	public int getPixel(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return bufferedImage.getRGB(arg0, arg1);
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return bufferedImage.getWidth();
	}
	
}

public class QRCodeReader {
	private QRCodeReader() {};
	
	public static void read(File fileName) throws Exception{
		BufferedImage bufferedImage = ImageIO.read(fileName);
		
		QRCodeDecoder codeDecoder = new QRCodeDecoder();
		
		codeDecoder.decode(new MyQRCodeImage(bufferedImage));
		
		String result = new String(codeDecoder.decode(new MyQRCodeImage(bufferedImage)), "gb2312");
		System.out.println(result);
	}

}
