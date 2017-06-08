package dao;

import java.util.List;

import model.RecordBook;

public interface GenericRecordBookDao {
	
	public int insert(RecordBook record);
	public int update(RecordBook record);
	public int delete(int id);
	public List<RecordBook> findAll();
	public RecordBook findById(int idRecordBook);
	public List<RecordBook> findAllByUser(int idUser);
	public List<RecordBook> findDueByUser(int idUser);
	public List<RecordBook> findAllByBook(int idBook);
	public int borrowBook(int userId, int bookId);
	public int returnBook(int userId, int bookId);

}
