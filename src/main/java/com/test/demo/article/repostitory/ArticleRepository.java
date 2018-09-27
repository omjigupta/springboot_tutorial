package com.test.demo.article.repostitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.article.models.ArticleModel;

@Repository("articleRepository")
public interface ArticleRepository extends MongoRepository<ArticleModel, String>{
	
	
	List<ArticleModel> findByArticleAuthor(String author);
	
	Optional<ArticleModel> findByArticleName(String articleName);
	

}
