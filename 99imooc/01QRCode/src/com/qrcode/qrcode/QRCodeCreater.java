package com.qrcode.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;


public class QRCodeCreater {

	private QRCodeCreater() {
	};

	public static void create(String content, File fileName) throws IOException {
		Qrcode x = new Qrcode();
		x.setQrcodeErrorCorrect('M'); // 纠错等级
		x.setQrcodeEncodeMode('B'); // N：数字，A：a-Z，B：其他字符
		x.setQrcodeVersion(10); // 版本

		int width = 67 + 12 * (x.getQrcodeVersion() - 1);
		int height = 67 + 12 * (x.getQrcodeVersion() - 1);

		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics2D gs = bufferedImage.createGraphics();
		gs.setBackground(Color.WHITE);
		gs.setColor(Color.BLACK);
		gs.clearRect(0, 0, width, height);

		int pixoff = 2;

		byte[] d = content.getBytes("gb2312");
		if (d.length > 0 && d.length < 120) {
			boolean[][] s = x.calQrcode(d);
			for (int i = 0; i < s.length; i++)
				for (int j = 0; j < s.length; j++) {
					if (s[j][i]) {
						gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
					}
				}
		}
		gs.dispose();
		bufferedImage.flush();

		ImageIO.write(bufferedImage, "png", fileName);
	}

}
