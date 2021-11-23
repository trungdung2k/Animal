import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Zoo zoo = new Zoo();
    public static void main(String[] args) {
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                        inputRoom();
                    break;
                case 2:
                        deleteRoom();
                    break;
                case 3:
                        addAnimal();
                    break;
                case 4:
                        zoo.deleteAnimal();
                    break;
                case 5:
                        zoo.showAllInfo();
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Nhap lai!!");
                        break;
            }
        }while (choose !=6);
    }

    static void inputRoom(){
        System.out.println("Nhap so room can them: ");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n ; i++) {
            Room room = new Room();
            room.input();
            zoo.addRoom(room);
        }
    }

    public static void deleteRoom(){
        System.out.println("Nhap so ma room can xoa: ");
        int roomNo = Integer.parseInt(input.nextLine());
        zoo.deleteRoom(roomNo);
    }

    static  void addAnimal(){
        zoo.addAnimal();
    }

    static  void showMenu(){
        System.out.println("1. Them room");
        System.out.println("2. Xoa room");
        System.out.println("3. Them Con Vat");
        System.out.println("4. Xoa Con Vat");
        System.out.println("5. Xem thong tin tat ca con vat");
        System.out.println("6. Thoat");
        System.out.println("Choose: ");
    }
}
