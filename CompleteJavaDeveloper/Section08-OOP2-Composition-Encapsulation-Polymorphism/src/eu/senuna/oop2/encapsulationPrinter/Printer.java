package eu.senuna.oop2.encapsulationPrinter;

/**
 * Created by senuna on 12.11.16.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //TODO - look for Q&A  49
    public Printer(int tonerLevel, boolean duplex) {


        if (tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel>0 && tonerLevel <=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint =  (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("for this printing - duplex - ON");
        } else {
        System.out.println("for this printing - duplex - OFF");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint; //eee?
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
