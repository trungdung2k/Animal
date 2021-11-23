import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Animal {
    String name;
    int age ;
    String description ;

    public Animal (){
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public  void  display(){
        System.out.println(toString());
    }

    public void  input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten con vat: ");
        name = input.nextLine();

        System.out.println("Nhap tuoi : ");
        age = Integer.parseInt(input.nextLine());

        System.out.println("Nhap mo ta : ");
        description = input.nextLine();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }

    public  abstract void Sound ();
}
