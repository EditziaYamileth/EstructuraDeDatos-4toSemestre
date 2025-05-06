// 23170368 - Villa Zuñiga Luciano Ivan 
// 23170107 - Stephen Manuel Camargo Ochoa
// 23170220 - Lopez Sanchez Ary Daniel

package unidad3;
import java.util.Scanner;

public class ExpresionAlgebraicaInfija {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la expresion algebraica: ");
        String expresion = sc.nextLine();

        int resultado = evaluarExpresion(expresion);
        System.out.println("Resultado: " + resultado);
    }

    public static boolean esSimbolo(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedencia(char operador) {
        return switch (operador) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }

    public static int aplicarOperacion(int a, int b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("División por cero no permitida");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
  
    // En caso de que sea un numero mayor a 9 (ej: 20, 100)
    public static class ResultadoNumero {
        int numero;
        int nuevoIndice;

        ResultadoNumero(int numero, int nuevoIndice) {
            this.numero = numero;
            this.nuevoIndice = nuevoIndice;
        }
    }

    public static ResultadoNumero obtenerNum(int i, String expresion) {
        StringBuilder sb = new StringBuilder();
        while (i < expresion.length() && Character.isDigit(expresion.charAt(i))) {
            sb.append(expresion.charAt(i));
            i++;
        }
        int numero = Integer.parseInt(sb.toString());
        return new ResultadoNumero(numero, i - 1); // se ajusta para el for
    }

    public static int evaluarExpresion(String expresion) {
        Pila<Integer> numeros = new Pila<>(expresion.length());
        Pila<Character> operadores = new Pila<>(expresion.length());

        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (Character.isWhitespace(ch)) continue;

            if (Character.isDigit(ch)) {
                ResultadoNumero res = obtenerNum(i, expresion);
                numeros.push(res.numero);
                i = res.nuevoIndice;
            } else if (ch == '(') {
                operadores.push(ch);
            } else if (ch == ')') { // Va a inicar cuando encuetre el que cierra
                while (!operadores.isEmpty()) {
                    char top = operadores.pop();
                    if (top == '(') break; // Y terminara cuando encuentre el que abre

                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(aplicarOperacion(a, b, top));
                }
            } else if (esSimbolo(ch)) {
                while (!operadores.isEmpty()) {
                    char opTop = operadores.pop();
                    
                    // La gerarquia de los operadores
                    if (precedencia(opTop) < precedencia(ch)) { 
                        operadores.push(opTop);
                        break;
                    }

                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(aplicarOperacion(a, b, opTop));
                }

                operadores.push(ch);
            }

            /*
            System.out.println();
            System.out.println("****************************************");
            System.out.print(i + " -> " +ch);
            System.out.println();
            numeros.printPila();
            System.out.println();
            operadores.printPila();
            */
        }

        // Evaluar cualquier operador que quede
        while (!operadores.isEmpty()) {
            char op = operadores.pop();
            int b = numeros.pop();
            int a = numeros.pop();
            numeros.push(aplicarOperacion(a, b, op));
        }

        return numeros.pop(); // el resultado final
    }
}
