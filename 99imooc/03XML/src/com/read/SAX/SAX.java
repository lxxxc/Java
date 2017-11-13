package com.read.SAX;

import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.read.Test.Book;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class SAX {

	/**
	 * 构造器
	 */
	public SAX() {
	}

	public void parse(String fileName) {
		// 创建一个SAXParserFactory的对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			// 创建一个SAXParser的对象
			SAXParser parser = factory.newSAXParser();
			// 创建一个SAXParserHandler的对象
			SAXParserHandler handler = new SAXParserHandler();

			parser.parse(fileName, handler);
			System.out.println("输出Book类中的内容，共有" + handler.getBookList().size()  + "本书");
			for (Book book : handler.getBookList()) {
				System.out.println("id = " + book.getId());
				System.out.println("name = " + book.getName());
				System.out.println("author = " + book.getAuthor());
				System.out.println("year = " + book.getYear());
				System.out.println("price = " + book.getPrice());
				System.out.println("language = " + book.getLanguage());
				System.out.println("----finish----");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testPerformance() throws Exception {
		String fileName = "books.xml";
		// 测试DOM的性能:
		long start = System.currentTimeMillis();
		parse(fileName);
		System.out.print("性能测试: ");
		System.out.println("SAX:" + (System.currentTimeMillis() - start));
	}
}
