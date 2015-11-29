package com.imooc.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {
	public DocumentBuilder getDocumentBuilder() {
		// 创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 创建DocumentBuilder对象
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return db;
	}

	/**
	 * 生成xml
	 */
	public void createXML() {
		DocumentBuilder db = getDocumentBuilder();
		Document document = db.newDocument();
		document.setXmlStandalone(true);
		Element bookstore = document.createElement("bookStore");
		// 向bookstore根节点中添加子节点book
		document.appendChild(bookstore);
		Element book = document.createElement("book");
		book.setAttribute("id", "1");
		bookstore.appendChild(book);
		Element name = document.createElement("name");
		book.appendChild(name);
		name.setTextContent("小王子");
		Element year = document.createElement("year");
		book.appendChild(year);
		year.setTextContent("2015");
		Element age = document.createElement("age");
		age.setTextContent(45 + "");
		book.appendChild(age);
		Element address = document.createElement("address");
		address.setTextContent("深圳市宝安区");
		book.appendChild(address);
		Element book2 = document.createElement("book");
		book2.setAttribute("id", "2");
		bookstore.appendChild(book2);
		Element name2 = document.createElement("name");
		book2.appendChild(name2);
		name2.setTextContent("小王子");
		Element year2 = document.createElement("year");
		book2.appendChild(year2);
		year2.setTextContent("2015");
		Element age2 = document.createElement("age");
		age2.setTextContent(45 + "");
		book2.appendChild(age2);
		Element address2 = document.createElement("address");
		address2.setTextContent("深圳市宝安区");
		book2.appendChild(address2);
		// 创建TransformerFactory对象
		TransformerFactory tff = TransformerFactory.newInstance();
		try {
			// 创建Transformer对象
			Transformer tf = tff.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.transform(new DOMSource(document), new StreamResult(new File("books1forupdate.xml")));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CreateXML creatXml = new CreateXML();
		creatXml.createXML();
	}
}
