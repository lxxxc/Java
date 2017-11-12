package com.read.Test;

import com.read.DOM.DOM;
import com.read.SAX.SAX;
import com.read.JDOM.JDOM;

public class XMLReadTest {

	public static void main(String[] args) {
			String fileName = "books.xml";
			
			System.out.println("********************��ʼ��DOM��ʽ����XML�ļ�********************");
			DOM DOMParser = new DOM();
			DOMParser.parse(fileName);
			System.out.println("********************������DOM��ʽ����XML�ļ�********************");
			System.out.println();
			
			System.out.println("********************��ʼ��SAX��ʽ����XML�ļ�********************");
			SAX SAXParser = new SAX();
			SAXParser.parse(fileName);
			System.out.println("********************������SAX��ʽ����XML�ļ�********************");
			System.out.println();
			
			System.out.println("********************��ʼ��JDOM��ʽ����XML�ļ�********************");
			JDOM JDOMParser = new JDOM();
			JDOMParser.parse(fileName);
			System.out.println("********************������JDOM��ʽ����XML�ļ�********************");
	
	}

}
