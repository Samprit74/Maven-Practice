package com.roy;

/**
 * Hello world!
 *
 */

public class Arithmetic {

    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] t) {
        Arithmetic arth = new Arithmetic();

        System.out.println("sum is-->" + arth.sum(800, 200) + "(⌐■_■)");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySql JDBC Driver loaded");

        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
    }
}
