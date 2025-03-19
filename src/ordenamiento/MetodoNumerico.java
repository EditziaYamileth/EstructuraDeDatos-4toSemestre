package ordenamiento;

import java.util.Scanner;

public class MetodoNumerico {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	  System.out.println("\n\n\t   \033[1mInstituto Tecnológico de Culiacán\033[0m\n"
                  + "   \033[1mIng. En sistemas computacionales\033[0m\n\n"
                  + "Villa Zuñiga Luciano Ivan\n"
                  + "\033[1mSolución de Ecuaciones.\033[0m\n"
                  + "De 13:00 a 14:00 horas.\n\n"
                  + "Este programa ejecuta la solución de problemas\n"
                  + "utilizando los procesos lógicos de cálculo de Raíces de\n"
                  + "una ecuación con diversos métodos numéricos.\n\n"
                  + "\033[1mPregunta del Problema:\033[0m\n"
                  + "Un camión cisterna desea transportar agua para una obra.\n"
                  + "Debe contener el 85% de su capacidad total según la NTP.\n"
                  + "Se necesita calcular la altura “h” hasta la cual debe ser llenado.\n"
                  + "Datos:\n"
                  + "Base menor (b) = 90 cm\n"
                  + "Base mayor (a) = 130 cm\n"
                  + "Longitud (L) = 1120 cm\n\n"
                  + "¿A qué altura debe llenarse para cumplir con el 85% de capacidad?\n");
        
        System.out.print("            \033[1mRaices de una ecuacion\033[0m" +
            "\n\n   1. Metodo de la secante" + 
        	"\n\n   2. Metodo de Newton Raphson"+
            "\n\n   10. F I N\n\n"
            + "   \033[1mCual es su opcion: \033[0m");
        	int op = scanner.nextInt();
            int totalC = 50;
            double error = 0.000001;
            while(op !=10) {
               	if(op == 1) {
            		double x1 = 0.0;
                    double x2 = 0.18;
                    double x3;
                    
                    System.out.println("\n");
                    System.out.print(
                            "\n\n\t   \033[1mInstituto Tecnológico de Culiacán\033[0m\n"
                            + "   \033[1mIng. En sistemas computacionales\033[0m\n\n"
                            +"Villa Zuñiga Luciano Ivan\n"
                            + "De 13:00 a 14:00 horas.\n\n"
                            +"\033[1mRaices de una ecuacion: Metodo de la secante\033[0m\n" +
                            "Pregunta : Calcular la raíz de la ecuación "
                            + "\nf(x)= asin((10/9) * x - 1) + ((10/9) * x - 1) * sqrt(1 - ((10/9) * x - 1)) - 1.00144" +
                            "\n\n");
                    System.out.println("=================================================================================================================================");
                    System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s %-20s%n", "N", "x1", "f(x1)", "x2", "f(x2)", "x3", "f(x3)");
                    System.out.println("=================================================================================================================================");
                    
    				for (int i = 0; i <= totalC; i++) {
    					if (Math.abs(function(x2)) < error) {
                            break;
                        }
                        x3 = metodoSecante(x1, x2);
                        mostrar(i + 1, x1, x2);
                        x1 = x2;
                        x2 = x3;
                    }
                    System.out.println("=================================================================================================================================");
                    System.out.println("La solucion de la ecuacion es = " + x2 + " metros\n\n");
                    System.out.print("            \033[1mRaices de una ecuacion\033[0m" +
                            "\n\n   1. Metodo de la secante" + 
                        	"\n\n   2. Metodo de Newton Raphson"+
                            "\n\n   10. F I N\n\n"
                            + "   \033[1mCual es su opcion: \033[0m");
                        	op = scanner.nextInt();
                        	System.out.println();
            	}
               	
            	
            	if(op == 2){
            		double pi = 0.4;

                    System.out.print(
                                    "\n\n\t   \033[1mInstituto Tecnológico de Culiacán\033[0m\n"
                                    + "   \033[1mIng. En sistemas computacionales\033[0m\n\n"
                                    +"Villa Zuñiga Luciano Ivan\n"
                                    + "De 13:00 a 14:00 horas.\n\n"
                                    +"\033[1mRaices de una ecuacion: Metodo de Newton Raphson\033[0m\n" +
                                    "Pregunta : Calcular la raíz de la ecuación "
                                    + "\nf(x)= asin((10/9) * x - 1) + ((10/9) * x - 1) * sqrt(1 - ((10/9) * x - 1)) - 1.00144" +
                                    "\n\n");
                    System.out.println("============================================================================================================");
                    System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s%n", "N", "x1", "f(x1)", "f'(x1)", "x2", "f(x2)");
                    System.out.println("============================================================================================================");
                    
                    for (int i = 0; i <= totalC; i++) {
                        if (Math.abs(function(pi)) < error) {
                            break;
                        }
                        mostrar(i + 1, pi);
                        pi = metodoTangente(pi);
                    }
                    
                    System.out.println("============================================================================================================");
                    System.out.println("La solucion de la ecuacion es = " + pi + " metros\n");
                    System.out.print("            \033[1mRaices de una ecuacion\033[0m" +
                            "\n\n   1. Metodo de la secante" + 
                        	"\n\n   2. Metodo de Newton Raphson"+
                            "\n\n   10. F I N\n\n"
                            + "   \033[1mCual es su opcion: \033[0m");
                        	op = scanner.nextInt();
                        	System.out.println("\n");
            	}
            }
            	
            
 
    }

    public static void mostrar(int n, double x) {
        double fx1 = function(x);
        double fpx1 = functionDerivada(x);
        double x2 = metodoTangente(x);
        double fx2 = function(x2);
        System.out.printf("%-5d %-20.15f %-20.15f %-20.15f %-20.15f %-20.15f%n", n, x, fx1, fpx1, x2, fx2);
    }

    public static void mostrar(int n, double x1, double x2) {
        double fx1 = function(x1);
        double fx2 = function(x2);
        double x3 = metodoSecante(x1, x2);
        double fx3 = function(x3);
        System.out.printf("%-5d %-20.15f %-20.15f %-20.15f %-20.15f %-20.15f %-20.15f%n", n, x1, fx1, x2, fx2, x3, fx3);
    }

    public static double function(double x) {
        return Math.asin((10.0 / 9) * x - 1) + ((10.0 / 9) * x - 1) * Math.sqrt(1 - ((10.0 / 9) * x - 1)) - 1.00144;
    }

    public static double functionDerivada(double x) {
        return (10.0 / (9 * Math.sqrt(1 - Math.pow(((10 * x) / 9 - 1), 2)))
                - (5 * ((10.0 * x) / 9 - 1)) / (9 * Math.sqrt(2 - (10 * x) / 9))
                + (10 * Math.sqrt(2 - (10 * x) / 9)) / 9);
    }

    public static double metodoTangente(double x) {
        return x - function(x) / functionDerivada(x);
    }

    public static double metodoSecante(double x1, double x2) {
        return x2 - ((function(x2)) * (x1 - x2)) / (function(x1) - function(x2));
    }
}
