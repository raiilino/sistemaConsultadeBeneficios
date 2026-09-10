import java.util.Scanner;

class ExerciciosBeneficios4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a modalidade de trabalho (home office ou presencial): ");
        String modalidade = entrada.nextLine();

        if (modalidade.equalsIgnoreCase("home office")) {
            System.out.println(nome + " tem direito ao Auxílio Home Office. ");
        } else {
            System.out.println(nome + " NÃO tem direito ao Auxílio Home Office. ");
        }
    }
}