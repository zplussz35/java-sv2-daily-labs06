package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik szót találjuk ki?: ");
        String wordToFind=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordToFind.length(); i++) {
            sb.append("_");
        }
        String status=sb.toString();
        String guess;
        while(!status.equals(wordToFind)){
            System.out.print("Betűtipp: ");
            guess=sc.nextLine();
            status=updateWordFound(wordToFind,status,guess);
            System.out.println(status);
        }
        System.out.println("Nyertél!");


    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}