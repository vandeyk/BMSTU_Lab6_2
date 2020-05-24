package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("Input.txt");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        try (Scanner scan = new Scanner(input)) {
            String buf = scan.nextLine();
            String[] buf_ = buf.split(" ");
            for (int i = 0; i < buf_.length; i++) {
                int int_ = Integer.parseInt(buf_[i]);
                list1.add(int_);
            }
            buf = scan.nextLine();
            int pointless = Integer.parseInt(buf);
            buf = scan.nextLine();
            String[] buf_2 = buf.split(" ");
            for (int i = 0; i < buf_2.length; i++) {
                int int_ = Integer.parseInt(buf_2[i]);
                list2.add(int_);
            }

        }
        catch (FileNotFoundException exp) {
            System.out.println("No such file found!");
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("List 3: " + list1);

    }
}
