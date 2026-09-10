import java.util.Scanner;

class ExerciciosBeneficios3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe o tempo de empresa (em anos): ");
        double tempoEmpresa = entrada.nextDouble();

        // Exemplo de regra: Elegível após o período de experiência (0.3 anos / 3 meses)
        if (tempoEmpresa >= 0.3) {
            System.out.println(nome + " é elegível ao Plano de Saúde. ");
        } else {
            System.out.println(nome + " NÃO é elegível ao Plano de Saúde ainda. ");
        }
    }
}