package shop;

import java.util.Scanner;

public class Catalogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] catalogo = new Prodotto[100];
        int index = 0;

        while (true) {
            System.out.print("Inserisci il tipo di prodotto (1=Smarphone, 2=Televisore, 3=Cuffie): ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1: {
                    System.out.print("Inserisci il codice: ");
                    int codice1 = scanner.nextInt();
                    System.out.print("Inserisci il nome: ");
                    String nome1 = scanner.next();
                    System.out.print("Inserisci la marca: ");
                    String marca1 = scanner.next();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo1 = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva1 = scanner.nextDouble();
                    System.out.print("Inserisci il codice IMEI: ");
                    int imei = scanner.nextInt();
                    System.out.print("Inserisci la quantità di memoria: ");
                    int memoria = scanner.nextInt();

                    catalogo[index] = new Smartphone(codice1, nome1, marca1, prezzo1, iva1, imei, memoria);
                    index++;
                    break;
                }
                case 2: {
                    System.out.print("Inserisci il codice: ");
                    int codice2 = scanner.nextInt();
                    System.out.print("Inserisci il nome: ");
                    String nome2 = scanner.next();
                    System.out.print("Inserisci la marca: ");
                    String marca2 = scanner.next();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo2 = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva2 = scanner.nextDouble();
                    System.out.print("Inserisci le dimensioni: ");
                    double dimensioni = scanner.nextDouble();
                    System.out.print("Il televisore è smart? (true/false): ");
                    boolean isSmart = scanner.nextBoolean();

                    catalogo[index] = new Televisore(codice2, nome2, marca2, prezzo2, iva2, dimensioni, isSmart);
                    index++;
                    break;
                }
                case 3: {
                    System.out.print("Inserisci il codice: ");
                    int codice3 = scanner.nextInt();
                    System.out.print("Inserisci il nome: ");
                    String nome3 = scanner.next();
                    System.out.print("Inserisci la marca: ");
                    String marca3 = scanner.next();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo3 = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva3 = scanner.nextDouble();
                    System.out.print("Inserisci il colore: ");
                    String colore = scanner.next();
                    System.out.print("Le cuffie sono wireless? (true/false): ");
                    boolean isWireless = scanner.nextBoolean();

                    catalogo[index] = new Cuffie(codice3, nome3, marca3, prezzo3, iva3, colore, isWireless);
                    index++;
                    break;
                }
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
      

            if (index == catalogo.length) {
                System.out.println("Catalogo pieno, caro mio magnifico utente.");
                break;
            }
    		System.out.println("\n------------------------------------\n");
         // Stampo il catalogo scelto dall'utente
            for (int i = 0; i < index; i++) {
                System.out.println(catalogo[i]);
            }
    		System.out.println("\n------------------------------------\n");
            
        }
        scanner.close();
        }}