package com.company;

public class Main {

    public static void main(String[] args) {
	// scanner

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Your name ");
        String name = in.nextLine();
        System.out.print("Your age ");
        int age = in.nextInt();
        System.out.print("Your height ");
        float height = in.nextFloat();
        System.out.printf( "name: %s age: %d height: %.2f \n", name,age,height);
        in.close();
    }
}
