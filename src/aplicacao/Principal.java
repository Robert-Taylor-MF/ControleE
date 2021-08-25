package aplicacao;

import entidades.Produto;
import menus.Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produto = new ArrayList<>();

        Menus.menuPrincipal();

        int op = sc.nextInt();

        Menus opcao = new Menus(op);

        switch (opcao.getOp()){
            case 1:
                Menus.menuCadastro();
                opcao.setOp(sc.nextInt());

                switch (opcao.getOp()){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 0:
                        Menus.menuPrincipal();
                        opcao.setOp(sc.nextInt());
                        break;
                }
                break;
            case 2:
                Menus.menuMovimentacao();
                break;
            case 3:
            case 4:
        }

    }

}
