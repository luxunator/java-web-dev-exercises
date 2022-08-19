package exercises.technology;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("Asus", 1000.00, 16, 8, 0, false, 6.0);
        SmartPhone myPhone = new SmartPhone("Samsung", 128.00, 8, 4, 1234, false, 47.0);

        ArrayList<Computer> computerArrayList = new ArrayList<>();

        computerArrayList.add(myLaptop);
        computerArrayList.add(myPhone);

        System.out.println(computerArrayList);

    }
}
