package action.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.ActionHandler;
import dao.implementation.BookDao;
import model.Book;

public class TestHandler implements ActionHandler{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BookDao dao = new BookDao();
		List<Book> bookList = dao.findAll();
	}

}
