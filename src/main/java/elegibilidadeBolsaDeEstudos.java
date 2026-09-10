import java.util.Scanner;

class ExerciciosBeneficios7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Informe o tempo de empresa (em anos): ");
        double tempoEmpresa = entrada.nextDouble();

        // Exemplo de regra: Maior de 18 anos e com mais de 2 anos de empresa
        if (idade >= 18 && tempoEmpresa >= 2.0) {
            System.out.println(nome + " é elegível para Bolsa de Estudos.");
        } else {
            System.out.println(nome + " NÃO é elegível para Bolsa de Estudos.");
        }
    }
}