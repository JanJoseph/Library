package dao;

import java.util.List;

import model.RecordRoom;
import model.definition.RoomStatus;

public interface GenericRecordRoomDao {
	public int insert(RecordRoom record);
	public int update(RecordRoom record);
	public int delete(int id);
	public List<RecordRoom> findAll();
	public RecordRoom findById(int idRecordRoom);
	public List<RecordRoom> findAllByUser(int idUser);
	public List<RecordRoom> findDueByUser(int idUser);
	public List<RecordRoom> findAllByRoom(int idRoom);
	public int reserveRoom(int userId, int roomId);
	public int releaseRoom(int roomId);
	public RoomStatus getRoomStatus(int roomId);
}
