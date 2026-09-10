import java.util.Scanner;

class ExerciciosBeneficios1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe o salário: R$ ");
        double salario = entrada.nextDouble();

        // Exemplo de regra: Vale-alimentação para quem ganha até R$ 5.000,00
        if (salario <= 5000) {
            System.out.println(nome + " tem direito ao Vale-Alimentação. ");
        } else {
            System.out.println(nome + " NÃO tem direito ao Vale-Alimentação. ");
        }
    }
}