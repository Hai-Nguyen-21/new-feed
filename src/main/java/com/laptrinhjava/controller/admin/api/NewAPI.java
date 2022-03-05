package com.laptrinhjava.controller.admin.api;

import java.io.IOException;
import java.rmi.ServerException;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.model.News;
import com.laptrinhjava.service.INewService;
import com.laptrinhjava.utils.HttpUtils;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet{

	@Inject
	private INewService newService;
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		// thêm
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// convert json to model
		News newModel = HttpUtils.of(request.getReader()).toModel(News.class);
		newModel = newService.save(newModel);
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		// cập nhật
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		// xóa
	}
}
