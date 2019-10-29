package KATA;

import java.util.Scanner;

public class Fraction {

    private int numerator;
    private int denominator;

    private Fraction(int num, int den) throws Exception{
        this.numerator = num;
        try {
            if(den != 0) {
                this.denominator = den;
            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Erreur denominateur egale a zero !!!!");
        }

    }

    private static Fraction addition(Fraction fracA, Fraction fracB) throws Exception {
        int num;
        int den;
        if(fracA.denominator == fracB.denominator){
            num = fracA.numerator + fracB.numerator;
            den = fracA.denominator;
        }else{
            num = (fracA.numerator * fracB.denominator) + (fracB.numerator * fracA.denominator);
            den = fracA.denominator * fracB.denominator;
        }

        return new Fraction(num,den);
    }


    private static Fraction substraction(Fraction fracA, Fraction fracB) throws Exception{
        int num;
        int den;
        if(fracA.denominator == fracB.denominator){
            num = fracA.numerator - fracB.numerator;
            den = fracA.denominator;
        }else{
            num = (fracA.numerator * fracB.denominator) - (fracB.numerator * fracA.denominator);
            den = fracA.denominator * fracB.denominator;
        }

        return new Fraction(num,den);
    }


    private static Fraction multiplicator(Fraction fracA, Fraction fracB) throws Exception{
        int num;
        int den;
        if(fracA.denominator == fracB.denominator){
            num = fracA.numerator * fracB.numerator;
            den = fracA.denominator;
        }else{
            num = fracA.numerator * fracB.numerator;
            den = fracA.denominator * fracB.denominator;
        }

        return new Fraction(num,den);
    }

    private static Fraction divisor(Fraction fracA, Fraction fracB) throws Exception{
        int num;
        int den;

        num = fracA.numerator * fracB.denominator;
        den = fracA.denominator * fracB.numerator;

        return new Fraction(num,den);
    }

    private void show(){
        System.out.println(this.numerator + "/" + this.denominator);
    }


    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrez votre type d'operation add pour addition \n" +
                " mult pour multiplication \n" +
                "div pour division\n" +
                " sous pour soustraction");
        String operation = sc.next();
        while(!operation.equals("add") && !operation.equals("sous") && !operation.equals("div") && !operation.equals("mult")){
            System.out.println("Veuillez entrez votre type d'operation add pour addition\n" +
                    " mult pour multiplication \n" +
                    "div pour division\n" +
                    " sous pour soustraction");
            operation = sc.next();
        }

        System.out.println("Veuillez entrez votre numerateur de la Premiere fraction");
        String num1 = sc.next();
        System.out.println("Veuillez entrez votre denominateur de la Premiere fraction");
        String den1 = sc.next();
        while (den1.equals("0")){
            System.out.println("Vous avez saisis un 0 veuillez saisir un nombre different");
            den1 = sc.next();
        }
        System.out.println("Veuillez entrez votre numerateur de la deuxieme fraction");
        String num2 = sc.next();
        System.out.println("Veuillez entrez votre denominateur de la Premiere fraction");
        String den2 = sc.next();
        while (den2.equals("0")){
            System.out.println("Vous avez saisis un 0 veuillez saisir un nombre different");
            den2 = sc.next();
        }

        Fraction A = new Fraction(Integer.parseInt(num1),Integer.parseInt(den1));
        Fraction B = new Fraction(Integer.parseInt(num2),Integer.parseInt(den2));
        switch (operation) {
            case "add": {
                Fraction res = addition(A, B);
                res.show();
                break;
            }
            case "sous": {
                Fraction res = substraction(A, B);
                res.show();
                break;
            }
            case "div": {
                Fraction res = divisor(A, B);
                res.show();
                break;
            }
            case "mult": {
                Fraction res = multiplicator(A, B);
                res.show();
                break;
            }
            default:
                System.out.println("Rien a faire !!!!");
                break;
        }




    }
}
