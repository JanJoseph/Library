package controller.test;

import javax.servlet.http.HttpServletRequest;

import controller.ActionControllerServlet;


public class BookServlet extends ActionControllerServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2850438303291121652L;

	  public static final String RETRIEVE_ACTION = "RETREVE_BOOK";
	  public static final String LOGIN_ACTION = "LOGIN_USER";
	  public static final String LOGOUT_ACTION = "LOGOUT_USER";
	  public static final String REGISTER_ACTION = "REGISTER_USER";

	@Override
	protected void registerHandlers() {
//	    registerHandler(ActionControllerServlet.EMPTY_ACTION, new RetrieveBookHandler());
//	    registerHandler(BookServlet.RETRIEVE_ACTION, new RetrieveBookHandler());
	}
	
	@Override
	protected String getViewPath(HttpServletRequest request) {
	    return "index.jsp";
	}

}
