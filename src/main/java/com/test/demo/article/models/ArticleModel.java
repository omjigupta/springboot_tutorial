package com.test.demo.article.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author omji
 *
 */
@Getter
@Setter
@Document(collection = "articles")
public class ArticleModel {
	
	@Id
	private String id;
	private String articleName;
	private String articleAuthor;
	private String description;

}
