package com.laptrinhjava.service;

import java.util.List;

import com.laptrinhjava.model.News;

public interface INewService {
	List<News> findByCategoryId(int categoryId);
	News save(News news);
}
