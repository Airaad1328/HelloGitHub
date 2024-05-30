package com.gmail.clarkin200;

public class OrderListSum {
    public static void main(String[] args) {
        String product = "perfume";
        float price = 80.67F;
        int counter = 1;
        int productQuantity = 42;
        int days = 7;

        System.out.println("Product No "+counter+": "+product);
        System.out.print("total sales for " + days + " days is EUR ");
        System.out.printf("%.2f",price * productQuantity);
        System.out.println();
        System.out.print("sales by day is EUR ");
        System.out.printf("%.2f",price * productQuantity / days);
        System.out.println();

        product = "shoes";
        counter++;
        price = 65.37F;
        productQuantity = 41;
        days = 4;

        System.out.println("Product No "+counter+": "+product);
        System.out.print("total sales for " + days + " days is EUR ");
        System.out.printf("%.2f",price * productQuantity);
        System.out.println();
        System.out.print("sales by day is EUR ");
        System.out.printf("%.2f",price * productQuantity / days);
        System.out.println();
    }
}
