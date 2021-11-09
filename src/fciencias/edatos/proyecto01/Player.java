package fciencias.edatos.proyecto01;

public class Player {
    
    private String name;
    private List<Card> cards;

    /**
     * Contructor para generar un nuevo jugador
     * @param name 
     */
    public Player(String name){
        this.name=name;
        cards=new List<Card>();
    }

    /**
     * Metodo para asignar las cartas del jugador
     * @param card es la carta que se le va metiendo a su tirada
     */
    public void setCard(Card card){
        cards.add(0, card);
    }

    public String getNamePlayer(){
        return name;
    }

    /**
     * @param i indice de la posicion de la carta en la lista de sus cartas del jugador
     * @return la carta en el indice dado
     */
    public Card getCard(int i){
        return cards.get(i);
    }

    public void addCard(Card carta){
        cards.add(0, carta);

    }

    /**
     * Metodo que remueve 
     * @param i
     * @return
     */
    public Card removeCardList(int i){
        return cards.remove(i);
    }

    /**
     * @return cuantas cartas tiene el juagador
     */
    public int sizeListCards(){
        return cards.size();
    }

    /**
     * @return la lista de cartas que tiene cada jugador
     */
    public List<Card> getCardsPlayer(){
        return cards;
    }

    /**
     * Metodo para jugador que nos avisa si todavia tiene cartas pares
     * @param jugador
     * @return
     */
    public boolean containsSameCards(){
        boolean contains=false;
        for(int i=0; i<cards.size()-1; i++){
            for(int j=i+1; j<cards.size(); j++){
                int valueFamilyOne = cards.get(i).getValueFamily();
                int valueFamilyTwo = cards.get(j).getValueFamily();
                if(valueFamilyOne==valueFamilyTwo){
                    contains=true;
                    break;
                }
            }
        }
        return contains;
    }

    /**
     * @return el nombre y las cartas actuales que tiene cada jugador de manera frontal
     */
    public String toStringFront(){
        String message="JUGADOR: "+name+"\nSUS CARTAS SON:\n";
        String position="";
        for (int i = 0; i < cards.size(); i++) {
            message+=cards.get(i).getFrontEnd()+"  ";
            if(i<9){
                position+=(i+1)+"  ";
            }else{
                position+=(i+1)+" ";
            }
        }
        return message+"\n"+position+"\n";
    }

    /**
     * @return el nombre y las cartas actuales que tiene cada jugador de la parte trasera
     */
    public String toStringBack(){
        String message="JUGADOR: "+name+"\nSUS CARTAS SON:\n";
        String position="";
        for (int i = 0; i < cards.size(); i++) {
            message+=cards.get(i).getBackEnd()+"  ";
            if(i<9){
                position+=(i+1)+"  ";
            }else{
                position+=(i+1)+" ";
            }
        }
        return message+"\n"+position+"\n";
    }
}