package com.plursalsight.Week2.OOP.MiniExercise;
import  java.time.LocalDate;
import java.util.Scanner;

public class ProductReviewApp {
    public static void main(String[] args) {

       // product1.show();
        ProductReview newProducts = displayAskUser();
        newProducts.show();

    }
    public  static  ProductReview displayAskUser(){
        Scanner newScanner = new Scanner(System.in);

        ProductReview  product1 = new ProductReview();
        System.out.println("Enter The product name:");
        product1.setProductName(newScanner.nextLine());
        System.out.println("Enter thr reviewer name: ");
        product1.setReviewer(newScanner.nextLine());
        System.out.println("What is your rate for this product:");
        product1.setRating(newScanner.nextInt());
        newScanner.nextLine();

        System.out.println("Do you want add commnet for this product:");
        product1.setComment(newScanner.nextLine());
        product1.setReviewDate(LocalDate.now());

        return  product1 ;


    }
}
