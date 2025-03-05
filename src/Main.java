import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao TP 2 de Java de Samuel!");

        int x;

        do {
            System.out.println("\nEscolha um exercício para rodar:");
            System.out.print("Digite a opção desejada: ");
            System.out.println("0 - Sair");
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " - Exercício " + i);
            }

            x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 0 -> System.exit(0);
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 5 -> ex5();
                case 6 -> ex6();
                case 7 -> ex7();
                case 8 -> ex8();
                case 9 -> ex9();
                case 10 -> ex10();
                case 11 -> ex11();
                case 12 -> ex12();
                default -> System.out.println("Valor inválido! Tente novamente.");
            }
        } while (x != 0);
        sc.close();
    }

    public static void ex1() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 1:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite qual é a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite qual é o nome da sua mãe: ");
        String motherName = sc.nextLine();
        System.out.print("Digite qual é o nome do seu pai: ");
        String fatherName = sc.nextLine();

        if (name.length() < motherName.length() ) {
            System.out.println("O nome da mãe " + motherName + " com " + motherName.length() + " caracteres é maior do que o do usuário " + name + " com " + name.length() + ".");
        }

        if (name.length() < fatherName.length()) {
            System.out.println("O nome do pai " + fatherName + " com " + fatherName.length() + " caracteres é maior do que o do usuário " + name + " com " + name.length() + ".");
        }

        if (name.length() > motherName.length() && name.length() > fatherName.length()) {
            System.out.println("O nome do usuário " + name + " com " + name.length() + " caracteres é maior que o nome dos pais.");
        }

        System.out.println("\nE os dados inseridos são:");
        System.out.println("Nome do Usuário: " + name);
        System.out.println("Quantidade de Caracteres do nome do Usuário: " + name.length());
        System.out.println("Idade do Usuário: " + idade);
        System.out.println("Nome da Mãe: " + motherName);
        System.out.println("Quantidade de Caracteres do nome da Mãe: " + motherName.length());
        System.out.println("Nome do Pai: " + fatherName);
        System.out.println("Quantidade de Caracteres do nome do Pai: " + fatherName.length());

        System.out.println("\n==============\n");
    }

    public static void ex2() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 2:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as quatro notas bimestrais a seguir. Notas aceitas de (0-10).\n\n");

        System.out.print("Digite a nota do primeiro Bimestre: ");
        int first = sc.nextInt();
        System.out.print("Digite a nota do segundo Bimestre: ");
        int second = sc.nextInt();
        System.out.print("Digite a nota do terceiro Bimestre: ");
        int third  = sc.nextInt();
        System.out.print("Digite a nota do quarto Bimestre: ");
        int four  = sc.nextInt();

        int sum = first + second + third + four;
        double average = (double) sum / 4;

        System.out.println("A soma das suas notas deu: " + sum);
        System.out.println("A média das suas notas foram: " + average);

        if (average >= 7) {
            System.out.println("Parabéns você foi aprovado e passou de ano!");
        }

        if (average >= 5 && average <= 6.9) {
            System.out.println("Quase lá, você está de recuperação!");
        }

        if (average < 5) {
            System.out.println("Você foi reprovado. Continue firme no próximo ano!");
        }

        System.out.println("\n==============\n");
    }

    public static void ex3() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 3:");

        Scanner sc = new Scanner(System.in);

        final double EXCHANGE_RATE_USD = 5.88;
        final double EXCHANGE_RATE_EUR = 6.24;
        final double EXCHANGE_RATE_GBP = 7.52;

        System.out.print("Digite o valor em reais (BRL): ");
        double amountInBRL = sc.nextDouble();

        System.out.print("Escolha a moeda de destino (dólar, euro ou libra): ");
        String targetCurrency = sc.next().toLowerCase();

        double convertedAmount = 0;
        String currencySymbol = "";

        switch (targetCurrency) {
            case "dólar", "dolar":
                convertedAmount = amountInBRL / EXCHANGE_RATE_USD;
                currencySymbol = "USD";
                break;
            case "euro":
                convertedAmount = amountInBRL / EXCHANGE_RATE_EUR;
                currencySymbol = "EUR";
                break;
            case "libra":
                convertedAmount = amountInBRL / EXCHANGE_RATE_GBP;
                currencySymbol = "GBP";
                break;
            default:
                System.out.println("Moeda inválida! Escolha entre dólar, euro ou libra.");
                return;
        }

        convertedAmount = Math.round(convertedAmount * 100.0) / 100.0;

        System.out.println("O valor convertido é: " + convertedAmount + " " + currencySymbol);

        System.out.println("\n==============\n");
    }

    public static void ex4() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 4:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia do seu nascimento: ");
        int day = sc.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        int month = sc.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        int year = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);

        LocalDate currentDate = LocalDate.now();

        long daysLived = ChronoUnit.DAYS.between(birthDate, currentDate);

        System.out.println("Você viveu " + daysLived + " dias.");

        System.out.println("\n==============\n");
    }

    public static void ex5() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 5:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double purchaseValue = sc.nextDouble();

        double discountPercentage = 0;
        double discountValue = 0;
        double finalValue = purchaseValue;


        if (purchaseValue > 1000) {
            discountPercentage = 0.10;
        } else if (purchaseValue >= 500 && purchaseValue <= 1000) {
            discountPercentage = 0.05;
        }

        discountValue = purchaseValue * discountPercentage;
        finalValue = purchaseValue - discountValue;

        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Valor Original: " + purchaseValue);
        System.out.println("Percentual de Desconto: " + (discountPercentage * 100) + "%");
        System.out.println("Valor do Desconto: " + discountValue);
        System.out.println("Valor Final: " + finalValue);

        System.out.println("\n==============\n");
    }

    public static void ex6() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 6:");
        System.out.println("\n==============\n");
    }

    public static void ex7() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 7:");
        System.out.println("\n==============\n");
    }

    public static void ex8() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 8:");
        System.out.println("\n==============\n");
    }

    public static void ex9() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 9:");
        System.out.println("\n==============\n");
    }

    public static void ex10() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 10:");
        System.out.println("\n==============\n");
    }

    public static void ex11() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 11:");
        System.out.println("\n==============\n");
    }

    public static void ex12() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 12:");
        System.out.println("\n==============\n");
    }
}
