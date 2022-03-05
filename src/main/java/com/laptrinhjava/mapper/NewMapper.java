package com.laptrinhjava.mapper;

import java.sql.ResultSet;

import com.laptrinhjava.model.News;

public class NewMapper implements RowMapper<News> {

	@Override
	public News mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			News news = new News();
			news.setId(rs.getInt("id"));
			news.setTitle(rs.getString("title"));
			news.setThumbnail(rs.getString("thumbnail"));
			news.setShortdescription(rs.getString("shortdescription"));
			news.setContent(rs.getString("content"));
			news.setCreatedDate(rs.getTimestamp("createddate"));
			news.setModifiedDate(rs.getTimestamp("modifieddate"));
			news.setCreatedBy(rs.getString("createdby"));
			news.setModifiedBy(rs.getString("modifiedby"));
			news.setId_cate(rs.getInt("id_cate"));
			return news;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
