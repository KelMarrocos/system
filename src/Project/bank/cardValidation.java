package Project.bank;

import java.util.Scanner;

public class cardValidation {
    public cardValidation {
        bank bankObj = new bank();
        validCPF validCPFObj = new validCPF();

        Scanner scan = new Scanner(System.in);


    }

    public escolherPagamento {

        bank bankObj = new bank();
        validCPF validCPFObj = new validCPF();

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - À vista");
        System.out.println("2 - Parcelado em até 10 vezes");

        int paymentMethod = scan.nextInt();
        int numInstallments = 1; // Número de parcelas padrão (à vista)

        if (paymentMethod == 2) {
            System.out.println("Digite o número de parcelas desejado (1 a 10): ");
            numInstallments = scan.nextInt();

            if (numInstallments < 1 || numInstallments > 10) {
                System.out.println("Número de parcelas inválido.");
            }
        }
        System.out.println("Detalhes do pagamento:");
        System.out.println("Número do Cartão: " + digits);
        System.out.println("Data de Validade: " + expirationDate);
        System.out.println("CVV: " + cvv);
        System.out.println("CPF: " + cpf);
        System.out.println("Método de pagamento: " + (paymentMethod == 1 ? "À vista" : "Parcelado em " + numInstallments + " vezes"));
    }

    public cartão {

        bank bankObj = new bank();
        validCPF validCPFObj = new validCPF();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os 16 digitos do cartão: ");
        String digits = scan.nextLine(); // Ler a entrada como uma String

        // Remover espaços em branco e outros caracteres não numéricos
        String cleanedDigits = digits.replaceAll("\\s+", "");

        // Verificar se o número de dígitos é exatamente 16 após a remoção
        if (cleanedDigits.length() != 16 || !cleanedDigits.matches("\\d+")) {
            System.out.println("Número de cartão inválido.");
           // Saída do programa se o número do cartão for inválido
        }
        bankObj.setCard(digits);

        System.out.println("Digite a data de validade (MM/AA): ");
        String expirationDate = scan.nextLine();
        bankObj.setDate(expirationDate);


        System.out.println("Digite o CVV (código de segurança): ");
        String cvv = scan.nextLine();
        bankObj.setCvv(cvv);

        System.out.println("Digite o CPF (com pontos e traços): ");
        String cpf = scan.nextLine();
        bankObj.setCpf(cpf);
        validCPFObj.equals(cpf);
    }
}



