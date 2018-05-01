package com.yangkun.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.yangkun.TestApplication;
import com.yangkun.domain.Article;
import com.yangkun.domain.Comments;
import com.yangkun.service.ArticleService;
import com.yangkun.service.CommentsService;

public class TestArticle extends TestApplication{

	@Resource
	ArticleService articleService;
	
	@Resource
	CommentsService commentsService;
	
	@Test
	public void testGetArtile() {
		Article article = articleService.get(1);
		System.out.println(article);
	}
	
	@Test
	public void testGetComment() {
		Comments comments = commentsService.get(1);
		System.out.println(comments);
	}

}
