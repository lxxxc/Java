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
	 * 用来标识解析开始
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("SAX解析开始");
	}

	/**
	 * 用来标识解析结束
	 */
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("SAX解析结束");
	}

	/**
	 * 解析xml元素
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// 调用DefaultHandler类的startElement方法
		super.startElement(uri, localName, qName, attributes);
		//qName == book说明是book子节点
		if (qName.equals("book")) {
			bookIndex++;
			// 创建一个book对象
			book = new Book();
			// 开始解析book元素的属性
			System.out.println("======================开始遍历某一本书的内容=================");
			// //已知book元素下属性的名称，根据属性名称获取属性值
			// String value = attributes.getValue("id");
			// System.out.println("book的属性值是：" + value);
			// 不知道book元素下属性的名称以及个数，如何获取属性名以及属性值
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.print("book元素的第" + (i + 1) + "个属性名是：" + attributes.getQName(i));
				System.out.println("---属性值是：" + attributes.getValue(i));
				if (attributes.getQName(i).equals("id")) {
					book.setId(attributes.getValue(i));
				}
			}
		} 
		//否则是book的子节点
		else if (!qName.equals("bookstore")) {
			System.out.print("节点名是：" + qName + "---");
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// 调用DefaultHandler类的endElement方法
		super.endElement(uri, localName, qName);
		// 判断是否针对一本书已经遍历结束
		switch (qName) {
		case "book":	//book节点，说明遍历已经结束
			bookList.add(book);
			book = null;
			System.out.println("======================结束遍历某一本书的内容=================");
			break;
		case "name":	//name子节点，设置name属性
			book.setName(value);
			break;
		case "author":	//author子节点，设置author属性
			book.setAuthor(value);
			break;
		case "year":	//year子节点，设置year属性
			book.setYear(value);
			break;
		case "price":	//price子节点，设置price属性
			book.setPrice(value);
			break;
		case "language":	//language子节点，设置language属性
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
			System.out.println("节点值是：" + value);
		}
	}
}
