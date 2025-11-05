import util.Consola;

public class Main {
    public static void main(String[] args) {
        int opcao, opcao2;
        do {
            opcao = menuPrincipal();
            switch (opcao){
                case 1:
                    System.out.println("Gestão de equipas");
                    do{
                        opcao2 = menuGestaoEquipas();
                        switch (opcao2){
                            case 1:
                                System.out.println("Inserir equipas");
                                break;
                            case 2:
                                System.out.println("Consultar todas as equipas");
                                break;
                            case 0:
                                System.out.println("Voltar atrás");
                                break;
                        }
                        if(opcao2 != 0)
                            Consola.sc.nextLine();
                    }while(opcao2 != 0);
                    break;
                case 2:
                    System.out.println("Gestão de pessoas");
                    do{
                        opcao2 = menuGestaoPessoas();
                        switch (opcao2){
                            case 1:
                                System.out.println("Inserir pessoa");
                                break;
                            case 2:
                                System.out.println("Consultar todas as pessoas");
                                break;
                            case 3:
                                System.out.println("Consultar por número");
                                break;
                            case 0:
                                System.out.println("Voltar atrás");
                                break;
                        }
                        if(opcao2 != 0)
                            Consola.sc.nextLine();
                    }while(opcao2 != 0);
                    break;
                case 3:
                    System.out.println("Gestão de eventos Desportivos");
                    do{
                        opcao2 = menuGestaoEventosDesportivos();
                        switch (opcao2){
                            case 1:
                                System.out.println("Inserir evento desportivo");
                                break;
                            case 2:
                                System.out.println("Consultar por modalidade");
                                break;
                            case 0:
                                System.out.println("Voltar atrás");
                                break;
                        }
                        if(opcao2 != 0)
                            Consola.sc.nextLine();
                    }while(opcao2 != 0);
                    break;
                case 4:
                    System.out.println("Associar participantes a eventos desportivos.");
                    break;
                case 5:
                    System.out.println("Gestão de resultados");
                    do{
                        opcao2 = menuGestaoResultados();
                        switch (opcao2){
                            case 1:
                                System.out.println("Inserir resultado");
                                break;
                            case 2:
                                System.out.println("Consultar por nome evento desportivo");
                                break;
                            case 0:
                                System.out.println("Voltar atrás");
                                break;
                        }
                        if(opcao2 != 0)
                            Consola.sc.nextLine();
                    }while(opcao2 != 0);
                    break;
                case 6:
                    System.out.println("Estatísticas");
                    do{
                        opcao2 = menuGestaoEstatistica();
                        switch (opcao2){
                            case 1:
                                System.out.println("Consultar o número total de atletas por equipa");
                                break;
                            case 2:
                                System.out.println("Listar os vencedores de cada torneio");
                                break;
                            case 3:
                                System.out.println("Calcular a média de pontuações por atleta e por modalidade");
                                break;
                            case 4:
                                System.out.println("Listar os 5 atletas com melhor média geral");
                                break;
                            case 5:
                                System.out.println("Mostrar o número total de eventos realizados por árbitro");
                                break;
                            case 0:
                                System.out.println("Voltar atrás");
                                break;
                        }
                        if(opcao2 != 0)
                            Consola.sc.nextLine();
                    }while(opcao2 != 0);
                    break;
            }
            if(opcao != 0)
                Consola.sc.nextLine(); //espera o enter do utilizador
        }while (opcao != 0);
        System.out.println("Terminando programa.");
    }

    private static int menuGestaoEstatistica() {
        System.out.println("1 - Consultar o número total de atletas por equipa");
        System.out.println("2 - Listar os vencedores de cada torneio");
        System.out.println("3 - Calcular a média de pontuações por atleta e por modalidade");
        System.out.println("4 - Listar os 5 atletas com melhor média geral");
        System.out.println("5 - Mostrar o número total de eventos realizados por árbitro");
        System.out.println("0 - Voltar atrás");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 4);
        return opcao;
    }

    private static int menuPrincipal() {
        System.out.println("1 - Gestão de equipas");
        System.out.println("2 - Gestão de pessoas");
        System.out.println("3 - Gestão de eventos desportivos");
        System.out.println("4 - Associar participantes a eventos desportivos");
        System.out.println("5 - Gestão de resultados");
        System.out.println("6 - Estatísticas");
        System.out.println("0 - Sair");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 6);
        return opcao;
    }
    private static int menuGestaoEquipas() {
        System.out.println("1 - Inserir equipa");
        System.out.println("2 - Consultar todas as equipes");
        System.out.println("0 - Voltar atrás");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 2);
        return opcao;
    }
    private static int menuGestaoPessoas() {
        System.out.println("1 - Inserir pessoa");
        System.out.println("2 - Consultar todas as pessoas");
        System.out.println("3 - Consultar por número");
        System.out.println("0 - Voltar atrás");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 3);
        return opcao;
    }
    private static int menuGestaoEventosDesportivos() {
        System.out.println("1 - Inserir evento desportivo");
        System.out.println("2 - Consultar por modalidade");
        System.out.println("0 - Voltar atrás");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 2);
        return opcao;
    }
    private static int menuGestaoResultados() {
        System.out.println("1 - Iniciar resultado");
        System.out.println("2 - Consultar por nome evento desportivo");
        System.out.println("0 - Voltar atrás");
        int opcao = Consola.lerInt("Escolha uma opção: ", 0, 2);
        return opcao;
    }


}