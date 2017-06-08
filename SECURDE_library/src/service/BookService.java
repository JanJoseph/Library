package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.Query;
import model.Book;
import model.datetime.SimpleDate;

public class BookService {
	
	private BookService(){}
	
	public static void addBooks(ArrayList<Book> list){
		
	}
	
	public static void deleteBooks(int idBook){
		
	}
	
	public static ArrayList<Book> retrieveBooks(){
		ArrayList<Book> list = new ArrayList<>();
		String query = "select * from " + "TABLE";
		Book b;
		ResultSet r = null;
		try {
			r = Query.getInstance().runQuery(query);
			while(r.next()) {
				b = new Book(
						r.getInt("COL_NAME"), 
						r.getString("COL_NAME"),
						r.getString("COL_NAME"), 
						r.getString("COL_NAME"), 
						new SimpleDate(r.getString("COL_NAME")));
				list.add(b);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				Query.getInstance().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
