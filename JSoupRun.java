//Vincent Macri
//CS 176L
//Fangraphs Scraper

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupRun {

	public static void main(String[] args) throws IOException {
		Document doc2023 = Jsoup.connect("https://www.fangraphs.com/leaders/major-league?pos=all&stats=bat&lg=all&qual=y&type=8&season=2023&month=0&season1=2023&ind=0&sortcol=12&sortdir=default&pagenum=1&pageitems=200")
				.timeout(10000).get();
		Elements table2023 = doc2023.select("div.table-fixed");
//		Elements body2023 = doc2023.select("tbody");
		System.out.println(table2023);
//		System.out.println(table2023.select("tr").size());
//		for(Element e : table2023.select("tr")){
//			System.out.println(e);
//		}
	}

}

