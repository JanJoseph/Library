package dao;

import java.util.List;

import model.Review;

public interface GenericReviewDao {

	public int insert(Review author);
	public int update(Review author);
	public int delete(int id);
	public List<Review> findAll();
	public Review findById(int id);
	public List<Review> findByUser(int idUser);
	public List<Review> findByBook(int idBook);
}
