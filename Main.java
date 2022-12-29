public class Main {
    public static void main(String[] args){
        System.out.println("Задача 2 без ООП");
        double r = 10;
        System.out.println("Площадь 1 фигуры = " + figure1(r));
        System.out.println("Площадь 2 фигуры = " + figure2(r));
        System.out.println("Площадь 3 фигуры = " + figure3(r));
    }
    public static double Square(double r){
        return 4 * r * r;
    }
    public static double Circle(double r){
        return Math.PI * r * r;
    }
    public static double figure1(double r){
        return (Square(r) - Circle(r)) / 2;
    }
    public static double figure2(double r){
        return figure1(r) + Circle(r);
    }
    public static double figure3(double r){
        return figure1(r) / 2 + r * r;
    }
}
