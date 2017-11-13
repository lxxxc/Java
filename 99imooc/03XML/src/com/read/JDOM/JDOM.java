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
import org.junit.Test;

import com.read.Test.Book;

public class JDOM {
	
	private static ArrayList<Book> booksList = new ArrayList<Book>();
	
	/**
	 * 构造器
	 */
	public JDOM() {
	}

	/**
	 * 
	 * @param fileName
	 */
	public void parse(String fileName) {
		// 1.创建一个SAXBuilder的对象
		SAXBuilder saxBuilder = new SAXBuilder();
		try {
			// 2.创建一个输入流，将xml文件加载到输入流中并转成UTF-8编码格式
			InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
			// 3.通过saxBuilder的build方法，将输入流加载到saxBuilder中
			Document document = saxBuilder.build(isr);
			// 4.通过document对象获取xml文件的根节点
			Element rootElement = document.getRootElement();
			// 5.获取根节点下的子节点的List集合
			List<Element> bookList = rootElement.getChildren();

			// 继续进行解析子节点信息
			for (Element book : bookList) {
				Book bookEntity = new Book();
				System.out.println("======开始解析第" + (bookList.indexOf(book) + 1) + "书======");

				// 解析book的属性集合
				List<Attribute> attributes = book.getAttributes();
				// //知道节点下属性名称时，获取节点值
				// book.getAttributeValue("id");

				// 遍历attrList(针对不清楚book节点下属性的名字及数量)
				for (Attribute attribute : attributes) {
					System.out.println("属性名：" + attribute.getName() + "----属性值：" + attribute.getValue());
					if ("id".equals(attribute.getName())) {
						bookEntity.setId(attribute.getValue());
					}
				}

				// 对book节点的子节点的节点名以及节点值的遍历
				List<Element> bookChilds = book.getChildren();
				for (Element child : bookChilds) {
					System.out.println("节点名：" + child.getName() + "----节点值：" + child.getValue());

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
				System.out.println("======结束解析第" + (bookList.indexOf(book) + 1) + "书======");

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
	
	@Test
	public void testPerformance() throws Exception {
		String fileName = "books.xml";
		// 测试DOM的性能:
		long start = System.currentTimeMillis();
		parse(fileName);
		System.out.print("性能测试: ");
		System.out.println("JDOM:" + (System.currentTimeMillis() - start));
	}
}
