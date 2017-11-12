package com.read.SAX;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.read.Test.Book;

public class SAXParserHandler extends DefaultHandler {
	String value = null;
	Book book = null;
	private ArrayList<Book> bookList = new ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	int bookIndex = 0;

	/**
	 * ������ʶ������ʼ
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("SAX������ʼ");
	}

	/**
	 * ������ʶ��������
	 */
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("SAX��������");
	}

	/**
	 * ����xmlԪ��
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// ����DefaultHandler���startElement����
		super.startElement(uri, localName, qName, attributes);
		//qName == book˵����book�ӽڵ�
		if (qName.equals("book")) {
			bookIndex++;
			// ����һ��book����
			book = new Book();
			// ��ʼ����bookԪ�ص�����
			System.out.println("======================��ʼ����ĳһ���������=================");
			// //��֪bookԪ�������Ե����ƣ������������ƻ�ȡ����ֵ
			// String value = attributes.getValue("id");
			// System.out.println("book������ֵ�ǣ�" + value);
			// ��֪��bookԪ�������Ե������Լ���������λ�ȡ�������Լ�����ֵ
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.print("bookԪ�صĵ�" + (i + 1) + "���������ǣ�" + attributes.getQName(i));
				System.out.println("---����ֵ�ǣ�" + attributes.getValue(i));
				if (attributes.getQName(i).equals("id")) {
					book.setId(attributes.getValue(i));
				}
			}
		} 
		//������book���ӽڵ�
		else if (!qName.equals("bookstore")) {
			System.out.print("�ڵ����ǣ�" + qName + "---");
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// ����DefaultHandler���endElement����
		super.endElement(uri, localName, qName);
		// �ж��Ƿ����һ�����Ѿ���������
		switch (qName) {
		case "book":	//book�ڵ㣬˵�������Ѿ�����
			bookList.add(book);
			book = null;
			System.out.println("======================��������ĳһ���������=================");
			break;
		case "name":	//name�ӽڵ㣬����name����
			book.setName(value);
			break;
		case "author":	//author�ӽڵ㣬����author����
			book.setAuthor(value);
			break;
		case "year":	//year�ӽڵ㣬����year����
			book.setYear(value);
			break;
		case "price":	//price�ӽڵ㣬����price����
			book.setPrice(value);
			break;
		case "language":	//language�ӽڵ㣬����language����
			book.setLanguage(value);
			break;
		default:
			break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println("�ڵ�ֵ�ǣ�" + value);
		}
	}
}
