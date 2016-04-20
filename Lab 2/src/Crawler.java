/* --
COMP4321 Lab2 Exercise
Student Name:
Student ID:
Section:
Email:
*/
import java.util.Vector;
import java.util.Arrays;
import org.htmlparser.beans.StringBean;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import java.util.StringTokenizer;
import org.htmlparser.beans.LinkBean;
import java.net.URL;
import java.util.stream.Collectors;

public class Crawler
{
	private String url;
	Crawler(String _url)
	{
		url = _url;
	}

	public String extractPage() throws ParserException
	{
		// extract words in url and return them
		StringBean sb = new StringBean();
		sb.setLinks(false);
		sb.setURL(url);

//		return sb.getStrings() == null ? null : new Vector<String>(Arrays.asList(sb.getStrings().split("(\n)|| ")));
        return sb.getStrings() == null ? "" : sb.getStrings();
	}

	public Vector<String> extractLinks() throws ParserException
	{
		// extract links in url and return them
		// ADD YOUR CODES HERE
		LinkBean lb = new LinkBean();
		lb.setURL(url);
		return new Vector<String>(Arrays.stream(lb.getLinks()).map(URL::toString).collect(Collectors.toList()));
	}

	public static void main (String[] args)
	{
		try
		{
			Crawler crawler = new Crawler("http://www.seng.ust.hk");


//			Vector<String> words = crawler.extractPage();

//			System.out.println("Words in "+crawler.url+":");
//			for(int i = 0; i < words.size(); i++)
//				System.out.print(words.get(i)+" ");
//			System.out.println("\n\n");

            String words = crawler.extractPage();
            System.out.print(words);



			Vector<String> links = crawler.extractLinks();
			System.out.println("Links in "+crawler.url+":");
			for(int i = 0; i < links.size(); i++)
				System.out.println(links.get(i));
			System.out.println("");

		}
		catch (ParserException e)
        {
            e.printStackTrace ();
        }

	}
}
