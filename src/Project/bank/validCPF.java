package Project.bank;

public class validCPF {
    public static boolean isValidCPF(String cpf) {


        // Verifica se o CPF tem 11 dígitos numéricos
        if (!cpf.matches("\\d{11}")) {
            return false;
        }

        // Calcula os dígitos verificadores
        int sum;
        int remainder;
        int digit;

        // Calcula o primeiro dígito verificador
        sum = 0;
        for (int i = 1; i <= 9; i++) {
            digit = Integer.parseInt(cpf.substring(i - 1, i));
            sum += digit * (11 - i);
        }
        remainder = (sum * 10) % 11;
        if (remainder == 10) {
            remainder = 0;
        }
        if (remainder != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }

        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            digit = Integer.parseInt(cpf.substring(i - 1, i));
            sum += digit * (12 - i);
        }
        remainder = (sum * 10) % 11;
        if (remainder == 10) {
            remainder = 0;
        }
        return remainder == Integer.parseInt(cpf.substring(10, 11));
    }

    public static String formatCPF(String cpf) {
        // Formata o CPF com pontos e traços para exibição
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }
}

