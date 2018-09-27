package com.test.demo.article.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.test.demo.article.models.ArticleModel;
import com.test.demo.article.repostitory.ArticleRepository;

public abstract class ArticleServiceImpl implements ArticleService {

	private ArticleRepository articleRepository;
	
	@Autowired
	public ArticleServiceImpl(ArticleRepository articleRepository) {
		super();
		this.articleRepository = articleRepository;
	}

	@Override
	public List<ArticleModel> findByArticleAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ArticleModel> findByArticleName(String articleName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
