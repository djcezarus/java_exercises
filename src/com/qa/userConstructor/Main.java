package com.qa.userConstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prd1 = new Product(333, "car", 7000, "vehicles", 4.3, 25, false);
		System.out.println("id: " + prd1.id);
		System.out.println("name:" + prd1.name);
		System.out.println("price:" + prd1.price);
		System.out.println("category:" + prd1.category);
		System.out.println("rating:" + prd1.rating);
		System.out.println("discountProcentage:" + prd1.discountProcentage);
		System.out.println("available" + prd1.isAvailable   );
		System.out.println();
		
		Product prd2 = new Product(232, "bike", 2499, "sport", 5, 15, true);

		System.out.println("id: " + prd2.id);
		System.out.println("name:" + prd2.name);
		System.out.println("price:" + prd2.price);
		System.out.println("category:" + prd2.category);
		System.out.println("rating:" + prd2.rating);
		System.out.println("discountProcentage:" + prd2.discountProcentage);
		System.out.println("available" + prd2.isAvailable   );
		System.out.println();

		Product prd3 = new Product(10, "iphone", 999, "Smart Phones", 5, 10, true);

		System.out.println("id: " + prd3.id);
		System.out.println("name:" + prd3.name);
		System.out.println("price:" + prd3.price);
		System.out.println("category:" + prd3.category);
		System.out.println("rating:" + prd3.rating);
		System.out.println("discountProcentage:" + prd3.discountProcentage);
		System.out.println("available" + prd3.isAvailable   ); // can't make a space between available and true ??? 
		System.out.println();

	}

}
