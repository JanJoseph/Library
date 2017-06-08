package dao;

import java.util.List;

import model.User;
import model.definition.UserType;

public interface GenericUserDao {
	
	public int insert(User user);
	public int update(User user);
	public int delete(int id);
	public List<User> findAll();
	public User findById(int id);
	public boolean validateUser(String username, String password);
	public boolean validateQuestion(String username, String answer);
	public int updateUserType(int id, UserType type);
	public User searchByName(String firstName, String middleName, String lastName);
	public List<User> searchByUsername(String username);
	public List<User> searchByEmail(String email);
	
}
