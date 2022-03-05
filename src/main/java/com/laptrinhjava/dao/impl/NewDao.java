package com.laptrinhjava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjava.dao.INewDao;
import com.laptrinhjava.mapper.NewMapper;
import com.laptrinhjava.model.News;

public class NewDao extends AbstractDao<News> implements INewDao{
	
	@Override
	public List<News> findByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		List<News> listNew = new ArrayList<News>();
		String sql = "SELECT * FROM news WHERE id_cate = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public int save(News news) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO news (title, thumbnail, shortdescription, content, id_cate) VALUES (?, ?, ?, ?, ?)";
		return insert(sql, news.getTitle(), news.getThumbnail(), news.getShortdescription(), news.getContent(), news.getId_cate());
	}

	@Override
	public void delete(News news) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM news WHERE id = ?";
		this.update(sql, news.getId());
	}

}
