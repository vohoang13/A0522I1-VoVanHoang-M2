package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.Facility;
import ss19_Case_Study.QuanLyResort.model.House;
import ss19_Case_Study.QuanLyResort.model.Room;
import ss19_Case_Study.QuanLyResort.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    private Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void addVilla(Villa villa) {
        facilityIntegerMap.put(villa,0);
    }

    @Override
    public void addHouse(House house) {
        facilityIntegerMap.put(house,0);
    }

    @Override
    public void addRoom(Room room) {
        facilityIntegerMap.put(room,0);
    }
}
