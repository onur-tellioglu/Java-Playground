package net.usav;

public class Main {
    public static void main(String[] args) {
        int exam = 65;
        int gift = 0;

        if (exam >= 50) {
            gift = 100;
        } else {
            gift = 0;
        }

        System.out.println(gift);

        gift = exam >= 50 ? 100 : 0;
        System.out.println(gift);
    }
}