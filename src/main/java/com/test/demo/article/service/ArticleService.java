package com.test.demo.article.service;

import org.springframework.stereotype.Service;

import com.test.demo.article.repostitory.ArticleRepository;

@Service("articleService")
public interface ArticleService extends ArticleRepository {
	

}
