import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom (Room room){
        roomList.add(room);
    }

    public Room getRoom (int roomNo){
        for (int i = 0 ; i < roomList.size(); i++){
            if (roomList.get(i).getRoomNo() == roomNo){
                return roomList.get(i);
            }
        }
        return null ;
    }

    public void deleteRoom (int roomNo){
        for (int i = 0 ; i < roomList.size(); i++){
            if (roomList.get(i).getRoomNo() == roomNo){
                roomList.remove(i);
            }
        }
    }

    public void addAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Chon room can them dong vat: ");
        for (int i = 0; i < roomList.size() ; i++) {
            System.out.println(roomList.get(i).getRoomNo()+ " : ");
        }
        int roomNo = Integer.parseInt(input.nextLine());

        System.out.println("Chon con vat can them: ");
        System.out.println("1. Tiger");
        System.out.println("2. Cat");
        System.out.println("3. Dog");
        int choose = Integer.parseInt(input.nextLine());;
        Animal animal;

        switch (choose){
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Tiger();
                break;
            default:
                animal = new Cat();
                break;

        }

        animal.input();

        Room room  = getRoom(roomNo);
        if (room != null){
            room.addAnimal(animal);
        }
    }

    public void deleteAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten dong vat can xoa : ");
        String  name = input.nextLine();

        roomList.forEach(room -> room.deleteAnimal(name));
    }

    public void showAllInfo(){
        for (int i = 0; i < roomList.size(); i++) {
            roomList.get(i).display();
        }
    }
}
