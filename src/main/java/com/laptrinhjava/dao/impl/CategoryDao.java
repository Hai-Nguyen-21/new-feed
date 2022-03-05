package com.laptrinhjava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjava.dao.ICategoryDao;
import com.laptrinhjava.mapper.CategoryMapper;
import com.laptrinhjava.model.Category;

public class CategoryDao extends AbstractDao<Category> implements ICategoryDao{

	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		List<Category> listCate = new ArrayList<Category>();
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
		 
	}

}
