package problem11;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();

        c1.creatCmplxNumber();
        c2.creatCmplxNumber();

        c1.displayCmplxNumber();
        c2.displayCmplxNumber();

        c1.addCmplxNumber(c2).displayCmplxNumber();

        c1.multiCmplxNuber(c2).displayCmplxNumber();
    }
}
