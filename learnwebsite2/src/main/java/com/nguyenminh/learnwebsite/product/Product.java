package com.nguyenminh.learnwebsite.product;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id ;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price ;
    @Column(name = "amount")
    private int amount ;

    @Column(name = "image_url")
    private int imageUrl ;

    public Product(String name, int price, int amount, int imageUrl) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", imageUrl=" + imageUrl +
                '}';
    }
}
