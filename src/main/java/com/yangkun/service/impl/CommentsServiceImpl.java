package com.yangkun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yangkun.dao.ArticleDao;
import com.yangkun.dao.CommentsDao;
import com.yangkun.domain.Article;
import com.yangkun.domain.Comments;
import com.yangkun.service.ArticleService;
import com.yangkun.service.CommentsService;

@Service
@Transactional
public class CommentsServiceImpl implements CommentsService{

	@Resource
	protected CommentsDao commentsDao;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Comments get(int id) {
		return commentsDao.findOne(id);
	}

}
