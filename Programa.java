import java.util.ArrayList;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> arrayList = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        int id;

        do {
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - REMOVER");
        System.out.println("3 - ALTERAR");
        System.out.println("4 - PESQUISAR");
        System.out.println("0 - SAIR");
        opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    //CADASTRAR
                    do {
                        System.out.println("1 - CIRCULO");
                        System.out.println("2 - RETANGULO");
                        System.out.println("3 - QUADRADO");
                        System.out.println("0 - VOLTAR");
                        opcao = leia.nextInt();
                        switch (opcao) {
                            case 1:
                                id = arrayList.size() + 1;
                                System.out.println("Digite o valor raio");
                                double raio = leia.nextInt();
                                System.out.println("Digite o valor comprimento");
                                double comprimento = leia.nextInt();
                                System.out.println("Digite o peso especifico: ");
                                double pesoEspecifico = leia.nextDouble();
                                System.out.println("Digite qual é o preço do kilo do material: ");
                                double kilo = leia.nextDouble();
                                System.out.println("Digite o nome do material");
                                String material = leia.next();
                                arrayList.add(new Circulo(raio, comprimento, pesoEspecifico, kilo, material, id));
                                break;
                            case 2:
                                id = arrayList.size() + 1;
                                System.out.println("Digite o valor da base: ");
                                double base = leia.nextDouble();
                                System.out.println("Digite o valor da altura: ");
                                double altura = leia.nextDouble();
                                System.out.println("Digite o valor da largura: ");
                                double largura = leia.nextDouble();
                                System.out.println("Digite o peso especifico: ");
                                pesoEspecifico = leia.nextDouble();
                                System.out.println("Digite qual é o preço do kilo do material: ");
                                kilo = leia.nextDouble();
                                System.out.println("Digite o nome do material");
                                material = leia.next();
                                arrayList.add(new Retangulo(base, altura, largura, pesoEspecifico, kilo, material, id));
                                break;
                            case 3:
                                id = arrayList.size() + 1;
                                System.out.println("Digite o valor do lado: ");
                                double lado = leia.nextDouble();
                                System.out.println("Digite o peso especifico: ");
                                pesoEspecifico = leia.nextDouble();
                                System.out.println("Digite qual é o preço do kilo do material: ");
                                kilo = leia.nextDouble();
                                System.out.println("Digite o nome do material");
                                material = leia.next();
                                arrayList.add(new Quadrado(lado, pesoEspecifico, kilo, material, id));
                                break;

                            default:
                                if (opcao > 0) {
                                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                } else {
                                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                }
                                break;
                        }
                    }while (opcao!=0);
                    opcao=10;
                    break;
                case 2:
                    //REMOVER
                    do {
                        System.out.println("1 - PARA REMOVER CIRCULO");
                        System.out.println("2 - PARA REMOVER RETANGULO");
                        System.out.println("3 - PARA REMOVER QUADRADO");
                        System.out.println("0 - PARA VOLTAR PARA O MENU PRINCIPAL");

                        opcao = leia.nextInt();
                        switch (opcao) {

                            case 1:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (arrayList.get(i).getClass().equals(Circulo.class)) {
                                        arrayList.remove(i);
                                    }
                                }
                                break;
                            case 2:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (arrayList.get(i).getClass().equals(Retangulo.class)) {
                                        arrayList.remove(i);
                                    }
                                }
                                break;
                            case 3:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (arrayList.get(i).getClass().equals(Quadrado.class)) {
                                        arrayList.remove(i);
                                    }
                                }
                                break;

                            default:
                                if (opcao > 0) {
                                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                } else {
                                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                }

                                break;

                        }
                    }while (opcao!=0);
                    opcao = 10;
                        break;
                case 3:
                    //ALTERAR
                    do {
                        System.out.println("1 - PARA ALTERAR OS VALORES DO CIRCULOS");
                        System.out.println("2 - PARA ALTERAR OS VALORES DO RETANGULOS");
                        System.out.println("3 - PARA ALTERAR OS VALORES DO QUADRADOS");
                        System.out.println("0 - PARA IR PARA O MENU PRINCIPAL");
                      opcao = leia.nextInt();
                        switch (opcao) {

                            case 1:
                                switch (opcao) {
                                    case 1:
                                        System.out.println("DIGITE O ID DA BUSCA: ");
                                        id = leia.nextInt();
                                        for (int i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i).getClass().equals(Circulo.class)) {
                                                if (((Circulo) arrayList.get(i)).getID() == id) {
                                                    System.out.println("1 - PARA ALTERAR OS VALORES DO RAIO");
                                                    System.out.println("2 - PARA ALTERAR OS VALORES DO COMPRIMENTO");
                                                    System.out.println("3 - PARA ALTERAR OS VALORES DO PESO ESPECIFICO");
                                                    System.out.println("4 - PARA ALTERAR OS VALORES DO KILO");
                                                    System.out.println("5 - PARA ALTERAR O NOME DO MATERIAL");
                                                    System.out.println("0 - PARA IR PARA O MENU PRINCIPAL");
                                                    opcao = leia.nextInt();
                                                    switch (opcao){
                                                        case 1:
                                                            System.out.println("Entre com o valor do raio");
                                                            double raio = leia.nextDouble();
                                                            ((Circulo) arrayList.get(i)).setRaio(raio);
                                                            break;
                                                        case 2:
                                                            System.out.println("Entre com o valor do comprimento");
                                                            double comprimento = leia.nextDouble();
                                                            ((Circulo) arrayList.get(i)).setComprimento(comprimento);
                                                            break;
                                                        case 3:
                                                            System.out.println("Entre com o valor do peso especifico");
                                                            double pesoEspecifico = leia.nextDouble();
                                                            ((Circulo) arrayList.get(i)).setPesoEspecifico(pesoEspecifico);
                                                            break;
                                                        case 4:
                                                            System.out.println("Entre com o valor do kilo");
                                                            double kilo = leia.nextDouble();
                                                            ((Circulo) arrayList.get(i)).setKilo(kilo);
                                                            break;
                                                        case 5:
                                                            System.out.println("Entre com o nome do material");
                                                            String material = leia.next();
                                                            ((Circulo) arrayList.get(i)).setMaterial(material);
                                                        default:
                                                            if (opcao > 0) {
                                                                System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                                            } else {
                                                                System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                                            }
                                                            break;

                                                    }
                                                }

                                            }
                                        }
                                }
                                break;
                            case 2:
                                System.out.println("DIGITE O ID DA BUSCA: ");
                                id = leia.nextInt();
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (arrayList.get(i).getClass().equals(Retangulo.class)) {
                                        if (((Retangulo) arrayList.get(i)).getID() == id) {
                                            System.out.println("1 - PARA ALTERAR OS VALORES DA BASE");
                                            System.out.println("2 - PARA ALTERAR OS VALORES DA ALTURA");
                                            System.out.println("3 - PARA ALTERAR OS VALORES DA LARGURA");
                                            System.out.println("4 - PARA ALTERAR OS VALORES DO PESO ESPECIFICO");
                                            System.out.println("5 - PARA ALTERAR OS VALORES DO KILO");
                                            System.out.println("6 - PARA ALTERAR O NOME DO MATERIAL");
                                            System.out.println("0 - PARA IR PARA O MENU PRINCIPAL");
                                            opcao = leia.nextInt();
                                            switch (opcao){
                                                case 1:
                                                    System.out.println("Entre com o valor da base: ");
                                                    double base = leia.nextDouble();
                                                    ((Retangulo) arrayList.get(i)).setBase(base);
                                                    break;
                                                case 2:
                                                    System.out.println("Entre com o valor da altura: ");
                                                    double altura = leia.nextDouble();
                                                    ((Retangulo) arrayList.get(i)).setAltura(altura);
                                                    break;
                                                case 3:
                                                    System.out.println("Entre com o valor da largura: ");
                                                    double largura = leia.nextDouble();
                                                    ((Retangulo) arrayList.get(i)).setLargura(largura);
                                                case 4:
                                                    System.out.println("Entre com o valor do peso especifico");
                                                    double pesoEspecifico = leia.nextDouble();
                                                    ((Circulo) arrayList.get(i)).setPesoEspecifico(pesoEspecifico);
                                                    break;
                                                case 5:
                                                    System.out.println("Entre com o valor do kilo");
                                                    double kilo = leia.nextDouble();
                                                    ((Circulo) arrayList.get(i)).setKilo(kilo);
                                                    break;
                                                case 6:
                                                    System.out.println("Entre com o nome do material");
                                                    String material = leia.next();
                                                    ((Circulo) arrayList.get(i)).setMaterial(material);
                                                default:
                                                    if (opcao > 0) {
                                                        System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                                    } else {
                                                        System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("DIGITE O ID DA BUSCA: ");
                                 id = leia.nextInt();
                                for (int i = 0; i< arrayList.size(); i++ ){
                                    if (arrayList.get(i).getClass().equals(Quadrado.class)) {
                                        if (((Quadrado) arrayList.get(i)).getID() == id) {
                                            System.out.println("1 - PARA ALTERAR OS VALORES DO LADO");
                                            System.out.println("2 - PARA ALTERAR OS VALORES DO PESO ESPECIFICO");
                                            System.out.println("3 - PARA ALTERAR OS VALORES DO KILO");
                                            System.out.println("4 - PARA ALTERAR O NOME DO MATERIAL");
                                            System.out.println("0 - PARA IR PARA O MENU PRINCIPAL");
                                            opcao = leia.nextInt();
                                            switch (opcao){
                                                case 1:
                                                    System.out.println("Entre com o valor do lado: ");
                                                    double lado = leia.nextDouble();
                                                    ((Quadrado) arrayList.get(i)).setLado(lado);
                                                    break;
                                                case 2:
                                                    System.out.println("Entre com o valor do peso especifico");
                                                    double pesoEspecifico = leia.nextDouble();
                                                    ((Circulo) arrayList.get(i)).setPesoEspecifico(pesoEspecifico);
                                                    break;
                                                case 3:
                                                    System.out.println("Entre com o valor do kilo");
                                                    double kilo = leia.nextDouble();
                                                    ((Circulo) arrayList.get(i)).setKilo(kilo);
                                                    break;
                                                case 4:
                                                    System.out.println("Entre com o nome do material");
                                                    String material = leia.next();
                                                    ((Circulo) arrayList.get(i)).setMaterial(material);
                                                default:
                                                    if (opcao > 0) {
                                                        System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                                    } else {
                                                        System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                                    }
                                                    break;
                                            }
                                      }
                                    }
                                }
                                break;
                            default:
                                if (opcao > 0) {
                                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                } else {
                                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                }
                                break;
                        }
                    }while (opcao != 0);
                    opcao=10;
                    break;
                case 4:
                    //PESQUISAR
                    do {
                        System.out.println("1 - PARA PESQUISAR OS CIRCULOS");
                        System.out.println("2 - PARA PESQUISAR OS RETANGULOS");
                        System.out.println("3 - PARA PESQUISAR OS QUADRADOS");
                        System.out.println("0 - PARA IR PARA O MENU PRINCIPAL");
                        opcao = leia.nextInt();

                        switch (opcao) {

                            case 1:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    System.out.println((i + 1) + " - ITEM");
                                    System.out.println(((Circulo) arrayList.get(i)).toString());
                                }
                                break;
                            case 2:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    System.out.println((i + 1) + " - ITEM");
                                    System.out.println(((Retangulo) arrayList.get(i)).toString());
                                }
                                break;
                            case 3:
                                for (int i = 0; i < arrayList.size(); i++) {
                                    System.out.println((i + 1) + " - ITEM");
                                    System.out.println(((Quadrado) arrayList.get(i)).toString());
                                }
                                break;
                            default:
                                if (opcao > 0) {
                                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                                } else {
                                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL.");
                                }

                                break;
                        }
                    } while (opcao != 0);
                    opcao=10;
                    break;

                default:
                    //SAIR
                    if (opcao > 0) {
                        System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE!");
                    } else {
                        System.out.println("ENCERRANDO O PROGRAMA.");
                    }
                    break;

            }
        } while (opcao != 0);
    }
}
