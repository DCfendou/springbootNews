package com.yangkun.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangkun.domain.Article;
import com.yangkun.domain.Comments;

public interface CommentsDao extends JpaRepository<Comments, Integer>{

}
