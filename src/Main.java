public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado: + areaQuadrado");

        double areaRetangulo = Quadrilatero.area(5, 6);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }

}
