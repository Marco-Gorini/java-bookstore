package com.soprasteria;

public class Libro {
	public static void main(String[] args) {
		String linkToAmazonSite = "https://www.amazon.it/compagnia-dellanello-Signore-degli-anelli/dp/8830105260/ref=sr_1_1?keywords=il+signore+degli+anelli+libro&qid=1664891005&qu=eyJxc2MiOiIzLjYyIiwicXNhIjoiMy4wNSIsInFzcCI6IjIuNTMifQ%3D%3D&sr=8-1";
		String title = "La compagnia dell'anello: Vol.1";
		boolean flexible = true;
		String author = "John Ronald Reuel Tolkien";
		String translator = "Ottavio Fatica";
		float avgReviews = 4.3f;
		float price = 16.0f;
		String description = "Composto da tre romanzi pubblicati in Gran Bretagna fra il 1954 e il 1955, Il Signore degli Anelli è uno dei più grandi cicli narrativi del XX secolo. J.R.R. Tolkien ha creato un mondo e un epos che da sempre affascinano e influenzano lettori e scrittori di tutto il mondo. La Compagnia dell'Anello si apre nella Contea, un idilliaco paese agricolo dove vivono gli Hobbit, piccoli esseri lieti, saggi e longevi. La quiete è turbata dall'arrivo dello stregone Gandalf, che convince Frodo a partire per il paese delle tenebre, Mordor, dove dovrà gettare nelle fiamme del Monte Fato il terribile Anello del Potere, giunto nelle sue mani per una serie di incredibili circostanze. Un gruppo di hobbit lo accompagna e strada facendo si aggiungono alla banda l'elfo, il nano e alcuni uomini, tutti uniti nella lotta contro il Male. La Compagnia affronta un cammino lungo e pericoloso, finché i suoi membri si disperdono, minacciati da forze oscure, mentre la meta sembra allontanarsi sempre di più.";
		String language = "Italian";
		int numberOfPages = 606;
		boolean available = true;
		float priceForPage = price / numberOfPages;
		float priceWithDiscount = (price*95)/100;
		
		System.out.println("Amazon Link: "+ linkToAmazonSite);
		System.out.println("Title: " + title);
		System.out.println("Flexible? " + flexible);
		System.out.println("Author: " + author);
		System.out.println("Translator: " + translator);
		System.out.println("Avarage of Reviws: " + avgReviews);
		System.out.println("Original Price: " + price);
		System.out.println("Discoutned Price: " + priceWithDiscount);
		System.out.println("Language: " + language);
		System.out.println("Number of Pages: " + numberOfPages);
		System.out.println("Is it available? " + available);
		System.out.println("Price for page: " + priceForPage);
		System.out.println("Descritpion: " + description);
	}
}
		
