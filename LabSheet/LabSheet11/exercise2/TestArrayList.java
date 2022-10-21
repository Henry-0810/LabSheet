package LabSheet11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen", "This is a black pen");
        Product p12 = new Product(12, "Blue Pen", "This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15));
        String inputTxt = """
                1. Add a Product
                2. Amend a Product
                3. Remove a Product
                4. View all Products
                5. Quit
                                
                Please enter your choice
                """;
        boolean loop = true;
        while (loop) {
            String input = JOptionPane.showInputDialog(inputTxt);

            if (input == null)
                JOptionPane.showMessageDialog(null, "Thanks for the service");
            else if (input.equals(""))
                JOptionPane.showMessageDialog(null, "Thanks for the service");
            else {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= 1 && inputNum <= 5) {
                    if (inputNum == 1) {
                        addProduct(allProducts);
                    } else if (inputNum == 2) {
                        amendProduct(allProducts);
                    } else if (inputNum == 3) {
                        removeProduct(allProducts);
                    } else if (inputNum == 4) {
                        viewProducts(allProducts);
                    } else {
                        JOptionPane.showMessageDialog(null, "Thanks for using the system!", "Farewell", 1);
                        break;
                    }
                }
                loop = false;
            }
        }
    }

    public static void addProduct(ArrayList<Product> allProducts){
        int prodID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String prodName = JOptionPane.showInputDialog("Please enter the product name");
        String prodDesc = JOptionPane.showInputDialog("Please enter the product description");
        Product newProd = new Product(prodID,prodDesc,prodDesc);
        allProducts.add(newProd);
        JOptionPane.showMessageDialog(null,"Product now created and added to the list!",
                "Product Added",1);
    }
    public static void amendProduct(ArrayList<Product> allProducts){
        String prodName = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");
        StringBuilder output = new StringBuilder("The following products matched your search phrase\n\n");
        for (Product p:allProducts) {
            if(p.getName().contains(prodName)){
                output.append(p).append("\n");
            }
        }
        output.append("\n\n\nEnter the id of the one do you want to amend");
        int prodID = Integer.parseInt(JOptionPane.showInputDialog(output.toString()));
        for (Product p:allProducts) {
            if(prodID == p.getId()){
                int choices = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are: \n\n" + p +
                                "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amendment\n\nPlease enter your choice"));
                if(choices < 1 || choices >3){
                    choices = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are: \n\n" + p +
                            "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amendment\n\nInvalid choice entered!!! Must be a value between" +
                            " 1 and 3 inclusive"));
                    if(choices == 1){
                        String newProdName = JOptionPane.showInputDialog("Please enter the new name for the product");
                        p.setName(newProdName);
                    }
                    else if(choices == 2){
                        String newProdDesc = JOptionPane.showInputDialog("Please enter the new description for the product");
                        p.setDescription(newProdDesc);
                    }
                    else break;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Product details now amended!","Product Amended",1);
    }
    public static void removeProduct(ArrayList<Product> allProducts) {
        String prodName = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");
        String output = "The following products matched your search phrase\n\n";
        for (Product p : allProducts) {
            if (p.getName().contains(prodName)) {
                output += p + "\n";
            }
        }
        output += "\n\n\nEnter the id of the one do you want to remove";
        int prodID = Integer.parseInt(JOptionPane.showInputDialog(output));

        for (Product p : allProducts) {
            if (prodID == p.getId()) {
                int result = JOptionPane.showConfirmDialog(null, "The details of the product you wish to amend are:\n\n" +
                        p + "\n\nAre you sure you wish to remove this product?", "Product Removal Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    allProducts.remove(p);
                    JOptionPane.showMessageDialog(null, "Product now removed from array list!", "Product Removed", 1);
                } else
                    JOptionPane.showMessageDialog(null, "Product removal cancelled", "Product Not Removed", 1);
            }
        }
    }
    public static void viewProducts(ArrayList<Product> allProducts) {
        String output = "";
        for (Product p : allProducts)
            output += p + "\n";
        JOptionPane.showMessageDialog(null, output, "List of all Products", 1);
    }
}

