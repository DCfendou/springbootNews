package com.yangkun.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangkun.domain.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{

}
