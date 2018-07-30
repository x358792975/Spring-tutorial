package com.selflearning.spring.test.sample1.cycle;

public class Car {

		public Car() {
			// TODO Auto-generated constructor stub
			System.out.println("Car's Constructor....");
		}
		
		private String brand;
		
		@Override
		public String toString() {
			return "Car [brand=" + brand + "]";
		}

		public void setBrand(String brand) {
			System.out.println("SetBrand....");
			this.brand = brand;
		}
		
		public void init() {
			System.out.println("init.....");
		}
		
		public void destroy() {
			System.out.println("destroy.....");
		}
}
