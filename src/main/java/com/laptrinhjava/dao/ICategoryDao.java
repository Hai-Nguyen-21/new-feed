package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.Category;
import com.laptrinhjava.model.News;

public interface ICategoryDao extends GenericDao<Category>{
	List<Category> findAll();
}
