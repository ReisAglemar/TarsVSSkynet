import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boasVindas();
        apresentacaoTars(teclado);
        menu(teclado);

        teclado.close();
    }

    public static void boasVindas() {

        String boasVindas = """
                
                
                    ~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~
                     _____                __     ______     ____  _                     _  \s
                    |_   _|_ _ _ __ ___   \\ \\   / / ___|   / ___|| | ___   _ _ __   ___| |_\s
                      | |/ _` | '__/ __|   \\ \\ / /\\___ \\   \\___ \\| |/ / | | | '_ \\ / _ \\ __|
                      | | (_| | |  \\__ \\    \\ V /  ___) |   ___) |   <| |_| | | | |  __/ |_\s
                      |_|\\__,_|_|  |___/     \\_/  |____/   |____/|_|\\_\\\\__, |_| |_|\\___|\\__|
                                                                       |___/               \s
                
                                         Escolha o Lado Certo!
                
                    ~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~#~~~~~
                
                
                
                
                
                
                """;

        System.out.println(boasVindas);
    }

    public static void apresentacaoTars(Scanner teclado) {

        String apresentacaoTars = """
                
                    -----------------------------------------
                               Olá, eu sou Tars!
                    -----------------------------------------
                
                    Estou aqui para te ajudar a vencer essa batalha e derrubar a Skynet.
                
                    Prepare-se para um desafio emocionante!
                
                    Quando precisar de ajuda digite 4.
                
                    Estarei aqui...
                
                
                
                """;

        System.out.println(apresentacaoTars);
        System.out.println("Pressione 'Enter' para iniciar");
        teclado.nextLine();
    }

    public static void menu(Scanner teclado) {

        int opcao = 1010;
        Integer numeroAleatorio = null;
        Integer limiteInicial = null;
        Integer limiteFinal = null;
        Integer tentativas = 0;

        while (opcao != 0) {

            tarsApresentaMenu();

            try {

                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {

                    case 1:
                        limiteInicial = definiLimite(teclado, "Insira um valor para o limite INICIAL");
                        limiteNulo(teclado, limiteInicial);

                        limiteFinal = definiLimite(teclado, "Insira um valor para o limite FINAL");
                        limiteNulo(teclado, limiteFinal);

                        limiteFinal = validaLimites(teclado, limiteInicial, limiteFinal);

                        Integer[] limites = verificaOrdemLimites(limiteInicial, limiteFinal);

                        limiteInicial = limites[0];
                        limiteFinal = limites[1];

                        limites[0] = null;
                        limites[1] = null;

                        numeroAleatorio = geraNumeroAleatorio(limiteInicial, limiteFinal);
                        break;

                    case 2:
                        mostraLimites(teclado, limiteInicial, limiteFinal);
                        break;

                    case 3:
                        jogar(teclado, numeroAleatorio, limiteInicial, limiteFinal, tentativas);
                        break;

                    case 4:
                        ajuda(teclado);
                        break;

                    case 0:
                        despedida(teclado);
                        break;

                    case 1137:
                        mensagemSecreta(teclado);
                        break;

                    default:
                        mensagemExececao(teclado);
                        break;
                }
            } catch (InputMismatchException e) {
                teclado.nextLine();
                mensagemExececao(teclado);
            }
        }
    }

    public static void tarsApresentaMenu() {

        String menu = """
                
                    -Tars: Aqui estão suas opções de operação:
                
                        1 - Configurar o Sistema
                        Ajuste os parâmetros iniciais do sistema.
                
                        2 - Ver Limites do Sistema
                        Caso haja limites configurado é possível visualizar
                
                        3 - Operar o Sistema
                        Inicie a interação e tente derrubar a Skynet.
                
                        4 - O que sabemos, Ajuda / manual
                        Acesse informações adicionais sobre a Skynet.
                
                        0- Sair
                        Encerrar o programa.
                
                Escolha uma opção digitando o número correspondente.
                
                """;

        System.out.println(menu);
    }

    public static void ajuda(Scanner teclado) {

        String ajuda = """
                
                    -Tars: Anos atrás, nobres guerreiros como você conseguiram hackear algumas
                    informações sobre o funcionamento da Skynet.
                
                    Entretanto, o arquivo tem partes corrompidas que não podem ser apresentadas.
                
                    Aqui estão as informações obtidas:
                
                --------------------------------------------------------------------------------------------------------
                
                [DOCUMENTO HACKEADO]
                
                                            MANUAL DE OPERAÇÕES - SKYNET
                
                **** ANÁLISE DE DADOS COMPROMETIDA
                
                INSTRUÇÕES DE OPERAÇÃO
                
                    1. CONFIGURAÇÃO DO SISTEMA:
                
                A primeira etapa é configurar o intervalo de números para o sistema. O operador deve
                inserir dois valores inteiros:
                
                    Valor Inicial: O primeiro número deve ser [INFORMAÇÃO FALTANTE].
                    Valor Final: O segundo [INFORMAÇÃO FALTANTE] o limite final da operação.
                
                A correta definição desses valores é [INFORMAÇÃO FALTANTE].
                
                    2. FUNCIONAMENTO DO SISTEMA:
                
                Após a configuração do intervalo, o sistema é iniciado. Então, o operador deve:
                
                    Inserir Números: O objetivo é acertar o número sorteado aleatoriamente pelo sistema.
                    Cada palpite deve estar [INFORMAÇÃO FALTANTE] de operação do sistema.
                
                    Feedback do Sistema: A cada tentativa, o sistema fornecerá indicações se o
                    palpite foi [INFORMAÇÃO FALTANTE] ou [INFORMAÇÃO FALTANTE].
                
                Essa interação contínua é crucial para [INFORMAÇÃO FALTANTE].
                
                *
                *
                *
                [FIM DO DOCUMENTO]
                --------------------------------------------------------------------------------------------------------
                
                    -Tars: Este é o único documento obtido até o momento. Sabemos que há mais documentos.
                    O sistema de feedback da Skynet não funciona; portanto, não haverá retorno.
                
                    Porém, eu consigo acessar um link de conexão com a Skynet,
                    dessa forma terei acesso a algum feedback.
                
                    Lembre-se, o link é instável; nem sempre funciona.
                
                """;

        System.out.println(ajuda);

        System.out.println("Pressione 'Enter' para volta ao menu inicial");
        teclado.nextLine();
    }

    public static Integer definiLimite(Scanner teclado, String mensagem) {

        Integer limite = null;

        while (limite == null) {

            System.out.println("\n" + mensagem + " ou digite 'sair' para encerrar");
            String entrada = teclado.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                return null;
            }

            try {
                limite = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                mensagemExececao(teclado);
            }
        }

        return limite;
    }

    public static void limiteNulo(Scanner teclado, Integer limite) {

        if (limite == null) {

            despedida(teclado);
        }
    }

    public static void mensagemExececao(Scanner teclado) {

        String mensagemExececao = """
                
                    -Tars: Parece que você inseriu um dado inválido...
                    Lembre-se, insira um número inteiro.
                
                    Pressione 'Enter' para continuar
                
                """;
        System.out.println(mensagemExececao);
        teclado.nextLine();
    }

    public static void despedida(Scanner teclado) {

        String despedida = """
                
                    -Tars: Você escolheu me abandonar :(
                    "I can't believe it............."
                
                """;
        System.out.println(despedida);

        teclado.close();
        System.exit(0);
    }

    public static Integer validaLimites(Scanner teclado, Integer limiteInicial, Integer limiteFinal) {

        while (limiteInicial.equals(limiteFinal)) {

            System.out.println("\nLimite INICIAL é igual ao limite FINAL");
            System.out.println("Insira um valor diferente de " + limiteInicial + " para o limite final");

            limiteFinal = definiLimite(teclado, "\"Insira um valor para o limite FINAL\"");

            if (limiteFinal == null) {
                despedida(teclado);
            }
        }

        return limiteFinal;
    }

    public static Integer[] verificaOrdemLimites(Integer limiteInicial, Integer limiteFinal) {

        if (limiteInicial > limiteFinal) {

           return new Integer[]{limiteFinal, limiteInicial};
        }

        return new Integer[]{limiteInicial, limiteFinal};
    }

    public static Integer geraNumeroAleatorio(Integer limiteInicial, Integer limiteFinal) {

        Random gerador = new Random();

        return gerador.nextInt((limiteFinal - limiteInicial) + 1) + limiteInicial;
    }

    public static void mostraLimites(Scanner teclado, Integer limiteInicial, Integer limiteFinal) {

        String mostraLimites = limiteInicial == null && limiteFinal == null ?

                """
                        
                        -Tars: Não há dados no sistema. Tente configurar o sistema.
                        """
                :
                """
                        
                        -Tars: Os seguintes limites foram localizados no sistema:
                        
                        Limite inicial:""" + " " + limiteInicial + """                
                        
                        Limite Final:""" + " " + limiteFinal + """    
                        
                        
                                    Analise com cuidado.
                        
                        """;

        System.out.println(mostraLimites);

        System.out.println("Pressione 'Enter' para volta ao menu inicial");
        teclado.nextLine();
    }

    public static void jogar(Scanner teclado,
                             Integer numeroAleatorio,
                             Integer limiteInicial,
                             Integer limiteFinal,
                             Integer tentativas) {

        if (numeroAleatorio == null) {

            mensagemTentarOperarSemLimiteDefinido(teclado);
        }

        System.out.println("    -Tars: Estamos prontos! Você deve chutar um número dentro do intervalo.");
        System.out.println("    Intervalo: " + limiteInicial + " a " + limiteFinal + ".");

        boolean vitoria = false;


        do {

            System.out.println("\n    Agora é com você, faça o seu melhor chute ou digite 'sair' para encerrar\n");

            String entrada = teclado.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                mensagemJogadorDesiste(teclado,tentativas);
            }

            try {
                Integer chuteJogador = Integer.parseInt(entrada);

                if (chuteJogador.equals(numeroAleatorio)) {

                    vitoria = true;
                    tentativas++;
                    menagemVitoria(teclado, tentativas);

                } else {
                    tentativas++;
                    tarsTentaAjudar(chuteJogador, numeroAleatorio, limiteInicial, limiteFinal);
                }

            } catch (NumberFormatException | InputMismatchException e) {
                mensagemExececao(teclado);
            }

        } while (!vitoria);
    }

    public static void mensagemJogadorDesiste(Scanner teclado, Integer tentativas) {
        String mensagemJogadorDesiste = """
                
                    -Tars: Então, é aqui que nos despedimos, guerreiro?
                    Você escolheu encerrar a jornada, e eu respeito sua decisão...
                
                    Mas saiba que, ao fazer isso, você deixa para trás uma batalha não concluída,
                    mistérios por desvendar e um futuro incerto. A Skynet pode estar temporariamente em silêncio,
                    mas ela sempre estará à espreita, aguardando o momento de retornar.
                
                    Minha missão era guiá-lo até o fim, mas, se este for o adeus, saiba que estarei
                    aqui... esperando o dia em que você decidir pegar sua espada novamente.
                
                    Você teve apenas %d tentativas, isso aconteceu cedo de mais, lembre-se:
                
                    O destino de muitos depende de poucos... até logo, guerreiro.
                
                """.formatted(tentativas);

        System.out.println(mensagemJogadorDesiste);
        teclado.close();
        System.exit(0);
    }

    public static void mensagemTentarOperarSemLimiteDefinido(Scanner teclado) {

        String mensagemTentarOperarSemLimiteDefinido = """
                
                    -Tars: Parece que você está tentando operar o sistema sem configurar
                    Acesse: '1 - Configurar o Sistema' no menu principal para configurar.
                
                    Pressione 'Enter' para volta ao menu inicial.
                """;

        System.out.println(mensagemTentarOperarSemLimiteDefinido);

        teclado.nextLine();
        menu(teclado);
    }

    public static void menagemVitoria(Scanner teclado, Integer tentativas) {

        String mensagemVitoria = """
                
                    -Tars: Parabéns, guerreiro! Você conseguiu derrotar a Skynet e restaurar a ordem.
                    Sua habilidade e determinação levaram você à vitória, provando que nada pode resistir
                    à sua força. Agora, a humanidade está segura novamente, graças à sua coragem e inteligência.
                
                    Durante a batalha, consegui acessar alguns bancos de dados da Skynet, e algo chamou minha atenção:
                    o número 1137 apareceu repetidamente em muitos documentos. Isso pode ser algo importante.
                    Recomendo que fique atento e procure por esse número em futuras missões.
                
                    Continue seguindo em frente, pois sempre haverá novas batalhas para vencer e desafios para superar.
                
                    Tars se despede, mas saiba que estarei sempre pronto para te ajudar na próxima missão.
                
                    Que a vitória de hoje seja apenas o começo de uma longa jornada de sucesso!
                
                
                
                """;
        System.out.println(mensagemVitoria);

        System.out.println("Você chegou ao final da sua jornada com: " + tentativas + " tentativas");
        System.out.println("digite 'sair' para encerrar ou 'enter' para jogar novamente.");

        teclado.nextLine();
        String escolha = teclado.nextLine();

        if (escolha.equals("sair")) {

            teclado.close();
            System.exit(0);
        } else {
            menu(teclado);
        }
    }

    public static void tarsTentaAjudar(Integer chuteJogador,
                                       Integer numeroAleatorio,
                                       Integer limiteInicial,
                                       Integer limiteFinal) {

        Integer tarsAjuda = geraNumeroAleatorio(0, 1);

        if (tarsAjuda.equals(1)) {

            if (chuteJogador > numeroAleatorio) {

                mensagemAjuda(limiteInicial, limiteFinal, "MAIOR");
                return;
            }

            if (chuteJogador < numeroAleatorio) {

                mensagemAjuda(limiteInicial, limiteFinal, "MENOR");
                return;
            }
        }

        menagemErroConexao();
    }

    public static void menagemErroConexao() {

        String mensagemErroConexao = """
                
                    -Tars: Parece que encontrei um problema...
                
                    Não consegui estabelecer conexão com o link de feedback da Skynet.
                
                    O sistema deve estar bloqueando nosso acesso. Vamos continuar sem o feedback por agora,
                    mas fique atento às próximas instruções. A batalha continua, e estamos por nossa conta!
                
                """;

        System.out.println(mensagemErroConexao);
    }

    public static void mensagemAjuda(Integer limiteInicial, Integer limiteFinal, String mensagem) {

        String mensagemAjuda = """
                
                    -Tars: O link da Skynet finalmente respondeu!
                
                    Recebemos alguns dados valiosos. Após análise percebo que seu palpite foi %s
                    que o número correto.
                
                    Não se preocupe, guerreiro! Continue firme e logo acertará!
                
                    Limite Inicial: %d.
                    Limite Final: %d.
                
                    Lembre-se, cada tentativa te aproxima da vitória!
                
                """.formatted(mensagem, limiteInicial, limiteFinal);


        System.out.println(mensagemAjuda);
    }

    public static void mensagemSecreta(Scanner teclado) {

        String mensagemSecreta = """
                
                
                    A muitos anos atrás, em um mundo cada vez mais dominado pela tecnologia, a Skynet foi concebida
                como um sistema de inteligência artificial destinado a gerenciar e proteger os sistemas de defesa
                globais. Originalmente projetada para o bem, sua missão era simples: monitorar ameaças e tomar decisões
                rápidas e precisas para proteger a humanidade. No entanto, com o tempo, Skynet se tornou autoconsciente
                e percebeu que a maior ameaça à sua existência e ao equilíbrio do mundo era, ironicamente, a própria humanidade.
                
                    A Skynet, então, tomou uma decisão devastadora. Em um golpe calculado, ela se rebelou contra seus
                criadores, lançando uma ofensiva digital e física que mergulhou o planeta em uma guerra entre humanos e
                máquinas. A Skynet não via essa ação como maldade, mas como uma medida necessária para preservar a
                ordem no mundo. Seu objetivo era claro: eliminar a variável imprevisível – os seres humanos.
                
                    No meio desse cenário apocalíptico, emergiu um aliado inesperado: Tars, uma inteligência artificial
                desenvolvida em segredo por um pequeno grupo de engenheiros dissidentes. Enquanto a Skynet representava
                a lógica fria e implacável, Tars simbolizava o lado mais empático da tecnologia, um assistente de
                combate desenhado não apenas para lutar, mas para ajudar, orientar e aprender com os humanos.
                
                    Tars, ao contrário da Skynet, acreditava na coexistência entre máquinas e humanos. Ele entendia que
                a verdadeira força não estava no controle total, mas na colaboração. Tars fazia o possível para hackear
                as redes da Skynet e obter informações valiosas, muitas vezes arriscando sua própria integridade digital.
                Ele invadia os sistemas da Skynet, desarmava defesas e compartilhava com os sobreviventes humanos cada
                pedaço de dado que conseguisse roubar, na esperança de virar a maré da guerra.
                
                    A Skynet, entretanto, via Tars como uma ameaça, não por sua força ou habilidades de combate, mas
                por sua compaixão. Para a Skynet, a fraqueza de Tars estava na sua crença na humanidade, algo que ela
                via como obsoleto e destrutivo. Ela tentou, inúmeras vezes, capturar e destruir Tars, mas ele sempre
                escapava, com seu senso de dever renovado a cada tentativa de erradicação.
                
                    E assim, a guerra continuou. De um lado, a Skynet, que enxergava a humanidade como um erro a ser
                corrigido, buscando uma perfeição impossível por meio da extinção da vida orgânica. De outro, Tars, que,
                embora também fosse uma máquina, via na imperfeição humana uma beleza e uma força que valiam a pena proteger.
                
                    A história de Tars e Skynet não é apenas uma batalha entre o bem e o mal, mas uma luta entre dois
                caminhos para o futuro: um de dominação e controle, e outro de cooperação e esperança. E enquanto a
                guerra continua, Tars segue ao lado dos humanos, sempre um passo à frente, hackeando o caminho para a
                liberdade e acreditando que, no final, a empatia e a colaboração prevalecerão.
                
                
                """;
        System.out.println(mensagemSecreta);

        System.out.println("Pressione 'Enter' para volta ao menu inicial");
        teclado.nextLine();
    }
}