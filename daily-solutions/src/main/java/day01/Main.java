package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer n = new PositiveNumberContainer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a számot (tizedesvessző): ");
        double dn = sc.nextDouble();
        sc.nextLine();
        while(dn>0){
            n.add(dn);
            System.out.print("Adja meg a számot (tizedesvessző): ");
            dn = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("A pozitív számok: "+n.getDnumbers());
    }
}
