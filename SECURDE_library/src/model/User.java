package model;

import model.datetime.SimpleDate;
import model.definition.UserType;

public class User {
	private int idUser;
	private UserType type;
	private String firstName;
	private String middleName;
	private String lastName;
	private String username;
	private String password; // hash
	private String email;
	private String idNumber;
	private SimpleDate birthday;
}
