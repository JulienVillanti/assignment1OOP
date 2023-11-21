import java.util.Scanner;

public class CellPhoneSearch {


    public static void displayCellphoneInfo(Cellphone cellphone) {
        System.out.printf("Brand: %s \nPrice: $%s\n",
                cellphone.getBrand(), cellphone.getPrice());
    }

    public static void searchBrand(Cellphone[] inventory, String brand) {
        boolean foundBrand = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getBrand().equalsIgnoreCase(brand)) {
                displayCellphoneInfo(inventory[i]);
                foundBrand = true;
            }
        }
        if (!foundBrand) {
            System.out.println("There is no " + brand + " cellphones in our inventory.");
        }
    }

    public static void searchBrandAndPrice(Cellphone[] inventory, String brand, double price) {
        boolean found = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getBrand().equalsIgnoreCase(brand) && (inventory[i].getPrice() == price)) {
                displayCellphoneInfo(inventory[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching cellphones found for the specified brand and price.");
        }
    }

    public static void searchPrice(Cellphone[] inventory, double price) {
        boolean foundPrice = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getPrice() < price || inventory[i].getPrice() == price) {
                displayCellphoneInfo(inventory[i]);
                foundPrice = true;
            }
        }
        if (!foundPrice) {
            System.out.println("There is no " + price + " cellphones in our inventory.");
        }
    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Cellphone[] inventory = new Cellphone[10];
        Cellphone c1 = new Cellphone("Samsung", 1000);
        Cellphone c2 = new Cellphone("Apple", 1500);
        Cellphone c3 = new Cellphone("Nokia", 600);
        Cellphone c4 = new Cellphone("BlackBerry", 2000);
        Cellphone c5 = new Cellphone(c1);
        Cellphone c6 = new Cellphone(c2);
        Cellphone c7 = new Cellphone(c1);
        Cellphone c8 = new Cellphone(c3);
        Cellphone c9 = new Cellphone(c4);
        Cellphone c10 = new Cellphone(c1);

        inventory[0] = c1;
        inventory[1] = c2;
        inventory[2] = c3;
        inventory[3] = c4;
        inventory[4] = c5;
        inventory[5] = c6;
        inventory[6] = c7;
        inventory[7] = c8;
        inventory[8] = c9;
        inventory[9] = c10;

        //Arrays.toString(inventory);

        System.out.println("Please enter your Cellphone brand: ");
        String brand = kb.next();
        System.out.println("Please enter your Cellphone price: ");
        double price = kb.nextDouble();
        System.out.println("Please enter yes or no: ");
        String answer = kb.next();

        if (answer.equalsIgnoreCase("yes")) {
            searchBrandAndPrice(inventory, brand, price);
        }
    }
}

