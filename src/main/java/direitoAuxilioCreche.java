import java.util.Scanner;

class ExerciciosBeneficios2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a quantidade de filhos: ");
        int quantidadeFilhos = entrada.nextInt();

        if (quantidadeFilhos > 0) {
            System.out.println(nome + " tem direito ao Auxílio-Creche. ");
        } else {
            System.out.println(nome + " NÃO tem direito ao Auxílio-Creche. ");
        }
    }
}