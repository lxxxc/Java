package com.read.DOM;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
	/**
	 * ������
	 */
	public DOM() {
		
	}

	/**
	 * ����XML�ļ�
	 * 
	 * @param fileName: Ҫ������XML�ļ���
	 */
	public void parse(String fileName) {
		// ����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		try {
			// ����һ��DocumentBuilder�Ķ���
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// ͨ��DocumentBuilder�����parser��������books.xml�ļ�����ǰ��Ŀ��
			Document document = documentBuilder.parse(fileName);

			// ��ȡ����book�ڵ�ļ���
			NodeList bookList = document.getElementsByTagName("book");
			// ͨ��nodelist��getLength()�������Ի�ȡbookList�ĳ���
			System.out.println("һ����" + bookList.getLength() + "����");
			// ����ÿһ��book�ڵ�
			for (int i = 0; i < bookList.getLength(); i++) {
				System.out.println("=================���濪ʼ������" + (i + 1) + "���������=================");
				// ͨ�� item(i)���� ��ȡһ��book�ڵ㣬nodelist������ֵ��0��ʼ
				Node book = bookList.item(i);

				// ��ȡbook�ڵ���������Լ���
				NamedNodeMap attributes = book.getAttributes();
				System.out.println("�� " + (i + 1) + "���鹲��" + attributes.getLength() + "������");
				// ����book������
				for (int j = 0; j < attributes.getLength(); j++) {
					// ͨ��item(index)������ȡbook�ڵ��ĳһ������
					Node attribute = attributes.item(j);
					// ��ȡ������
					System.out.println("��������" + attribute.getNodeName());
					// ��ȡ����ֵ
					System.out.println("����ֵ: " + attribute.getNodeValue());
				}

//				 //ǰ�᣺�Ѿ�֪��book�ڵ�����ֻ����1��id����
//				 //��book�ڵ����ǿ������ת����ת����Element����
//				 Element book = (Element) bookList.item(i);
//				 //ͨ��getAttribute("id")������ȡ����ֵ
//				 String attrValue = book.getAttribute("id");
//				 System.out.println("id���Ե�����ֵΪ" + attrValue);

				// ����book�ڵ���ӽڵ�
				NodeList childNodes = book.getChildNodes();
				System.out.println("��" + (i + 1) + "���鹲��" + childNodes.getLength() + "���ӽڵ�");
				// ����childNodes��ȡÿ���ڵ�Ľڵ����ͽڵ�ֵ
				for (int k = 0; k < childNodes.getLength(); k++) {
					//���ֳ�text���͵�node�Լ�element���͵�node
					if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
						// ��ȡ��element���ͽڵ�Ľڵ���
						System.out.print("��" + (k + 1) + "���ڵ�Ľڵ�����" + childNodes.item(k).getNodeName());
						System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getFirstChild().getNodeValue());
//						System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getTextContent());
					}
				}
				System.out.println("======================����������" + (i + 1) + "���������=================");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
