package com.laptrinhjava.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjava.dao.ICategoryDao;
import com.laptrinhjava.model.Category;
import com.laptrinhjava.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject // dùng cách này sẽ kh cần khai báo constructor nứa
	private ICategoryDao categoryDao;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

}
