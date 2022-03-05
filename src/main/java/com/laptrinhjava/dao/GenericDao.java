package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.mapper.RowMapper;

public interface GenericDao<T> {
	// mở driver và lấy dữ liệu từ db
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... params);
	
	// dùng chung cho update và delete
	void update(String sql, Object... params);
	
	int insert(String sql, Object... params);
}
