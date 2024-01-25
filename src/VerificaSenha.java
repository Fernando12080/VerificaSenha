import java.util.Scanner;
public class VerificaSenha {
    public static void main(String[] args) {
        System.out.println("Dígite sua senha.");
        Scanner scanner = new Scanner(System.in);


        int maximoTentativas = 3;
        String senha = "teste";
        boolean senhaCorretaDigitada = false;

        // Inicia um loop for que se repetirá até que int tentativa que iniciou com valor de 1 seja maior que valor de tentativas máximas que é 3.
        for (int tentativa = 1; tentativa <= maximoTentativas; tentativa++){
            System.out.print("Tentativa " + tentativa + ": ");
            String escrevaSenha = scanner.nextLine();

        //Se a senha escrita for igual ao valor de senha, então senha digitada está correta e a verificação para, caso contrário a senha estará errada.
            if (escrevaSenha.equals(senha)) {
                senhaCorretaDigitada = true;
                System.out.println("Senha correta.");
                    break;
            } else {
                System.out.println("Senha incorreta.");


            }
        }
        //se senhaCorretaDigitada for false, o bloco de código dentro do if será executado.
        if (!senhaCorretaDigitada) {
            System.out.println("Você excedeu o número máximo de tentativas. Acesso bloqueado.");
        }
    }

}
