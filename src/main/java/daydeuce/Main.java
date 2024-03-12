package daydeuce;

public class Main {

    public static void main(String[] arg){
        

        int miles = 51;

        int mileFee = 0;

        if (miles >= 0 && miles <= 4){
            mileFee = 2;
        }
        else if (miles >= 5 && miles <= 15){
            mileFee = 5;
        }
        else if (miles >= 16 && miles <= 25){
            mileFee = 10;
        }
        else if (miles >= 26 && miles <= 50){
            mileFee = 15;
        }
        else {
            mileFee = 20;
        }


        int qty = 20;
        int price = 5;
        int total = qty + price + mileFee;




        System.out.println(total);
    }
}
