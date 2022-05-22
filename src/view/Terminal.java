package view;

import java.util.Scanner;

/**
 * It's a wrapper for the Scanner class that allows you to input and output data to the console
 */
public class Terminal {
    private String title;
    private Scanner sc;

    public Terminal(String title, Scanner sc) {
        this.title = title;
        this.sc = sc;
    }

    public Terminal() {
        this.title = "";
        this.sc = new Scanner(System.in);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int inputInteger(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    public double inputDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public String inputString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public void print(String msg) {
        System.out.print(msg);
    }
}
