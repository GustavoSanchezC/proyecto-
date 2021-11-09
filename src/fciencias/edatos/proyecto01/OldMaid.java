package fciencias.edatos.proyecto01;

import java.util.Random; 

public class OldMaid {
    
    private Shuffle baraja=new Shuffle();
    private List<Player> players=new List<Player>();
    private Player playerOne;
    private Player playerTwo;
    private Player playerThree;
    private Player playerFour;
    private Player playerFive;
    private Player playerSix;
    private Player playerSeven;
    private Player playerEight;
    private Player playerNine;
    private Player playerTen;

    public OldMaid(List<Player> players ){
        baraja.shuffler();
        this.players = players;
        int average=baraja.sizeShuffle()/this.players.size();
        if(players.size() < 10 ) {
            for (int i = 0; i < baraja.sizeShuffle(); i++) {
                Card card = baraja.getCard(i);
                switch (average) {
                    case 25:// two players
                        if (i <= average) {
                            this.players.get(0).setCard(card);
                        } else {
                            this.players.get(1).setCard(card);
                        }
                        break;
                    case 17: // three players
                        if (i <= average) {
                            this.players.get(0).setCard(card);
                        } else if (i > average && i <= 34) {
                            this.players.get(1).setCard(card);
                        } else {
                            this.players.get(2).setCard(card);
                        }
                        break;
                    case 12://four players
                        if (i <= average + 1) {
                            this.players.get(0).setCard(card);
                        } else if (i > average + 1 && i <= 27) {
                            this.players.get(1).setCard(card);
                        } else if (i > 27 && i <= 39) {
                            this.players.get(2).setCard(card);
                        } else {
                            this.players.get(3).setCard(card);
                        }
                        break;
                    case 10://five players
                        if (i <= average + 1) {
                            this.players.get(0).setCard(card);
                        } else if (i > average + 1 && i <= 21) {
                            this.players.get(1).setCard(card);
                        } else if (i > 21 && i <= 31) {
                            this.players.get(2).setCard(card);
                        } else if (i > 31 && i <= 41) {
                            this.players.get(3).setCard(card);
                        } else {
                            this.players.get(4).setCard(card);
                        }
                        break;
                    case 8://six players
                        if (i <= 9) {
                            this.players.get(0).setCard(card);
                        } else if (i > 9 && i <= 18) {
                            this.players.get(1).setCard(card);
                        } else if (i > 18 && i <= 27) {
                            this.players.get(2).setCard(card);
                        } else if (i > 27 && i <= 35) {
                            this.players.get(3).setCard(card);
                        } else if (i > 35 && i <= 43) {
                            this.players.get(4).setCard(card);
                        } else {
                            this.players.get(5).setCard(card);
                        }
                        break;
                    case 7://seven players
                        if (i <= 8) {
                            this.players.get(0).setCard(card);
                        } else if (i > 8 && i <= 16) {
                            this.players.get(1).setCard(card);
                        } else if (i > 16 && i <= 23) {
                            this.players.get(2).setCard(card);
                        } else if (i > 23 && i <= 30) {
                            this.players.get(3).setCard(card);
                        } else if (i > 30 && i <= 37) {
                            this.players.get(4).setCard(card);
                        } else if (i > 37 && i <= 44) {
                            this.players.get(5).setCard(card);
                        } else {
                            this.players.get(6).setCard(card);
                        }
                        break;
                    case 6://eight players
                        if (i <= 7) {
                            this.players.get(0).setCard(card);
                        } else if (i > 7 && i <= 14) {
                            this.players.get(1).setCard(card);
                        } else if (i > 14 && i <= 21) {
                            this.players.get(2).setCard(card);
                        } else if (i > 21 && i <= 27) {
                            this.players.get(3).setCard(card);
                        } else if (i > 27 && i <= 33) {
                            this.players.get(4).setCard(card);
                        } else if (i > 33 && i <= 39) {
                            this.players.get(5).setCard(card);
                        } else if (i > 39 && i <= 45) {
                            this.players.get(6).setCard(card);
                        } else {
                            this.players.get(7).setCard(card);
                        }
                        break;
                    case 5://eight players
                        if (i <= 6) {
                            this.players.get(0).setCard(card);
                        } else if (i > 6 && i <= 12) {
                            this.players.get(1).setCard(card);
                        } else if (i > 12 && i <= 18) {
                            this.players.get(2).setCard(card);
                        } else if (i > 18 && i <= 24) {
                            this.players.get(3).setCard(card);
                        } else if (i > 24 && i <= 30) {
                            this.players.get(4).setCard(card);
                        } else if (i > 30 && i <= 36) {
                            this.players.get(5).setCard(card);
                        } else if (i > 36 && i <= 41) {
                            this.players.get(6).setCard(card);
                        } else if (i > 41 && i <= 46) {
                            this.players.get(7).setCard(card);
                        } else {
                            this.players.get(8).setCard(card);

                        }
                        break;
                }
            }
        }else {
            for (int i = 0; i < baraja.sizeShuffle(); i++) {
                Card card = baraja.getCard(i);
                if (i <= 6) {
                    this.players.get(0).setCard(card);
                } else if (i > 6 && i <= 11) {
                    this.players.get(1).setCard(card);
                } else if (i > 11 && i <= 16) {
                    this.players.get(2).setCard(card);
                } else if (i > 16 && i <= 21) {
                    this.players.get(3).setCard(card);
                } else if (i > 21 && i <= 26) {
                    this.players.get(4).setCard(card);
                } else if (i > 26&& i <= 31) {
                    this.players.get(5).setCard(card);
                } else if (i > 31 && i <= 36) {
                    this.players.get(6).setCard(card);
                } else if (i > 36 && i <= 41) {
                    this.players.get(7).setCard(card);
                } else if (i > 41 && i <= 46){
                    this.players.get(8).setCard(card);
                }else {
                    this.players.get(9).setCard(card);
                }
            }
        }
    }
    
