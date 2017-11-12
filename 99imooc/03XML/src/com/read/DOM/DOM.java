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
	 * 构造器
	 */
	public DOM() {
		
	}

	/**
	 * 解析XML文件
	 * 
	 * @param fileName: 要解析的XML文件名
	 */
	public void parse(String fileName) {
		// 创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		try {
			// 创建一个DocumentBuilder的对象
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// 通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
			Document document = documentBuilder.parse(fileName);

			// 获取所有book节点的集合
			NodeList bookList = document.getElementsByTagName("book");
			// 通过nodelist的getLength()方法可以获取bookList的长度
			System.out.println("一共有" + bookList.getLength() + "本书");
			// 遍历每一个book节点
			for (int i = 0; i < bookList.getLength(); i++) {
				System.out.println("=================下面开始遍历第" + (i + 1) + "本书的内容=================");
				// 通过 item(i)方法 获取一个book节点，nodelist的索引值从0开始
				Node book = bookList.item(i);

				// 获取book节点的所有属性集合
				NamedNodeMap attributes = book.getAttributes();
				System.out.println("第 " + (i + 1) + "本书共有" + attributes.getLength() + "个属性");
				// 遍历book的属性
				for (int j = 0; j < attributes.getLength(); j++) {
					// 通过item(index)方法获取book节点的某一个属性
					Node attribute = attributes.item(j);
					// 获取属性名
					System.out.println("属性名：" + attribute.getNodeName());
					// 获取属性值
					System.out.println("属性值: " + attribute.getNodeValue());
				}

//				 //前提：已经知道book节点有且只能有1个id属性
//				 //将book节点进行强制类型转换，转换成Element类型
//				 Element book = (Element) bookList.item(i);
//				 //通过getAttribute("id")方法获取属性值
//				 String attrValue = book.getAttribute("id");
//				 System.out.println("id属性的属性值为" + attrValue);

				// 解析book节点的子节点
				NodeList childNodes = book.getChildNodes();
				System.out.println("第" + (i + 1) + "本书共有" + childNodes.getLength() + "个子节点");
				// 遍历childNodes获取每个节点的节点名和节点值
				for (int k = 0; k < childNodes.getLength(); k++) {
					//区分出text类型的node以及element类型的node
					if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
						// 获取了element类型节点的节点名
						System.out.print("第" + (k + 1) + "个节点的节点名：" + childNodes.item(k).getNodeName());
						System.out.println("--节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
//						System.out.println("--节点值是：" + childNodes.item(k).getTextContent());
					}
				}
				System.out.println("======================结束遍历第" + (i + 1) + "本书的内容=================");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
