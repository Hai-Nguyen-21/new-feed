package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.News;

public interface INewDao extends GenericDao<News>{

	List<News> findByCategoryId(int categoryId);
	int save(News news);
	void delete(News news);
}
