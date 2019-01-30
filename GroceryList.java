package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
	// write your code here //
//ask for items
        Scanner keyboard = new Scanner(System.in);
        int quantity1;
        int quantity2;
        int quantity3;

        float costperitem1;
        float costperitem2;
        float costperitem3;

//ask for how many items to purchase
        String item;
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1 ?  ");
        String item1 = keyboard.nextLine();
        out.print("\n");
        out.print("Item 2 ?  ");
        String item2 = keyboard.nextLine();
        out.print("\n");
        out.print("Item 3 ?  ");
        String item3 = keyboard.nextLine();
        out.print("\n");


//ask for quantity of items
        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + item1 + "?  ");
        quantity1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\n");
        out.print("How many " + item2 + "?  ");
        quantity2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\n");
        out.print("How many " + item3 + "?  ");
        quantity3 = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\n");

//ask for how much each item costs
        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + item1 + " cost?  ");
        costperitem1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.print("\n");
        out.print("How much does one " + item2 + " cost?  ");
        costperitem2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.print("\n");
        out.print("How much does one " + item3 + " cost?  ");
        costperitem3 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.print("\n");

//Define subtotals variables per item
        float subBill1;
        float subBill2;
        float subBill3;
        float totalBill;

//Calculate subtotals per item
subBill1 =  (costperitem1 * quantity1);
subBill2 =  (costperitem2 * quantity2);
subBill3 = (costperitem3 * quantity3);

totalBill = subBill1 + subBill2 + subBill3;
out.print("Calculating your grocery bill.");
out.print(" The total of your bill is " + totalBill );



    }
}
