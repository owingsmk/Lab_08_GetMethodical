import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;
public class CheckOut {

    public static void main(String[] arg) {

        double itemPrice = 0d;
        boolean newItems;

        Scanner in = new Scanner(System.in);

        itemPrice = SafeInput.getRangedDouble(in, "Please give the price of your item: ", 0, 10);


        newItems = SafeInput.getYNComfirm(in, "Would you like to add another item?");
        double totalItems = in.nextDouble();
        double itemprice = (totalItems + itemPrice);
            //if (newItems == "Y") {
            //System.out.println("You entered this many items " + totalItems);
             //   return true;
             //} else {
            //return false;
            //}

    }

}
