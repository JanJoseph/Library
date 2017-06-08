package controller.test;

import javax.servlet.http.HttpServletRequest;

import action.test.TestHandler;
import controller.ActionControllerServlet;

public class TestServlet extends ActionControllerServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7796862865496262813L;

	public static final String TEST_ACTION = "RUN_TEST";
	  
	@Override
	protected void registerHandlers() {
	    registerHandler(TEST_ACTION, new TestHandler());
	}
	
	@Override
	protected String getViewPath(HttpServletRequest request) {
	    return "index.jsp";
	}

}
