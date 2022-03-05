package com.laptrinhjava.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjava.dao.INewDao;
import com.laptrinhjava.model.News;
import com.laptrinhjava.service.INewService;

public class NewService implements INewService{

	@Inject
	private INewDao newDao;
	
	@Override
	public List<News> findByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public News save(News news) {
		// TODO Auto-generated method stub
		int id_new = newDao.save(news);
		return null;
	}

}
