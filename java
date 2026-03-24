import java.util.Scanner;

       class Operacao {

            public double calcular(int a, int b, String operacao) {
                switch (operacao) {
                    case "+":
                        return a + b;
                    case "-":
                        return a - b;
                    case "*":
                        return a * b;
                    case "/":
                        if (b == 0) {
                            System.out.println("Erro: Divisão por zero não permitida!");
                            return 0;
                        }
                        return (double) a / b;
                    default:
                        System.out.println("Operação inválida!");
                        return 0;
                }
            }

            public double calcular(double a, double b, String operacao) {
                switch (operacao) {
                    case "+": return a + b;
                    case "-": return a - b;
                    case "*": return a * b;
                    case "/":
                        if (b == 0) {
                            System.out.println("Erro: Divisão por zero!");
                            return 0;
                        }
                        return a / b;
                    default:
                        System.out.println("Operação inválida!");
                        return 0;
                }
            }
        }


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Operacao op = new Operacao();
                boolean continuar = true;

                System.out.println("=== SISTEMA DE TABUADA POLIMÓRFICA ===");

                while (continuar) {
                    System.out.print("\nDigite o número base para a tabuada: ");
                    int numero = scanner.nextInt();

                    System.out.print("Digite a operação (+, -, *, /): ");
                    String sinal = scanner.next();

                    System.out.println("\n--- RESULTADO ---");
                    for (int i = 1; i <= 10; i++) {
                        double resultado = op.calcular(numero, i, sinal);
                        System.out.println(numero + " " + sinal + " " + i + " = " + resultado);
                    }

                    System.out.print("\nDeseja calcular outra tabuada? (S/N): ");
                    String resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        continuar = false;
                        System.out.println("Encerrando o sistema. Até logo!");
                    }
                }
                scanner.close();
            }
        }
