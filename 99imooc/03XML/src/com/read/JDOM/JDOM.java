package com.read.JDOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.read.Test.Book;

public class JDOM {
	
	private static ArrayList<Book> booksList = new ArrayList<Book>();
	
	/**
	 * ������
	 */
	public JDOM() {
	}

	/**
	 * 
	 * @param fileName
	 */
	public void parse(String fileName) {
		// 1.����һ��SAXBuilder�Ķ���
		SAXBuilder saxBuilder = new SAXBuilder();
		try {
			// 2.����һ������������xml�ļ����ص��������в�ת��UTF-8�����ʽ
			InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
			// 3.ͨ��saxBuilder��build�����������������ص�saxBuilder��
			Document document = saxBuilder.build(isr);
			// 4.ͨ��document�����ȡxml�ļ��ĸ��ڵ�
			Element rootElement = document.getRootElement();
			// 5.��ȡ���ڵ��µ��ӽڵ��List����
			List<Element> bookList = rootElement.getChildren();

			// �������н����ӽڵ���Ϣ
			for (Element book : bookList) {
				Book bookEntity = new Book();
				System.out.println("======��ʼ������" + (bookList.indexOf(book) + 1) + "��======");

				// ����book�����Լ���
				List<Attribute> attributes = book.getAttributes();
				// //֪���ڵ�����������ʱ����ȡ�ڵ�ֵ
				// book.getAttributeValue("id");

				// ����attrList(��Բ����book�ڵ������Ե����ּ�����)
				for (Attribute attribute : attributes) {
					System.out.println("��������" + attribute.getName() + "----����ֵ��" + attribute.getValue());
					if ("id".equals(attribute.getName())) {
						bookEntity.setId(attribute.getValue());
					}
				}

				// ��book�ڵ���ӽڵ�Ľڵ����Լ��ڵ�ֵ�ı���
				List<Element> bookChilds = book.getChildren();
				for (Element child : bookChilds) {
					System.out.println("�ڵ�����" + child.getName() + "----�ڵ�ֵ��" + child.getValue());

					switch (child.getName()) {
					case "name":
						bookEntity.setName(child.getValue());
						break;
					case "author":
						bookEntity.setAuthor(child.getValue());
					case "year":
						bookEntity.setYear(child.getValue());
					case "price":
						bookEntity.setPrice(child.getValue());
					case "language":
						bookEntity.setLanguage(child.getValue());
					default:
						break;
					}
				}
				System.out.println("======����������" + (bookList.indexOf(book) + 1) + "��======");

				booksList.add(bookEntity);
				bookEntity = null;
				System.out.println(booksList.size());
				System.out.println("id = " + booksList.get(bookList.indexOf(book)).getId());
				System.out.println("name = " + booksList.get(bookList.indexOf(book)).getName());
				System.out.println("author = " + booksList.get(bookList.indexOf(book)).getAuthor());
				System.out.println("year = " + booksList.get(bookList.indexOf(book)).getYear());
				System.out.println("price = " + booksList.get(bookList.indexOf(book)).getYear());
				System.out.println("language = " + booksList.get(bookList.indexOf(book)).getLanguage());
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
