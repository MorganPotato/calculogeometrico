import java.util.Scanner;

public class calculator40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcmenu, opccalcu;
        double result = 0.0;

        System.out.println("\tBIENVENIDO AL CALCULATOR 4000");
        System.out.println("\n\tPor favor seleccione una figura geométrica");
        System.out.println("\n1. Calcular Circulo");
        System.out.println("\n2. Calcular Cuadrado");
        System.out.println("\n3. Calcular Triangulo");
        System.out.println("\n4. Calcular Rectangulo");
        System.out.println("\n5. Calcular Pentagono");

        opcmenu = scanner.nextInt();
        System.out.println("\nSELECCIONE EL TIPO DE OPERACIÓN:");
        System.out.println("\n1. Calcular Área");
        System.out.println("\n2. Calcular Perímetro");

        opccalcu = scanner.nextInt();

        switch (opcmenu) {
            case 1:
                if (opccalcu == 1)
                    result = calAreaCirculo(scanner);
                else if (opccalcu == 2)
                    result = calPerimetroCirculo(scanner);
                break;
            case 2:
                if (opccalcu == 1)
                    result = calAreaCuadrado(scanner);
                else if (opccalcu == 2)
                    result = calPerimetroCuadrado(scanner);
                break;
            case 3:
                if (opccalcu == 1)
                    result = calAreaTriangulo(scanner);
                else if (opccalcu == 2)
                    result = calPerimetroTriangulo(scanner);
                break;
            case 4:
                if (opccalcu == 1)
                    result = calAreaRectangulo(scanner);
                else if (opccalcu == 2)
                    result = calPerimetroRectangulo(scanner);
                break;
            case 5:
                if (opccalcu == 1)
                    result = calAreaPentagono(scanner);
                else if (opccalcu == 2)
                    result = calPerimetroPentagono(scanner);
                break;
            default:
                System.out.println("Opción incorrecta...");
                return;
        }
        System.out.println("\n\tEl resultado es: " + result);
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
}
