package com.yangkun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yangkun.dao.ArticleDao;
import com.yangkun.domain.Article;
import com.yangkun.service.ArticleService;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{

	@Resource
	protected ArticleDao articleDao;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Article get(int id) {
		return articleDao.findOne(id);
	}

}
