package utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionManager {

	private SessionManager(){}
	
	public static boolean validateSession(HttpServletRequest request, HttpServletResponse response){
		return false;
	}
	
}
