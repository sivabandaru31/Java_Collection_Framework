package com.siva.shoppingCart.ShoppingCart;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        LinkedList<String> cart=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("Mini project-Shopping Cart System \uD83D\uDED2 ");
        System.out.println("*************************************");



        while(true) {
            System.out.println("Shopping cart Manu");
            System.out.println("1.Add Item");
            System.out.println("2.Remove Item");
            System.out.println("3.View First Added Item");
            System.out.println("4.View Last Added item");
            System.out.println("5.View All Items");
            System.out.println("6.Exist");

            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(" enter item to add");
                    String itemTOAdd = scanner.nextLine();
                    cart.add(itemTOAdd);
                    System.out.println(itemTOAdd + " Added successfully");
                    break;

                case 2:
                    System.out.println("enter item to Remove");
                    String itemtoRemove = scanner.nextLine();
                    if(cart.isEmpty()) {
                        if (cart.remove(itemtoRemove))
                            System.out.println(itemtoRemove + " removed item in cart. ");
                        else {
                            System.out.println(itemtoRemove + "item not found");
                        }
                    }else{
                        System.out.println("Cart is Empty");
                    }
                    break;
                case 3:
                    if (!cart.isEmpty()) {
                        System.out.println("First added item is :" + cart.getFirst());
                    } else {
                        System.out.println("cart is empty");
                    }
                    break;
                case 4:
                    if (!cart.isEmpty()) {
                        System.out.println("last added item is :" + cart.getLast());
                    } else {
                        System.out.println("cart is empty");
                    }
                    break;

                case 5:
                    if (cart.isEmpty()) {
                        System.out.println("cart is empty");
                    } else {
                        System.out.println("item's in the cart" + cart);
                    }
                    break;

                case 6:
                    System.out.println("Thanks for shopping .....");
                    scanner.close();
                    return;


                default:
                    System.out.println("imvalid choice entered. please try again");
            }
        }
    }
}
