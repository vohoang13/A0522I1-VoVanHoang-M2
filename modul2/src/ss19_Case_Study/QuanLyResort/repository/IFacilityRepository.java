package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.House;
import ss19_Case_Study.QuanLyResort.model.Room;
import ss19_Case_Study.QuanLyResort.model.Villa;

public interface IFacilityRepository {
    public void addVilla(Villa villa);

    public void addHouse(House house);

    public void addRoom(Room room);

}