//        System.out.println("\n\nCreating two array-lists, one to maintain a collection of products,\n" +
//                "the other to maintain a collection of line-items ...\n");
//        //Create an array-list of LineItem objects
//        ArrayList<LineItem> allLineItems = new ArrayList<LineItem>();
//
//        //Create an array-list of Product objects
//        ArrayList<Product> allProducts = new ArrayList<Product>();
//
//
//        // Create Products
//        Product p1 = new Product(1, "Pen", "This is a red pen");
//        Product p2 = new Product(2, "Pencil", "This is a pencil");
//        Product p3 = new Product(3, "Ruler", "This is a ruler");
//        Product p4 = new Product(4, "Marker", "This is a black permanent marker");
//
//        allProducts.add(p1);
//        allProducts.add(p2);
//        allProducts.add(p3);
//        allProducts.add(p4);
//
//
//        // Create LineItem objects
//
//        LineItem item1 = new LineItem(1, 3, p1);
//        LineItem item2 = new LineItem(2, 4, p2);
//        LineItem item3 = new LineItem(3, 2, p3);
//
//        allLineItems.add(item1);
//        allLineItems.add(item2);
//        allLineItems.add(item3);
//
//        System.out.println("There are " + allLineItems.size() + " line-items in its array");
//        System.out.println("There are " + allProducts.size() + " products in its array");
//
//        System.out.println("\nDisplaying the state of all products ...\n");
//        for (Product p : allProducts)
//            if (p != null)
//                System.out.println(p);
//
//
//        System.out.println("\n\nDisplaying the state of all line-items ...\n");
//        for (LineItem l : allLineItems)
//            if (l != null)
//                System.out.println(l);
//
//        System.out.println("\n\nNow removing the first line-item from its array-list...\n\n");
//        allLineItems.remove(0);
//
//        System.out.println("Displaying the state of all line-items ...\n");
//        for (LineItem l : allLineItems)
//            if (l != null)
//                System.out.println(l);
//
//        System.out.println("\n\nCreating a new product, a compass, and adding it to the array-list of products\n");
//        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
//        allProducts.add(p5);
//
//        LineItem item4 = new LineItem(4, 5, p5);
//
//        System.out.println("\nNow adding a new line-item, for 5 compasses, to end of its array-list...\n");
//        allLineItems.add(item4);
//
//        System.out.println("There are " + allLineItems.size() + " line-items in its array");
//        System.out.println("There are " + allProducts.size() + " products in its array");
//
//        System.out.println("\nDisplaying the state of all products ...\n");
//        for (Product p : allProducts)
//            if (p != null)
//                System.out.println(p);
//
//        System.out.println("\n\nDisplaying the state of all line-items ...\n");
//        for (LineItem l : allLineItems)
//            if (l != null)
//                System.out.println(l);
//
//        System.out.println("\n\nDisplaying the state of all line-items which contain products beginning with 'Pen' ...\n\n");
//        for (LineItem l : allLineItems)
//            if (l != null && l.getProduct().getName().startsWith("Pen"))
//                System.out.println(l);
//
//        System.out.println("\n\nNow changing product of the line-item in the 2nd position of the array-list from a ruler to a black permanent marker...");
//        allLineItems.get(1).setProduct(p4);
//
//        System.out.println("\n\nDisplaying the state of all line-items ...\n");
//        for (LineItem l : allLineItems)
//            if (l != null)
//                System.out.println(l);
//
//        System.out.println("\nNow removing the 2nd product, the pencil, from the array-list of products...\n\n");
//        allProducts.remove(1);
//
//        System.out.println("There are " + allLineItems.size() + " line-items in its array");
//        System.out.println("There are " + allProducts.size() + " products in its array");
//        System.out.println("\nDisplaying the state of all products ...\n");
//        for (Product p : allProducts)
//            if (p != null)
//                System.out.println(p);
//
//        System.out.println("\n\nDisplaying the state of all line-items ...\n");
//        for (LineItem l : allLineItems)
//            if (l != null)
//                System.out.println(l);

//    }

//}
