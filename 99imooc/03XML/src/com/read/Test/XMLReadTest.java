package com.read.Test;

import com.read.DOM.DOM;
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
	
	}

}
