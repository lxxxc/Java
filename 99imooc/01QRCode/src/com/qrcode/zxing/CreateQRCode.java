/***********************************
 * Java生成二维码
 * 使用zxing生成二维码
 * CreateQRCode类：调用zxing中的函数生成二维码
***********************************/
package com.qrcode.zxing;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreateQRCode {
	
	private CreateQRCode() {};	//禁止生成实例
	
	public static void writeToPath(String content, String format, Path path, Integer width, Integer height) throws Exception {
		HashMap<EncodeHintType, Object> hints = new HashMap<>();
		//设置生成二维码参数
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		hints.put(EncodeHintType.MARGIN, 2);
		
		try {
			//生成二维码矩阵
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
			//由二维码矩阵生成图片
			MatrixToImageWriter.writeToPath(bitMatrix, format, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public static void main(String[] args) {
//		int width = 1500;
//		int height = 1500;
//		String format = "png";
//		String content = "Li Hao, MARRY ME!";
//		
//		HashMap<EncodeHintType, Object> hints = new HashMap<>();
//		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
//		hints.put(EncodeHintType.MARGIN, 2);
//
//		try {
//			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
//			Path file = new File("D:/My Projects/Java/0Project/99imooc/01QRCode/qrcode.png").toPath();
//			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
