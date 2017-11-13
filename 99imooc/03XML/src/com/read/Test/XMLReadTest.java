package com.read.Test;

import com.read.DOM.DOM;
import com.read.DOM4J.DOM4J;
import com.read.SAX.SAX;
import com.read.JDOM.JDOM;

public class XMLReadTest {

	public static void main(String[] args) {
			String fileName = "books.xml";
			
			System.out.println("********************开始以DOM方式解析XML文件********************");
			DOM DOMParser = new DOM();
			DOMParser.parse(fileName);
			System.out.println("********************结束以DOM方式解析XML文件********************");
			System.out.println();
			
			System.out.println("********************开始以SAX方式解析XML文件********************");
			SAX SAXParser = new SAX();
			SAXParser.parse(fileName);
			System.out.println("********************结束以SAX方式解析XML文件********************");
			System.out.println();
			
			System.out.println("********************开始以JDOM方式解析XML文件********************");
			JDOM JDOMParser = new JDOM();
			JDOMParser.parse(fileName);
			System.out.println("********************结束以JDOM方式解析XML文件********************");
			System.out.println();
			
			System.out.println("********************开始以DOM4J方式解析XML文件********************");
			DOM4J DOM4JParser = new DOM4J();
			DOM4JParser.parse(fileName);
			System.out.println("********************结束以DOM4J方式解析XML文件********************");
	}

}
