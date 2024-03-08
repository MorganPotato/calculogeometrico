import java.util.ArrayList;
import java.util.Scanner;

public class Actividad7 {
    static ArrayList<Double> resultados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcmenu;
        double result = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\tBIENVENIDO AL CALCULATOR 4000");
            System.out.println("\tPor favor seleccione una figura geométrica");
            System.out.println("1. Calcular Circulo");
            System.out.println("2. Calcular Cuadrado");
            System.out.println("3. Calcular Triangulo");
            System.out.println("4. Calcular Rectangulo");
            System.out.println("5. Calcular Pentagono");
            System.out.println("6. Ver lo almacenado");
            System.out.println("7. Calcular Potencial");

            opcmenu = scanner.nextInt();

            switch (opcmenu) {
                case 1:
                    System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
                    System.out.println("\n1. Calcular Área");
                    System.out.println("\n2. Calcular Perímetro");
                    int opccalcu = scanner.nextInt();
                    if (opccalcu == 1)
                        result = calAreaCirculo(scanner);
                    else if (opccalcu == 2)
                        result = calPerimetroCirculo(scanner);
                    break;
                case 2:
                    System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
                    System.out.println("\n1. Calcular Área");
                    System.out.println("\n2. Calcular Perímetro");
                    opccalcu = scanner.nextInt();
                    if (opccalcu == 1)
                        result = calAreaCuadrado(scanner);
                    else if (opccalcu == 2)
                        result = calPerimetroCuadrado(scanner);
                    break;
                case 3:
                    System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
                    System.out.println("\n1. Calcular Área");
                    System.out.println("\n2. Calcular Perímetro");
                    opccalcu = scanner.nextInt();
                    if (opccalcu == 1)
                        result = calAreaTriangulo(scanner);
                    else if (opccalcu == 2)
                        result = calPerimetroTriangulo(scanner);
                    break;
                case 4:
                    System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
                    System.out.println("\n1. Calcular Área");
                    System.out.println("\n2. Calcular Perímetro");
                    opccalcu = scanner.nextInt();
                    if (opccalcu == 1)
                        result = calAreaRectangulo(scanner);
                    else if (opccalcu == 2)
                        result = calPerimetroRectangulo(scanner);
                    break;
                case 5:
                    System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
                    System.out.println("\n1. Calcular Área");
                    System.out.println("\n2. Calcular Perímetro");
                    opccalcu = scanner.nextInt();
                    if (opccalcu == 1)
                        result = calAreaPentagono(scanner);
                    else if (opccalcu == 2)
                        result = calPerimetroPentagono(scanner);
                    break;
                case 6:
                    System.out.println("\n\tResultados almacenados: " + resultados);
                    break;
                case 7:
                    result = calPotencia(scanner);
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    continuar = false;
                    break;
            }
            System.out.println("Resultado de la 7 :"+result);
            if (opcmenu != 6)
                resultados.add(result);
        }
    }

    public static double calAreaCirculo(Scanner scanner) {
        System.out.println("\n\tIngrese el radio del circulo");
        double radio = scanner.nextDouble();
        return Math.PI * radio * radio;
    }

    public static double calPerimetroCirculo(Scanner scanner) {
        System.out.println("\n\tIngrese el radio del circulo");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }

    public static double calAreaCuadrado(Scanner scanner) {
        System.out.println("\n\tIngrese el lado del cuadrado");
        double lado = scanner.nextDouble();
        return lado * lado;
    }

    public static double calPerimetroCuadrado(Scanner scanner) {
        System.out.println("\n\tIngrese el lado del cuadrado");
        double lado = scanner.nextDouble();
        return 4 * lado;
    }

    public static double calAreaTriangulo(Scanner scanner) {
        System.out.println("\n\tIngrese base del triángulo");
        double base = scanner.nextDouble();
        System.out.println("\n\tIngrese altura del triángulo");
        double altura = scanner.nextDouble();
        return (base * altura) / 2;
    }

    public static double calPerimetroTriangulo(Scanner scanner) {
        System.out.println("\n\tIngrese primer lado");
        double lado1 = scanner.nextDouble();
        System.out.println("\n\tIngrese segundo lado");
        double lado2 = scanner.nextDouble();
        System.out.println("\n\tIngrese tercer lado");
        double lado3 = scanner.nextDouble();
        return lado1 + lado2 + lado3;
    }

    public static double calAreaRectangulo(Scanner scanner) {
        System.out.println("\n\tIngrese la base del rectangulo");
        double base = scanner.nextDouble();
        System.out.println("\n\tIngrese la altura del rectangulo");
        double altura = scanner.nextDouble();
        return base * altura;
    }

    public static double calPerimetroRectangulo(Scanner scanner) {
        System.out.println("\n\tIngrese la base del rectangulo");
        double base = scanner.nextDouble();
        System.out.println("\n\tIngrese la altura del rectangulo");
        double altura = scanner.nextDouble();
        return 2 * (base + altura);
    }

    public static double calAreaPentagono(Scanner scanner) {
        System.out.println("\n\tIngrese el lado del pentagono");
        double lado = scanner.nextDouble();
        System.out.println("\n\tIngrese la apotema del pentagono");
        double apotema = scanner.nextDouble();
        return (5 * lado * apotema) / 2;
    }

    public static double calPerimetroPentagono(Scanner scanner) {
        System.out.println("\n\tIngrese el lado del pentagono");
        double lado = scanner.nextDouble();
        return 5 * lado;
    }

    public static double calPotencia(Scanner scanner) {
        System.out.println("\n\tIngrese la base:");
        double base = scanner.nextDouble();
        System.out.println("\n\tIngrese el exponente");
        int exponente = scanner.nextInt();
        return potencia(base, exponente);
    }

    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}