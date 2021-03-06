package com.qrcode.zxing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRCodeReader {
	
	private QRCodeReader(){};
	
	public static void readFromFile(String fileName){
		try {
			MultiFormatReader formatReader = new MultiFormatReader();
			
			File file = new File(fileName);
			
			BufferedImage image = ImageIO.read(file);
			
			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
			
			Map<DecodeHintType, Object> hints = new HashMap<>();
			//设置生成二维码参数
			hints.put(DecodeHintType.CHARACTER_SET, "utf-8");

			Result result = formatReader.decode(binaryBitmap, hints);
			
			System.out.println("解析结果：" + result.toString());
			System.out.println("二维码格式：" + result.getBarcodeFormat());
			System.out.println("二维码文本内容：" + result.getText());
			
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
