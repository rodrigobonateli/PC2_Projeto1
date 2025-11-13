import util.Consola;

import java.util.Date;

public class Main {

    public static AssociacaoDesportiva associacaoDesportiva = new AssociacaoDesportiva();
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
                                adicionarEquipa();
                                break;
                            case 2:
                                System.out.println("Consultar todas as equipas");
                                if(associacaoDesportiva.getNumTotalEquipas() == 0){
                                    System.out.println("Não há equipes registadas!");
                                    break;
                                }
                                System.out.println(associacaoDesportiva.mostrarEquipas());
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
                                adicionarPessoa();
                                break;
                            case 2:
                                System.out.println("Consultar todas as pessoas");
                                if(associacaoDesportiva.getNumTotalPessoas() == 0){
                                    System.out.println("Não há pessoas registadas!");
                                    break;
                                }
                                System.out.println(associacaoDesportiva.mostrarPessoas());
                                break;
                            case 3:
                                System.out.println("Consultar por número");
                                if(associacaoDesportiva.getNumTotalPessoas() == 0){
                                    System.out.println("Não há pessoas registadas!");
                                    break;
                                }
                                consultarPessoaPorId();
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

    private static void consultarPessoaPorId() {
        int id = Consola.lerInt("Inserir o id da pessoa: ", 1, Integer.MAX_VALUE);
        int indexPessoa = associacaoDesportiva.pesquisarPessoaPorId(id);
        if(indexPessoa == -1){
            System.out.println("Id não encontrado.");
            return;
        }
        Pessoa pessoa = associacaoDesportiva.obterPessoa(indexPessoa);
        System.out.println(pessoa);
    }

    private static void adicionarEquipa() {
        int id = Consola.lerInt("Inserir id da equipa: ", 1,Integer.MAX_VALUE);
        String nome = Consola.lerString("Inserir nome da equipa: ");
        String modalidade = Consola.lerString("Inserir a modalidade da equipa: ");

        Equipa equipa = new Equipa(id, nome, modalidade);
        associacaoDesportiva.adicionarEquipa(equipa);
        System.out.println("Equipa adicionada com sucesso!");
    }

    private static void adicionarPessoa() {
        int tipoPessoa = Consola.lerInt("Indique tipo (1-Atleta 2-Treinador 3-Árbitro)", 1,3);
        if(associacaoDesportiva.getNumTotalEquipas() == 0 && (tipoPessoa == 1 || tipoPessoa == 2)){
            System.out.println("Não há equipas criadas. Impossível adicionar atleta ou treinador!");
            return;
        }
        String nome = Consola.lerString("Insira o nome: ");
        int id = Consola.lerInt("Inserir o id: ", 1, Integer.MAX_VALUE);
        boolean idUnico = associacaoDesportiva.pesquisarPessoaPorId(id) == -1;

        do {
            if(!idUnico){
                System.out.println("Id repetido. Insira um id válido.");
                id = Consola.lerInt("Inserir o id: ", 1, Integer.MAX_VALUE);
                idUnico = associacaoDesportiva.pesquisarPessoaPorId(id) == -1;
            }
        }while(!idUnico);
        System.out.println("Id válido!");

        Date dataNascimento = Consola.lerData("Inserir data de nascimento (dd-mm-aaaa)","dd-MM-yyyy");
        int contacto = Consola.lerInt("Inserir contacto: ", 1, Integer.MAX_VALUE);
        String modalidade = Consola.lerString("Inserir modalidade: ");

        if(tipoPessoa == 1){
            System.out.println(associacaoDesportiva.mostrarEquipas());
            int idEquipa = Consola.lerInt("Inserir id da equipa do atleta: ", 1, Integer.MAX_VALUE);
            int posEquipa = associacaoDesportiva.pesquisarEquipaPorId(idEquipa);
            Equipa equipa = associacaoDesportiva.obterEquipa(posEquipa);
            Atleta atleta =  new Atleta(id,nome,dataNascimento,contacto,modalidade,equipa);
            associacaoDesportiva.adicionarAtleta(atleta);
            equipa.adicionarAtleta(atleta);
            System.out.println("Atleta adicionado com sucesso!");
        }else if(tipoPessoa == 2){
            int anosExperiencia = Consola.lerInt("Inserir anos de experiencia: ", 1, 100);
            System.out.println(associacaoDesportiva.mostrarEquipas());
            int idEquipa = Consola.lerInt("Inserir id da equipa do treinador: ", 1, Integer.MAX_VALUE);
            int posEquipa = associacaoDesportiva.pesquisarEquipaPorId(idEquipa);
            Equipa equipa = associacaoDesportiva.obterEquipa(posEquipa);
            Treinador treinador =  new Treinador(id,nome,dataNascimento,contacto,modalidade,anosExperiencia, equipa);
            associacaoDesportiva.adicionarTreinador(treinador);
            equipa.setTreinador(treinador);
            System.out.println("Treinador adicionado com sucesso!");
        }else{
            int nivelCertificacao = Consola.lerInt("Inserir nivel de certificacao: ", 1, 10);
            Arbitro arbitro =  new Arbitro(id,nome,dataNascimento,contacto,modalidade,nivelCertificacao);
            associacaoDesportiva.adicionarArbitro(arbitro);
            System.out.println("Árbitro adicionado com sucesso!");
        }



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