public class SecondsandMinutesChallenge {
    public static void main(String[] args) {

    String out = gerDurationString(61,7);
        System.out.println(out);


    }


    public static String gerDurationString(int seconds) {
        String message = "Entered ("+seconds+") is not a positive numbers";

        if (seconds < 0) {
           return message;
        }

        int sec = (seconds % 60);
        int min = seconds / 60;
        return gerDurationString(min, sec);



    }


    public static String gerDurationString(int minutes, int seconds) {
        String message = " one of the Entered value is not positive";


        if ((minutes < 0) || (seconds<0)) {
            return message;
        }
        else if (seconds>59){
            return "Do not exceed seconds than 59";
        }
            int hour= minutes/60;
            int min = minutes%60;



            return hour+"h "+min + "m " +seconds+ "s ";




    }

}
