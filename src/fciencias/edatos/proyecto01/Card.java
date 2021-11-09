package fciencias.edatos.proyecto01;

public class Card {

    private int valueFamily;
    private String frontEnd;
    private final static String backEnd="🂠";


    //ESTABLECER COLORES DE LAS TARJETAS
    private final static String red="\033[31m"; 
    private final static String blue="\033[34m"; 
    private final static String reset="\u001B[0m";

    private final static String green="\033[32m"; 
    private final static String yellow="\033[33m"; 
    private final static String purple="\033[35m"; 
    private final static String cyan="\033[36m"; 
    

    /**
     * Contructor para la carta
     * @param valueFamily
     */
    public Card(int valueFamily, int typeCard){
        this.valueFamily=valueFamily;
        setFrontEnd(valueFamily, typeCard);
    }

    /** 
     * @return el valor de la carta a la familia que pretenece
     */
    public int getValueFamily(){
        return valueFamily;
    }

    /**
     * @return la carta vista de enfrente
     */
    public String getFrontEnd(){;
        return frontEnd;
    }

    /**
     * @return la carta vista detras
     */
    public String getBackEnd(){
        return blue+backEnd+reset;
    }

    /**
     * Metodo que establece la parte frontal de la carta
     * @param valueCard
     */
    public void setFrontEnd(int valueCardFamily, int typeCard){
        switch (valueCardFamily) {
            case 0:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂱"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂡"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃁"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃑"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂻"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂫"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃋"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃛"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂲"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂢"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃂"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃒"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂳"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂣"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃃"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃓"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂴"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂤"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃄"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃔"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂵"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂥"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃅"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃕"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂶"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂦"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃆"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃖"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 7:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂷"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂧"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃇"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃗"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 8:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂸"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂨"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃈"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃘"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 9:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂹"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂩"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃉"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃙"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 10:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂺"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂪"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃊"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃚"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 11:
                switch (typeCard) {
                    case 0:
                        this.frontEnd=red+"🂾"+reset;
                        break;
                    case 1:
                        this.frontEnd=red+"🂮"+reset;
                        break;
                    case 2:
                        this.frontEnd=red+"🃎"+reset;
                        break;
                    case 3:
                        this.frontEnd=red+"🃞"+reset;
                        break;
                    default:
                        break;
                }
                break;
            case 12:
                this.frontEnd=red+"🃟"+reset;
                break;
            default:
                break;
        }
    }
}