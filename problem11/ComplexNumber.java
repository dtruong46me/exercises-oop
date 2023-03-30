package problem11;

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double virtual;

    Scanner sc = new Scanner(System.in);

    public ComplexNumber() {};
    public ComplexNumber(double real, double virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public void creatCmplxNumber() {
        System.out.print("Enter the real part : ");
        double r = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the virtual part : ");
        double v = sc.nextInt();
        sc.nextLine();

        this.real = r;
        this.virtual = v;
    }

    public void displayCmplxNumber() {
        System.out.println("The complex number c = "+this.real+"+"+this.virtual+"i");
    }

    public ComplexNumber addCmplxNumber(ComplexNumber c) {
        double r = this.real + c.real;
        double v = this.virtual + c.real;
        return new ComplexNumber(r,v);
    }

    public ComplexNumber multiCmplxNuber(ComplexNumber c) {
        double r = this.real * c.real - this.virtual * c.virtual;
        double v = this.real * c.virtual + this.virtual * c.real;
        return new ComplexNumber(r,v);
    }

}
