package com.laptrinhjava.mapper;

import java.sql.ResultSet;

import com.laptrinhjava.model.Category;

public class CategoryMapper implements RowMapper<Category>{

	@Override
	public Category mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			Category cate = new Category();
			cate.setId(rs.getInt("id"));
			cate.setName(rs.getString("name"));
			cate.setCode(rs.getString("code"));
			cate.setCreatedDate(rs.getTimestamp("createddate"));
			cate.setModifiedDate(rs.getTimestamp("modifieddate"));
			cate.setCreatedBy(rs.getString("createdby"));
			cate.setModifiedBy(rs.getString("modifiedby"));
			return cate;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
