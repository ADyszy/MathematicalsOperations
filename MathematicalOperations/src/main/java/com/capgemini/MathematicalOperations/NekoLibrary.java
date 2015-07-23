package com.capgemini.MathematicalOperations;

import org.cyberneko.html.parsers.DOMParser;
import org.xml.sax.InputSource;
import org.w3c.dom.*;

public class NekoLibrary {

	public static String getTypeOfNode(){
		DOMParser parser = new DOMParser();
		InputSource url = new InputSource("https://www.google.de");
		Document document = null;
		
		try {
		    parser.parse(url);
		    document = parser.getDocument();
				    
		} catch(Exception e) {
		    e.printStackTrace();
		}
	    return document.getNodeName();	
	}
	
}
