import java.util.Scanner;

class ExerciciosBeneficios6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe o tempo de empresa (em anos): ");
        double tempoEmpresa = entrada.nextDouble();

        // Exemplo de regra: Participação na PLR para quem tem pelo menos 1 ano de empresa
        if (tempoEmpresa >= 1.0) {
            System.out.println(nome + " tem direito à Participação na PLR. ");
        } else {
            System.out.println(nome + " NÃO tem direito à Participação na PLR. ");
        }
    }
}