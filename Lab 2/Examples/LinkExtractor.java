// HTMLParser Library $Name: v1_6 $ - A java-based parser for HTML
// http://sourceforge.org/projects/htmlparser
// Copyright (C) 2012 Pengfei Zhao
//
//
package Lab;

import java.net.URL;
import java.util.Vector;
import org.htmlparser.beans.LinkBean;
import org.htmlparser.util.ParserException;

/**
 * LinkExtractor extracts all the links from the given webpage
 * and prints them on standard output.
 */


public class LinkExtractor
{
	private String link = "";
	public LinkExtractor(String url){
		link = url;
	}
	
	public void extractLinks() throws ParserException

	{
		// extract links in url and return them
		// ADD YOUR CODES HERE

	    Vector<String> v_link = new Vector<String>();
	    LinkBean lb = new LinkBean();
	    lb.setURL(link);
	    URL[] URL_array = lb.getLinks();
	    for(int i=0; i<URL_array.length; i++){
	    	System.out.println(URL_array[i]);
	    }
	}
	
    public static void main (String[] args) throws ParserException
    {
        String url = "http://www.cs.ust.hk/";
        LinkExtractor extractor = new LinkExtractor(url);
        extractor.extractLinks();
        
    }
}
