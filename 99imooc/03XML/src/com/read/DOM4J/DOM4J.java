package com.read.DOM4J;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.dom4j.Attribute;

public class DOM4J {
	/**
	 * ������
	 */
	public DOM4J() {

	}

	public void parse(String fileName) {
		// ����SAXReader�Ķ���
		SAXReader saxReader = new SAXReader();
		try {
			// ͨ��saxReader�����read��������books.xml�ļ�,��ȡdocuemnt����
			Document document = saxReader.read(new File(fileName));
			// ͨ��document�����ȡ���ڵ�bookstore
			Element bookStore = document.getRootElement();

			// ͨ��element�����elementIterator������ȡ������
			Iterator<Element> it = bookStore.elementIterator();
			// ��������������ȡ���ڵ��е���Ϣ���鼮��
			while (it.hasNext()) {
				System.out.println("=====��ʼ����ĳһ����=====");
				Element book = (Element) it.next();
				// ��ȡbook���������Լ�����ֵ
				List<Attribute> attributes = book.attributes();
				for (Attribute attribute : attributes) {
					System.out.println("��������" + attribute.getName() + "--����ֵ��" + attribute.getValue());
				}
				
				// ��ȡbook�Ľڵ����Լ��ڵ�ֵ
				Iterator<Element> itt = book.elementIterator();
				while (itt.hasNext()) {
					Element bookChild = (Element) itt.next();
					System.out.println("�ڵ�����" + bookChild.getName() + "--�ڵ�ֵ��" + bookChild.getStringValue());
				}

			}

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void testPerformance() throws Exception {
		String fileName = "books.xml";
		// ����DOM������:
		long start = System.currentTimeMillis();
		parse(fileName);
		System.out.print("���ܲ���: ");
		System.out.println("DOM4J:" + (System.currentTimeMillis() - start));
	}
}
