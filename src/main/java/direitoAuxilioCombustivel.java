import java.util.Scanner;

class ExerciciosBeneficios5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a modalidade de trabalho (presencial ou home office): ");
        String modalidade = entrada.nextLine();

        System.out.print("Utiliza veículo próprio? (sim/nao): ");
        String veiculoProprio = entrada.nextLine();

        if (modalidade.equalsIgnoreCase("presencial") && veiculoProprio.equalsIgnoreCase("sim")) {
            System.out.println(nome + " tem direito ao Auxílio Combustível. ");
        } else {
            System.out.println(nome + " NÃO tem direito ao Auxílio Combustível. ");
        }
    }
}