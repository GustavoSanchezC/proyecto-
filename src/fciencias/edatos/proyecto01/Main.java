package fciencias.edatos.proyecto01;

import java.util.Scanner;

public class Main {
   /** public static void main2(String[] args) {

        game.exchangeMachineCardVSPlayer(playerOne, playerTwo);
        System.out.println(game.playerOne().toStringFront());
        System.out.println(game.playerTwo().toStringFront());
        
        
        System.out.println("----------------------------------------------INGRE");
        int n=sr.nextInt();
        game.exchangeMachineCardVSPlayer(playerTwo, playerOne, n);
        System.out.println(game.playerOne().toStringFront());
        System.out.println(game.playerTwo().toStringFront());
        
        Scanner sr=new Scanner(System.in);

        Shuffle temporal=new Shuffle();
        System.out.println("            SOLITARIO            \n");
        System.out.println("LA BARAJA INICAL SE VE COMO: ");
        temporal.printShuffleFront();
        System.out.println("\nACONTINUACION REALIZAREMOS LA ASIGNACION DE CARTAS: ");
        Player playerOne=new Player("MAQUINA");
        Player playerTwo=new Player("CRISTIAN");
        OldMaid game=new OldMaid(playerOne, playerTwo);
        System.out.println("\n");
        System.out.println(game.playerOne().toStringFront()); //CAMBIAR
        System.out.println("\n"+game.playerTwo().toStringFront()); 
        game.autonomousDeleteCards(playerOne);
        System.out.println(game.playerOne().toStringFront());

        if(game.playerTwo().containsSameCards()){
            System.out.println("¿DESEAS ELIMINAR TODAS TUS CARTAS SIMILARES?");
            System.out.println("SI=1, NO=2");
            int value=sr.nextInt();
            if(value==1){
                game.autonomousDeleteCards(playerTwo);
                System.out.println(game.playerTwo().toStringFront());
            }else if(value==2){
                System.out.println("NO SE BORRARON LAS CARTAS, POR FAVOR OPRIME QUE SI XD");
            }
        }

        System.out.println("CORRIDA, EMPIEZA "+game.playerOne().getNamePlayer());
        System.out.println("HACIENDO INTERCARCAMBIO DE CARTAS:\n");
    
        while(!game.getPlayers().isEmpty()){
            if(game.playerOne().containsSameCards()){
            game.autonomousDeleteCards(playerOne);
            System.out.println(game.playerOne().toStringFront());
            }else{
                game.exchangeMachineCardVSMachine(playerOne, playerTwo);
                System.out.println(game.playerOne().toStringFront());
            }
        }





        
    } */

     public static void aux (OldMaid game){
         Scanner sc = new Scanner(System.in);
         if (game.getPlayer(0).containsSameCards()) {
             System.out.println("¿DESEAS ELIMINAR TODAS TUS CARTAS SIMILARES?");
             System.out.println("SI pulse 1, NO pulse 2");
             int value = sc.nextInt();
             if (value == 1) {
                 game.autonomousDeleteCards(game.getPlayer(0));
                 System.out.println(game.getPlayer(0).toStringFront());
             }else if(value == 2) {
                 System.out.println("NO SE BORRARON LAS CARTAS, POR FAVOR OPRIME QUE SI XD");
             }
         }
     }
    public static void theGame( List<Player> players , OldMaid game ){
        Scanner sc = new Scanner(System.in);
        int turnos = players.size();
        for (int i = 0; i < players.size() ; i++) {
            System.out.println("los jugadores son :");
            System.out.println(game.getPlayer(i).toStringBack());
        }
        do {
            System.out.println("Tus Cartas son ");
            System.out.println(game.getPlayer(0).toStringFront());
            for (int i = 1; i < turnos+1; i++) {
                aux(game);
                if(game.getPlayer(i).containsSameCards()){
                    game.autonomousDeleteCards(game.getPlayer(i));
                }
                game.exchangeMachineCardVSMachine(game.getPlayer(i) , game.getPlayer(i+1));
                if (i == players.size()-1) {
                    game.exchangeMachineCardVSMachine(game.getPlayer(i) , game.getPlayer(0));
                    System.out.println("Un jugador tomo tu carta ");
                    game.exchangeMachineCardVSMachine(game.getPlayer(0), game.getPlayer(1) );
                }

            }
        }while (players.size()>1);

    }

     /**
     * menu generado en forma de clase que despues mandamos a llamar en el main
     */
    public static void menu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bienvenido al juego OLD MAID ");
        System.out.println("Seleccione el numero de jugadores ");
        System.out.println("2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 ");
        System.out.println("11.Salir del menu");
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        List<String> Registro = new List<String>();
        List<Player> listaJugadores=new List<Player>();
        Scanner sc = new Scanner(System.in);

        try {
            menu();
            int option = sc.nextInt();

            if (option <= 1 || option > 11){
                System.out.println("Opcion no soportada");
                main(args);
            }else if(option == 11) {
                System.out.println("Vuelve pronto!");
            }else {
                Shuffle temporal = new Shuffle();
                System.out.println("LA BARAJA INICAL SE VE COMO: ");
                temporal.printShuffleFront();

                System.out.println("Ingrese su Nombre");
                String namePlayer = sc.next();
                Player playerOne = new Player(namePlayer);
                listaJugadores.add(0, playerOne);

                for (int i = 1; i < option + 1; i++) {
                    String testPlayer = "Maquina" + i;
                    Player newPlayer = new Player(testPlayer);
                    listaJugadores.add(i, newPlayer);
                }

                OldMaid game = new OldMaid(listaJugadores);
                theGame(listaJugadores , game);
            }

        } catch (Exception e) {
            System.out.println("Operacion no soportada.");
            main(args);
        }
    }
}