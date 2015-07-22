package com.capgemini.StarterKit;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupLibrary {

	public String getWebsiteTitle(String url) {

		Document doc = null;
		try {

			// get http protocol
			doc = Jsoup.connect(url).get();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc.title();
	}
}