    public OldMaid(Player playerOne, Player playerTwo){
        baraja.shuffler();
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        players.add(0, playerOne);
        players.add(0, playerTwo);
        int average=baraja.sizeShuffle()/2;
        for(int i=0; i<baraja.sizeShuffle(); i++){
            Card card= baraja.getCard(i);
            if(i<=average){
                playerOne.setCard(card);
            }else{
                playerTwo.setCard(card);
            }
        }
    }

    /**
     * Metodo que borra todas las cartas del jugador de la maquina su primera vez
     * @param jugador
     */
    public void autonomousDeleteCards(Player jugador){
        if(jugador.containsSameCards()){
            List<Card> temporal=jugador.getCardsPlayer();
            System.out.println("LAS CARTAS ELIMINADAS DE "+jugador.getNamePlayer()+" SON:");
            for(int i=0; i<temporal.size(); i++){
                for(int j=i+1; j<temporal.size(); j++){
                    int valueFamilyOne = temporal.get(i).getValueFamily();
                    int valueFamilyTwo = temporal.get(j).getValueFamily();
                    if(valueFamilyOne == valueFamilyTwo){
                        Card cardOne=temporal.remove(i);
                        Card cardTwo=temporal.remove(j-1);
                        i=0;
                        j=i+1;
                        System.out.println(cardOne.getFrontEnd()+"  "+cardTwo.getFrontEnd());
                    }
                }
            }        
        }else{
            System.out.println("NO HAYA CARTAS DEL MISMO PALO\n");
        }
    }

    /**
     * Metodo que hace el intercambio de carta de jugador contra maquina
     * @param actualPlayer
     * @param prevPlayer
     */
    public void exchangeMachineCardVSMachine(Player actualPlayer, Player prevPlayer){
        Random rd=new Random();
        int change=rd.nextInt(prevPlayer.sizeListCards());
        Card temporal=prevPlayer.removeCardList(change);
        actualPlayer.addCard(temporal);
    }

    /**
     * Metodo que hace el intercambio de carta de jugador contra maquina
     * @param actualPlayer
     * @param prevPlayer
     */
    public void exchangeMachineCardVSPlayer(Player actualPlayer, Player prevPlayer, int i){
        if(i>0&&i<=prevPlayer.sizeListCards()){
            Card temp=prevPlayer.removeCardList(i-1);
            actualPlayer.addCard(temp);
        }
    }

    /**
     * @return la lista de jugadores
     */
    public List<Player> getPlayers(){
        return players;
    }

    /**
     * Metodo que regresa un jugador
     * @param i
     * @return
     */
    public Player getPlayer(int i){
        return players.get(i);
    }

    public void deleteCardsAuto(Card card){
        List<Card> temp=playerOne.getCardsPlayer();     
    }

    public Player playerOne(){
        return players.get(0);
    }

    public Player playerTwo(){
        return playerTwo;
    }
}