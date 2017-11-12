package com.read.SAX;

import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.read.Test.Book;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class SAX {

	/**
	 * ������
	 */
	public SAX() {
	}

	public void parse(String fileName) {
		// ����һ��SAXParserFactory�Ķ���
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			// ����һ��SAXParser�Ķ���
			SAXParser parser = factory.newSAXParser();
			// ����һ��SAXParserHandler�Ķ���
			SAXParserHandler handler = new SAXParserHandler();

			parser.parse(fileName, handler);
			System.out.println("���Book���е����ݣ�����" + handler.getBookList().size()  + "����");
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

}
