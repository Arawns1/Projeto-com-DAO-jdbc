package application;

import model.entities.Department;

public class Program {
	public static void main(String[] args) {
		Department d1 = new Department(1, "Compras");
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println(d1.getId());
		
	}
}
