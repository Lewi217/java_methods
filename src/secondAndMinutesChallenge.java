public class secondAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(65 , 45));
        System.out.println(getDurationString(5678));
    }

    public static String getDurationString(long minutes, long seconds){

        if(minutes >=0){
            System.out.println(minutes);
        }else if(seconds >= 0 && seconds <=59){
            System.out.println(seconds);
        }else{
            System.out.println("Invalid Value");
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " h " +remainingMinutes + " m " + seconds + " s ";
    }

    public static String getDurationString(long seconds){

        if(seconds < 0){
            System.out.println("Invalid number");
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes , remainingSeconds);
    }
}
