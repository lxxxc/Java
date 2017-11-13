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
	 * 构造器
	 */
	public DOM4J() {

	}

	public void parse(String fileName) {
		// 创建SAXReader的对象
		SAXReader saxReader = new SAXReader();
		try {
			// 通过saxReader对象的read方法加载books.xml文件,获取docuemnt对象
			Document document = saxReader.read(new File(fileName));
			// 通过document对象获取根节点bookstore
			Element bookStore = document.getRootElement();

			// 通过element对象的elementIterator方法获取迭代器
			Iterator<Element> it = bookStore.elementIterator();
			// 遍历迭代器，获取根节点中的信息（书籍）
			while (it.hasNext()) {
				System.out.println("=====开始遍历某一本书=====");
				Element book = (Element) it.next();
				// 获取book的属性名以及属性值
				List<Attribute> attributes = book.attributes();
				for (Attribute attribute : attributes) {
					System.out.println("属性名：" + attribute.getName() + "--属性值：" + attribute.getValue());
				}
				
				// 获取book的节点名以及节点值
				Iterator<Element> itt = book.elementIterator();
				while (itt.hasNext()) {
					Element bookChild = (Element) itt.next();
					System.out.println("节点名：" + bookChild.getName() + "--节点值：" + bookChild.getStringValue());
				}

			}

		} catch (DocumentException e) {
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
		System.out.println("DOM4J:" + (System.currentTimeMillis() - start));
	}
}
