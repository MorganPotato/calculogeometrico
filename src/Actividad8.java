import java.util.ArrayList;
import java.util.Scanner;

interface FiguraGeometrica {
    void calcularArea();
    void calcularPerimetro();
    double obtenerResultado();
}

class Circulo implements FiguraGeometrica {
    double radio;
    double resultado;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        resultado = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        resultado = 2 * Math.PI * radio;
    }

    @Override
    public double obtenerResultado() {
        return resultado;
    }
}
class Rectangulo implements FiguraGeometrica {
    double longitud, ancho;
    double resultado;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        resultado = longitud * ancho;
    }

    @Override
    public void calcularPerimetro() {
        resultado = 2 * (longitud + ancho);
    }

    @Override
    public double obtenerResultado() {
        return resultado;
    }
}

class Triangulo implements FiguraGeometrica {
    double lado1, lado2, lado3;
    double resultado;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        resultado = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public void calcularPerimetro() {
        resultado = lado1 + lado2 + lado3;
    }

    @Override
    public double obtenerResultado() {
        return resultado;
    }
}

class Pentagono implements FiguraGeometrica {
    double lado, apotema;
    double resultado;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public void calcularArea() {
        resultado = (5 * apotema * lado) / 2;
    }

    @Override
    public void calcularPerimetro() {
        resultado = 5 * lado;
    }

    @Override
    public double obtenerResultado() {
        return resultado;
    }
}
class Cuadrado implements FiguraGeometrica {
    double lado;
    double resultado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        resultado = Math.pow(lado, 2);
    }

    @Override
    public void calcularPerimetro() {
        resultado = 4 * lado;
    }

    @Override
    public double obtenerResultado() {
        return resultado;
    }
}

class Actividad8 {
    static ArrayList<Double> resultados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcmenu = 0;
        double result = 0.0;
        boolean continuar = true;
        FiguraGeometrica figura = null;

        while (continuar) {
            System.out.println("\tBIENVENIDO AL CALCULADOR GEOMÉTRICO");
            System.out.println("\tPor favor seleccione una figura geométrica:");
            System.out.println("\n1. Circulo");
            System.out.println("\n2.  Cuadrado");
            System.out.println("\n3.  Triángulo");
            System.out.println("\n4.  Rectángulo");
            System.out.println("\n5. Pentagono");
            System.out.println("\n7. Salir");

            opcmenu = scanner.nextInt();

            switch (opcmenu) {
                case 1:
                    System.out.println("\nIngrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    figura = new Circulo(radioCirculo);
                    break;
                case 2:
                    System.out.println("\nIngrese el lado del cuadrado:");
                    double ladoCuadrado = scanner.nextDouble();
                    figura = new Cuadrado(ladoCuadrado);
                    break;
                case 3:
                    System.out.println("\nIngrese los tres lados del triángulo:");
                    double lado1Triangulo = scanner.nextDouble();
                    double lado2Triangulo = scanner.nextDouble();
                    double lado3Triangulo = scanner.nextDouble();
                    figura = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    break;
                case 4:
                    System.out.println("\nIngrese la longitud y el ancho del rectángulo:");
                    double longitudRectangulo = scanner.nextDouble();
                    double anchoRectangulo = scanner.nextDouble();
                    figura = new Rectangulo(longitudRectangulo, anchoRectangulo);
                    break;
                case 5:
                    System.out.println("\nIngrese el lado del pentágono:");
                    double ladoPentagono = scanner.nextDouble();
                    System.out.println("\nIngrese la apotema del pentágono:");
                    double apotemaPentagono = scanner.nextDouble();
                    figura = new Pentagono(ladoPentagono, apotemaPentagono);
                    break;
                case 6:
                    System.out.println("\nResultados almacenados: " + resultados);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("\nOpción incorrecta, por favor seleccione nuevamente.");
                    break;
            }

            if (figura != null) {
                System.out.println("seleccione el area para calcular");
                System.out.println("\n1. Área");
                System.out.println("\n2. Perímetro");
                int opcionCalculo = scanner.nextInt();

                switch (opcionCalculo) {
                    case 1:
                        figura.calcularArea();
                        result = figura.obtenerResultado();
                        System.out.println("\nel area es: " + result);
                        break;
                    case 2:
                        figura.calcularPerimetro();
                        result = figura.obtenerResultado();
                        System.out.println("\nEl perimetro es: " + result);
                        break;
                    default:
                        System.out.println("\nOpcion incorrecta, porfa intente de nuevo.");
                        break;
                }

                resultados.add(result);
            }
        }
        scanner.close();
    }
}