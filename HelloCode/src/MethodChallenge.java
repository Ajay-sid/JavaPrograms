public class MethodChallenge {

    public static void main(String[] args) {

    String name = "Ajay";
    int score =400;

    int pPosition = calHighScorePos(score);
    displayHighScorePosition(name, pPosition);


    }

    public static void displayHighScorePosition(String pName , int pPosition){

        System.out.println(pName +" managed to get into position "+pPosition+" on the high score list");

    }

    public static int calHighScorePos(int pScore){
        int pos = 4;
        if(pScore >= 1000) {
            pos = 1;
        } else if (pScore>=500) {
            pos =2;
        } else if (pScore>=100 ) {
            pos=3;
        }
        return pos;
    }






}
