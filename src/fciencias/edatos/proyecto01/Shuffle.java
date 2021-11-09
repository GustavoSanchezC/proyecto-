package fciencias.edatos.proyecto01;

import java.util.Random;

public class Shuffle{
    private List<Card> shuffler;

    /**
     */
    public Shuffle(){
        shuffler=new List<Card>();
        notShuffler();
    } 

    /**
     * Metodo que realiza la barajeada aletaoria
     */
    public void shuffler(){
        Random rd=new Random();
        List<Card> temp=new List<Card>();
        while(!shuffler.isEmpty()){
            int ramdom=rd.nextInt(shuffler.size());
            Card card=shuffler.remove(ramdom);
            temp.add(0, card);
        }
        this.shuffler=temp;
    }

    /**
     * Metodo que donde se agrega las cartas a la baraja
     */
    private void notShuffler(){
        for(int i=0; i<13; i++){
            for(int j=0; j<4; j++){
                if(i==12&&j==3){break;}
                Card temp=new Card(i, j);
                shuffler.add(0, temp);
            }
        }
    }

    /**
     * @return la baraja ya barajeada
     */
    public List<Card> getStartShuffler(){
        return shuffler;
    }

    /**
     * @param i indice de la baraja
     * @return la carta que esta en la baraja
     */
    public Card getCard(int i){
        return shuffler.get(i);
    }

    /**
     * @return el tamaño de la baraja
     */
    public int sizeShuffle(){
        return shuffler.size();
    }

    /**
     * @return la representacion de la baraja impresa por delante
     */
    public void printShuffleFront(){
        String value="";
        for(int i=0; i<shuffler.size(); i++){
            if(i<9){
                System.out.print(shuffler.get(i).getFrontEnd()+"  ");
                value+=(i+1)+"  ";
            }else{
                System.out.print(shuffler.get(i).getFrontEnd()+"  ");
                value+=(i+1)+" ";
            }   
        }
        System.out.println("\n"+value);
    }

    /**
     * @return la representacion de la baraja impresa por detras
     */
    public void printShuffleBack(){
        String value="";
        for(int i=0; i<shuffler.size(); i++){
            if(i<9){
                System.out.print(shuffler.get(i).getBackEnd()+"  ");
                value+=(i+1)+"  ";
            }else{
                System.out.print(shuffler.get(i).getBackEnd()+"  ");
                value+=(i+1)+" ";
            }   
        }
        System.out.println("\n"+value);
    }
}