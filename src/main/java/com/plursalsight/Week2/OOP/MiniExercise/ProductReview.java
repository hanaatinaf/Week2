package com.plursalsight.Week2.OOP.MiniExercise;
import java.time.LocalDate;

//Goal: Store a simple product review.

public class ProductReview {
    String productName;
    String reviewer;
    int rating ; // (1–5)
    String comment;
    LocalDate reviewDate ;

    public  ProductReview(){}// Contractors qithout argumnets defalt value
    public  ProductReview(String productName, String reviewer, int rating , String comment,  LocalDate reviewDate){
        this.productName = productName;
        this.reviewer = reviewer;
        this.rating  = rating; // (1–5)
         this.comment = comment;
        this.reviewDate = reviewDate;}

    public String getProductName() {return productName;}

    public void setProductName(String productName) {
        this.productName = productName;}

    public String getReviewer() {
        return reviewer;}

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;}

    public int getRating() {return rating;}

    public void setRating(int rating) {
        //In setRating, if rating < 1 set to 1; if > 5 set to 5.
        if (rating < 1 ){
            this.rating = 1;
        } else if (rating > 5) {
            this.rating = 5;

        }else {this.rating = rating;}
    }

    public String getComment() {
        return comment;}

    public void setComment(String comment) {
        this.comment = comment;}

    public LocalDate getReviewDate() {
        return reviewDate;}

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate; }

    public void show(){
        //<productName> rated <rating>/5 by <reviewer> on <reviewDate>: <comment>
        System.out.printf("<%s>  rated <%s> /5 by <%s> on <%s>: <%s> ",productName,rating,reviewer,reviewDate,comment);

    }
}
