package fciencias.edatos.proyecto01;

import java.util.Scanner;

public class Main {
    public static void main2(String[] args) {

        /**game.exchangeMachineCardVSPlayer(playerOne, playerTwo);
        System.out.println(game.playerOne().toStringFront());
        System.out.println(game.playerTwo().toStringFront());*/
        
        
        /**System.out.println("----------------------------------------------INGRE");
        int n=sr.nextInt();
        game.exchangeMachineCardVSPlayer(playerTwo, playerOne, n);
        System.out.println(game.playerOne().toStringFront());
        System.out.println(game.playerTwo().toStringFront());*/
        
        /**Scanner sr=new Scanner(System.in);

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
        
    
        
        System.out.println(game.playerTwo().toStringFront());*/

        Player playerOne=new Player("111111111111");
        Player playerTwo=new Player("222222222222");
        Player playerTres=new Player("33333333333");
        Player playerCuatro=new Player("4444444444444");
        Player playerCinco=new Player("5555555555555");
        Player playerSeis=new Player("6666666666666");
        Player playerSIETE=new Player("777777777777");
        Player playerOCHO=new Player("8888888888888");
        Player playerNUEVE=new Player("99999999999");
        Player player10=new Player("CRISTIAN");

        List<Player> listaJugadores=new List<Player>();
        listaJugadores.add(0, playerOne);
        listaJugadores.add(1, playerTwo);
        listaJugadores.add(2, playerTres);
        listaJugadores.add(3, playerCuatro);
        listaJugadores.add(4, playerCinco);
        listaJugadores.add(5, playerSeis);
        listaJugadores.add(6, playerSIETE);
        listaJugadores.add(7, playerOCHO);
        listaJugadores.add(8, playerNUEVE);
        listaJugadores.add(9, player10);

        OldMaid game=new OldMaid(listaJugadores);
        System.out.println(game.getPlayer(0).toStringFront());
        System.out.println(game.getPlayer(1).toStringFront());
        System.out.println(game.getPlayer(2).toStringFront());
        System.out.println(game.getPlayer(3).toStringFront());
        System.out.println(game.getPlayer(4).toStringFront());
        System.out.println(game.getPlayer(5).toStringFront());
        System.out.println(game.getPlayer(6).toStringFront());
        System.out.println(game.getPlayer(7).toStringFront());
        System.out.println(game.getPlayer(8).toStringFront());
        System.out.println(game.getPlayer(9).toStringFront());

        for(int i=0; i<game.getPlayers().size(); i++){
            Player temporal=game.getPlayer(i);
            game.autonomousDeleteCards(temporal);
            System.out.println(game.getPlayer(i).toStringFront());
        }
        
        
        /**System.out.println("\n");
        System.out.println(game.playerOne().toStringFront()); //CAMBIAR
        System.out.println("\n"+game.playerTwo().toStringFront()); 
        game.autonomousDeleteCards(playerOne);*/

        
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
                for (int i = 0; i < listaJugadores.size() ; i++) {
                    System.out.println("los jugadores son :");
                    System.out.println(game.getPlayer(0).toStringBack());
                }

                System.out.println("Sus Cartas son ");
                System.out.println(game.getPlayer(0).toStringFront());
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

        } catch (Exception e) {
            System.out.println("Operacion no soportada.");
            main(args);
        }
    }
}