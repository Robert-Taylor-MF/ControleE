package menus;


public class Menus {

        private int op;

        public Menus(){}

        public int getOp() {return op;}

        public void setOp(int op) {
                this.op = op;
        }

        public static void menuPrincipal(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Menu Principal");
                System.out.println("1 - Cadastro de Produtos");
                System.out.println("2 - Movimentação");
                System.out.println("3 - Reajuste de Preços");
                System.out.println("4 - Relatórios");
                System.out.println("0 - Finalizar");
                System.out.print("Opção: ");
        }

        public static void menuCadastro(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Cadastro de Produtos");
                System.out.println("1 - Inclusão");
                System.out.println("2 - Alteração");
                System.out.println("3 - Consulta");
                System.out.println("4 - Exclusão");
                System.out.println("0 - Retornar");
                System.out.print("Opção: ");
        }

        public static void menuCadastroInclusao(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Inclusão de Produtos");
                System.out.println();
        }

        public static void menuCadastroAlteracao(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Alteração de Produto");
                System.out.println();
        }

        public static void relatorio(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Lista de Preços:");
                System.out.println();
        }

        public static void menuMovimentacao(){
                System.out.println("--------------------------------------");
                System.out.println("Empresa de Importação de Produtos LTDA");
                System.out.println("   Sistema de controle de estoque ");
                System.out.println("--------------------------------------");
                System.out.println("Movimentação de Produtos");
                System.out.println("1 - Entrada");
                System.out.println("2 - Saida");
                System.out.println("0 - Retornar");
                System.out.print("Opção: ");
        }

}
