package com.laptrinhjava.controller.web;


import java.io.IOException;
import java.rmi.ServerException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.model.News;
import com.laptrinhjava.service.ICategoryService;
import com.laptrinhjava.service.INewService;

@WebServlet(urlPatterns = {"/trang-chu", "/dang-nhap", "/"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	// nếu dùng theo servlet weld bên dưới thì khi user request
	// tới trang-chu sẽ không cần khởi tạo thêm 1 đối tượng 
	// service mới như cách constructor hay dùng, dùng theo inject nó
	// sẽ quản lý và chỉ khởi tạo 1 lần duy nhất lúc đầu tiên
	// về sau sẽ dc tái sử dụng 
	
	@Inject
	private ICategoryService categoryService;
	@Inject
	private INewService newService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException, ServletException {
		String title = "This is title 1";
		String thumbnail = "This is thumbnail 1";
		String shortdescription = "This is shortdescription 1";
		String content = "This is content 1";
		int id_cate = 1;
		
		News news = new News();
		news.setTitle(title);
		news.setThumbnail(thumbnail);
		news.setShortdescription(shortdescription);
		news.setContent(content);
		news.setId_cate(id_cate);
		newService.save(news);
		
		request.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		
	}
}
