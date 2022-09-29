package com.qa.userConstructor;

public class Product {

	int id;
	String name;
	double price;
	String category;
	double rating;
	float discountProcentage;
	boolean isAvailable;

	public static String SELLER_NAME = "seller1";
	public static String SELLER_CONTACT_NUMBER = "077722222222";
	public static String SELLER_EMAIL = "email@email.com";

	public Product(int id, String name, double price, String category, double rating, float discountProcentage,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountProcentage = discountProcentage;
		this.isAvailable = isAvailable;
	}
	// Product info method

	void displayProductInformation() {
		System.out.println("id: " + id);
		System.out.println("name:" + name);
		System.out.println("price:" + price);
		System.out.println("category:" + category);
		System.out.println("rating:" + rating);
		System.out.println("availability:" + isAvailable);
	}

	// Discounted price calculation method

	double productDiscountPrice() {
		return (price * discountProcentage / 100);
	}

	// Total price
	double productFinalPrice() {
		return (price - productDiscountPrice());
	}
   
	// Seller info : 
	static void sellerContactDetails() {
		System.out.println("Seller Name" + SELLER_NAME);
		System.out.println("Seller Contact Number" + SELLER_CONTACT_NUMBER);
		System.out.println("Seller Email Address" + SELLER_EMAIL);
		System.out.println();
		
	}
}
