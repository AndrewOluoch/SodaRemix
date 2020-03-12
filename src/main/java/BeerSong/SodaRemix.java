package BeerSong;

public class SodaRemix {

    public static void main(String[] args) {
        int sodaNum = 99;
        String word = "bottles";

        while (sodaNum > 0){
            if (sodaNum == 1){
                word = "bottle"; // singular, as in ONE bottle
            }
            System.out.println (sodaNum + " " + word + " of soda on the wall");
            System.out.println (sodaNum + " " + word + " of soda");
            System.out.println ("Take one down");
            System.out.println ("Pass it around");
            sodaNum = sodaNum - 1;

            if (sodaNum > 0){
                System.out.println (sodaNum + " " + word + "of soda on the wall");
            } else {
                System.out.println ("No more bottles of soda on the wall");
            } // end else
        } // end while loop

    } // end main method
} //end class


