package template;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		String title = "톰과제리";
		
		
		ArrayList<String > content = new ArrayList<String>();
		
		content.add("ddddd");
		content.add("ddddd1");
		content.add("ddddd1");
		content.add("ddddd2");
		content.add("ddddd3");
		
		String footer = " 끝";
		
		Article article = new Article(title, content, footer);
		
		System.out.println("=============");
		DisplayArticleTemplate a = new SimpleDisplayArticle(article);
		a.display();
		System.out.println();
		
		DisplayArticleTemplate b = new CaptionDisplayArticle(article);
		b.display();
		
		
	}
}
