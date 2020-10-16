package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.lang.String;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String args[]) throws IOException {

        System.out.println("Hello!\n1)Enter number: ");

        String lineExample = "Hello23 world5.5 J631ava6, gre11at!";

        int variant = 0;
        Scanner in = new Scanner(System.in);
        variant = in.nextInt();
        if ((variant != 1) && (variant != 2)) {
            System.out.println("Wrong number");
            return;
        }

        String s = "";
        if (variant == 1) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
        }

        System.out.println(s);
        List<Integer> listNumbers = getNumbers(lineExample);
        printNumbers(listNumbers);
        System.out.println("\n3) End of program.");

    }

    static List<Integer> getNumbers(String line) {
        List<Integer> listNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(line);
        int start = 0;
        while (matcher.find(start)) {
            String value = line.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            listNumbers.add(result);
            start = matcher.end();
        }
        return listNumbers;
    }

    static void printNumbers(List<Integer> listNumbers) {
        for (int i = 0; i < listNumbers.size(); ++i) {
            System.out.print(listNumbers.get(i) + " ");
        }
    }
}

