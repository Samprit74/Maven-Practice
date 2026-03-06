package com.roy.app;

import java.util.Scanner;

import com.roy.prac.Search;

public class App {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target = sc.nextInt();
        sc.close();

        Search ser=new Search();

        int index=ser.binary(arr,target);
        System.out.println("The"+ target+"is in index--> "+index);

    }
}
