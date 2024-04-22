public class ShareDigit {
    public static void main(String[] args) {

        System.out.println(hasShareDigit(12,0));


    }

    public static boolean hasShareDigit(int fnum,int snum){

        if(fnum<10||snum<10||fnum>99||snum>99){
            return false;
        }
        int ffnum=fnum/10;
        int lfnum=fnum%10;
        int fsnum=snum/10;
        int lsnum=snum%10;
        if(ffnum==fsnum||ffnum==lsnum){
            return true;
        } else if (lfnum==fsnum||lfnum==lsnum) {
            return true;
        }else return false;


    }

}
