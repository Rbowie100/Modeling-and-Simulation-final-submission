public class time {
    int minute=0;
    int hour=6;
    String Time1="A.M";
    String Time2="P.M";
    //checks whether it is AM
    boolean AM=true;
    //Checks whether it is PM
    boolean PM=false;
    //end of day
    int timeend=10;
    //start of day
    int timestart=6;
    String[] Days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    //holds the averages for each day
    double [] dayvalues=new double[7];
    //holds the max for each day
    double [] max=new double[7];
    //holds the min for each day
    double [] min=new double[7];
    //holds the standard deviation for each day
    double [] standarddeviation=new double[7];
    //holds the confidence interval for each day
    double [] confidenceintervalplus= new double [7];
    double [] confidenceintervalminus= new double [7];

    //returns the arrival time hour
    public int Arrivaltimehour (){
        return hour;
    }
    //returns the arrival time minute
    public int Arrivaltimeminute (){
        return minute;
    }
    //returns whether it is AM or PM
    public String Arrival(){
        if(AM){
            return Time1;
        }
        if(PM){
        return Time2;
        }
        return "AM";
    }
    //increase the time of the clock

    public void increasetime(){
      minute+=1;
      if(minute==60){
          hour+=1;
          minute=0;
      }
      if(hour==12){
          PM=true;
          AM=false;
      }
      if(hour==13){
          hour=1;
      }

    }
//reset time back to the beginning
    public void resettime(){
        hour=6;
        minute=0;
        PM=false;
        AM=true;
    }
   public int leavetime;
}
