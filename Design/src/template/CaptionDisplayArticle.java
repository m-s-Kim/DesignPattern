package template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
	
	public CaptionDisplayArticle(Article article) {
		super(article);
	}

	@Override
	protected void title() {
		System.out.println(article.getTitle());
	}

	@Override
	protected void content() {
		System.out.println("cap");
		ArrayList<String> content = article.getContent();
		int conLines = content.size();
		for(int i = 0; i< conLines; i++) {
			System.out.println("   "+content.get(i));
		}
		
	}

	@Override
	protected void footer() {
		System.out.println("Footer : "+article.getFooter());
		
	}
	
	
	
	
	

}
