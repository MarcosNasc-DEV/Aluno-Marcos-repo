    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Média");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {

                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcao) {

                    case 1:
                        System.out.println("Resultado da soma: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Resultado da subtração: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Resultado da multiplicação: " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado da divisão: " + (num1 / num2));
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                        }
                        break;

                    case 5:
                        System.out.println("Resultado da média: " + ((num1 + num2) / 2));
                        break;
                }

            } else if (opcao == 0) {

                System.out.println("Calculadora encerrada. Até mais!");

            } else {

                System.out.println("Opção inválida. Tente novamente.");

            }

        } while (opcao != 0);

        scanner.close();
    }
