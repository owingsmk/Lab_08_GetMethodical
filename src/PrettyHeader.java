import java.util.ArrayList;

import java.util.List;



public class PrettyHeader {



    public static void main(String[] args) {

        prettyHeader("My Message");
    }

    public static void prettyHeader(String msg) {
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }

        System.out.println();

        if (msg.length() <= 54) {
            System.out.println(getCenteredString(msg));
        } else {
            List<String> parts = new ArrayList<>();
            int length = msg.length();
            for (int i = 0; i < length; i += 54) {
                parts.add(msg.substring(i, Math.min(length, i + 54)));
            }
            for (String s : parts) {
                System.out.println(getCenteredString(s));
            }
        }
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
    }

    private static String getCenteredString(String str) {

        int noOfWhiteSpaces = 0;

        int remainignWhiteSpaces = 0;

        String line = "";

        for (int i = 0; i < 3; i++) {

            line = line.concat("*");

        }
        if (str.length() <= 54) {

            noOfWhiteSpaces = (54 - str.length()) / 2;

            remainignWhiteSpaces = 54 - str.length() - noOfWhiteSpaces;

        }
        for (int i = 0; i < noOfWhiteSpaces; i++) {
            line = line.concat(" ");
        }
        line = line.concat(str);
        for (int i = 0; i < remainignWhiteSpaces; i++) {
            line = line.concat(" ");
        }
        for (int i = 0; i < 3; i++) {
            line = line.concat("*");
        }
        return line;
    }
}
