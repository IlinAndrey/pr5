package ru.mirea.pr5;

public class OddNumbers {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
            recursion();
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}