
public class customer {
    double currenttimeinstore=1;
    double currenttimecheckout=1;
    boolean Shopping=true;
    boolean left=false;
    boolean checkout=false;
    public int Arrivaltimeminute;
    public int Arrivaltimehour;
    public int minute=0;
    public int entercheckout;
    public int leavecheckout;
    public int leavecheckouthour;

    customer(int Arrivaltimeminute, int Arrivaltimehour, time clock){
        this.Arrivaltimeminute=Arrivaltimeminute;
        this.Arrivaltimehour=Arrivaltimehour;
    }
    //gets arrival time minute
    public int getarrivalminute(){
        return Arrivaltimeminute;
    }
//gets the arrival time hour
    public int getArrivaltimehour() {
        return Arrivaltimehour;
    }
//gets the minute the customer left
    public int getleaveminute(){
        return leavecheckout;
    }
    //gets the hour the customer left
    public int getleavehour(){
        return leavecheckouthour;
    }
    //gets the minute the customer enters checkout
    public int getEntercheckout() {
        return entercheckout;
    }
    //increases timer by one minute
    public void minuteincrease(){
        minute+=1;

    }
    //sets the leaving time hour for a customer

    public void setLeavecheckouthour(int leavecheckouthour) {
        this.leavecheckouthour = leavecheckouthour;
    }
    //sets the leaving time minute for a customer

    public void setLeavecheckout(int leavecheckout) {
        this.leavecheckout = leavecheckout;
    }
    //gets the current time spent at checkout for a customer

    public double getCurrenttimecheckout() {
        return currenttimecheckout;
    }
//gets the current time spent in store for a customer
    public double getCurrenttimeinstore() {
        return currenttimeinstore;
    }
// set the time currently spent at checkout for a customer
    public void setCurrenttimecheckout() {
        currenttimecheckout += 1;
    }
//sets the current time shopping for a customer
    public void setCurrenttimeinstore() {
        currenttimeinstore += 1;
    }

    //sets boolean value wheter the customer is still shopping
    public void setShopping(boolean shopping) {
        Shopping = shopping;
    }
//returns if the customer is in checkout
    public boolean isCheckout() {
        return checkout;
    }
//returns if the customer has left
    public boolean isLeft() {
        return left;
    }

    //returns if the customer is shopping
    public boolean isShopping() {
        return Shopping;
    }
    //sets if the customer is in checkout
    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }
    //sets if the customer has left

    public void setLeft(boolean left) {
        this.left = left;
    }
    //gets the minute

    public int getMinute() {
        return minute;
    }
}
