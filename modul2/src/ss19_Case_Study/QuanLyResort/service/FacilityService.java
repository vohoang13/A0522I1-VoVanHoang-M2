package ss19_Case_Study.QuanLyResort.service;

import ss19_Case_Study.QuanLyResort.model.House;
import ss19_Case_Study.QuanLyResort.model.Room;
import ss19_Case_Study.QuanLyResort.model.Villa;
import ss19_Case_Study.QuanLyResort.repository.FacilityRepository;
import ss19_Case_Study.QuanLyResort.repository.IFacilityRepository;

import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void addVilla() {
        Villa villa = this.inforVilla();
        iFacilityRepository.addVilla(villa);
    }

    @Override
    public void addHouse() {
        House house = this.inforHouse();
        iFacilityRepository.addHouse(house);
    }

    public House inforHouse() {
        System.out.println("--ĐIỀN THÔNG TIN HOUSE--");
        System.out.print("Tên dịch vụ: ");
        String tenDV = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.print("Chi phí: ");
        int chiPhi = Integer.parseInt(scanner.nextLine());
        System.out.print("Sức chứa: ");
        int sucChua = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu thuê ( năm/ tháng / ngày / giờ): ");
        String kieuThue = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuan = scanner.nextLine();
        System.out.print("Số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        House house = new House(tenDV, dienTich, chiPhi, sucChua, kieuThue, tieuChuan, soTang);
        return house;
    }

    @Override
    public void addRoom() {
        Room room = this.inforRoom();
        iFacilityRepository.addRoom(room);
    }

    public Room inforRoom() {
        System.out.println("--ĐIỀN THÔNG TIN ROOM--");
        System.out.print("Tên dịch vụ: ");
        String tenDV = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.print("Chi phí: ");
        int chiPhi = Integer.parseInt(scanner.nextLine());
        System.out.print("Sức chứa: ");
        int sucChua = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu thuê ( năm/ tháng / ngày / giờ): ");
        String kieuThue = scanner.nextLine();
        System.out.print("Dịch vụ miễn phí kèm theo: ");
        String dichVuMienPhi = scanner.nextLine();
        Room room = new Room(tenDV, dienTich, chiPhi, sucChua, kieuThue, dichVuMienPhi);
        return room;
    }

    public Villa inforVilla() {
        System.out.println("--ĐIỀN THÔNG TIN VILLA--");
        System.out.print("Tên dịch vụ: ");
        String tenDV = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.print("Chi phí: ");
        int chiPhi = Integer.parseInt(scanner.nextLine());
        System.out.print("Sức chứa: ");
        int sucChua = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu thuê ( năm/ tháng / ngày / giờ): ");
        String kieuThue = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuan = scanner.nextLine();
        System.out.print("Diện tích hồ bơi: ");
        double dienTichHo = Double.parseDouble(scanner.nextLine());
        System.out.print("Số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tenDV, dienTich, chiPhi, sucChua, kieuThue, tieuChuan, dienTichHo, soTang);
        return villa;
    }
}
