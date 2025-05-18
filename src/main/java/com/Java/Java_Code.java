package com.Java;


	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.select.Elements;

	public class Java_Code {
	    public static void main(String[] args) throws Exception {
	        String url = "https://www.worldometers.info/world-population/";

	        int count = 1;
	        while (count <= 20) {
	            System.out.println(count + " sec");

	            Document doc = Jsoup.connect(url).get();

	            // Current Population
	            Elements currentPop = doc.select("div.maincounter-number span.rts-counter");
	            System.out.println("--------- Current Population ---------");
	            currentPop.forEach(e -> System.out.println(e.text()));

	            // Today and This Year
	            System.out.println("--------- Today and This Year ---------");
	            Elements todayThisYear = doc.select("div:containsOwn(Today), div:containsOwn(This year)");
	            todayThisYear.forEach(div -> {
	                Elements spans = div.parent().select("span.rts-counter");
	                spans.forEach(e -> System.out.println(e.text()));
	            });

	            System.out.println("======================================");

	            Thread.sleep(1000);
	            count++;
	        }
	    


	}

}
