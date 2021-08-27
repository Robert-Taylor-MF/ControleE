package aplicacao;

import entidades.Produto;
import menus.Menus;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Menus opcao = new Menus();

        Produto[] prod= new Produto[10];

        while(opcao.getOp() == 0) {
            Menus.menuPrincipal();
            opcao.setOp(sc.nextInt());
            if (opcao.getOp() == 1) {
                while(opcao.getOp() == 1){
                    Menus.menuCadastro();
                    opcao.setOp(sc.nextInt());
                    if(opcao.getOp() == 1) {
                        while (opcao.getOp() == 1) {
                            sc.nextLine();
                            Menus.menuCadastroInclusao();
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();
                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Unidade: ");
                            String unidade = sc.nextLine();
                            System.out.print("Quantidade: ");
                            int quantidade = sc.nextInt();
                            System.out.print("Confirmar Inclusão (S/N)?: ");
                            char cadastrar = sc.next().charAt(0);
                            if (cadastrar == 's') {
                                Produto produto = new Produto(nome, preco, unidade, quantidade);
                                for(int i = 0; i < prod.length; i++){
                                    if(prod[i] != null){
                                        prod[i] = produto;
                                    }
                                }
                            }
                            System.out.print("Repetir Operação (S/N)?: ");
                            char repetir = sc.next().charAt(0);
                            if (repetir == 's') {
                                opcao.setOp(1);
                            } else {
                                opcao.setOp(0);
                            }
                        }
                        opcao.setOp(1);
                    }else if(opcao.getOp() == 2){
                        sc.nextLine();
                        Menus.menuCadastroAlteracao();
                        System.out.print("Informe o nome do produto: ");
                        String nome = sc.nextLine();

                    }
                }
            }else if(opcao.getOp() == 2){
                Menus.menuMovimentacao();
                opcao.setOp(sc.nextInt());
            }else if(opcao.getOp() == 4){
                Menus.relatorio();
                Produto produto = new Produto();
                System.out.println(produto);
                System.out.print("Desejo retornar para o menu principal (S/N)?: ");
                char retornar = sc.next().charAt(0);
                if(retornar == 's'){
                    opcao.setOp(0);
                }
            }else{
                break;
            }
        }

    }

}
