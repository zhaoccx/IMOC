package com.imoc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class JdomTest {
	private void createXML() {
		Element rss = new Element("rss");
		rss.setAttribute("version", "2.0");
		Document document = new Document(rss);
		XMLOutputter outputter = new XMLOutputter();
		try {
			outputter.output(document, new FileOutputStream("rssne.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new JdomTest().createXML();
	}
}
