package model;

import model.datetime.SimpleDatetime;

public class RecordRoom {
	private int idRecordRoom;
	private int idRoom;
	private int idUser;
	private SimpleDatetime datetimeBorrowed;
	private SimpleDatetime datetimeDeadline;
	private SimpleDatetime datetimeReturned;
}
