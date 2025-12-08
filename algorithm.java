import java.math.BigDecimal;
import java.math.RoundingMode;

public class algorithm {
    int historicalCustomer;
    double historicalWait;
    double Averagetimespent;
    algorithm(int historicalCustomer, double historicalWait,double Averagetime){
        this.historicalCustomer=historicalCustomer;
        this.historicalWait=historicalWait;
        Averagetimespent=Averagetime;

    }
// Poisson algorithm for five minute increments returns a probability
    public double Poissond5mins(){
        int historical=historicalCustomer/12;
        double factor=historical;
        BigDecimal whole=BigDecimal.valueOf(1);
        while(factor>0){
            whole=whole.multiply(BigDecimal.valueOf(factor));
            factor-=1;

        }

        double go= ((Math.pow(historical,historical))*(Math.pow(Math.E,-historical)));
        BigDecimal value=BigDecimal.valueOf(go);

        value=value.divide(whole,7, RoundingMode.HALF_DOWN);
        go= value.doubleValue();
        return go;
    }
    // Poisson algorithm for ten minute increments returns a probability
    public double Poissond10mins(){
        int historical=historicalCustomer/6;
        double factor=historical;
        BigDecimal whole=BigDecimal.valueOf(1);
        while(factor>0){
            whole=whole.multiply(BigDecimal.valueOf(factor));
            factor-=1;

        }

        double go= ((Math.pow(historical,historical))*(Math.pow(Math.E,-historical)));
        BigDecimal value=BigDecimal.valueOf(go);

        value=value.divide(whole,7, RoundingMode.HALF_DOWN);
        go= value.doubleValue();
        //BigInteger[] value= whole.divideAndRemainder(num);

        return go;
    }
    // Poisson algorithm for fifteen minute increments returns a probability
    public double Poissond15mins(){
        int historical=historicalCustomer/4;
        double factor=historical;
        BigDecimal whole=BigDecimal.valueOf(1);
        while(factor>0){
            whole=whole.multiply(BigDecimal.valueOf(factor));
            factor-=1;

        }

        double go= ((Math.pow(historical,historical))*(Math.pow(Math.E,-historical)));
        BigDecimal value=BigDecimal.valueOf(go);

        value=value.divide(whole,7, RoundingMode.HALF_DOWN);
        go= value.doubleValue();
        //BigInteger[] value= whole.divideAndRemainder(num);

        return go;
    }

    // Poisson algorithm for sixty minute increments returns a probability
    public double Poissond60mins(){
        int historical=historicalCustomer;
        double factor=historical;
        BigDecimal whole=BigDecimal.valueOf(1);
        while(factor>0){
            whole=whole.multiply(BigDecimal.valueOf(factor));
            factor-=1;

        }

        double go= ((Math.pow(historical,historical))*(Math.pow(Math.E,-historical)));
        BigDecimal value=BigDecimal.valueOf(go);

        value=value.divide(whole,7, RoundingMode.HALF_DOWN);
        go= value.doubleValue();
        //BigInteger[] value= whole.divideAndRemainder(num);

        return go;
    }

    // Exponential algorithm for customers shopping returns a probability
    public double ExponenetialdistributionShop(double currenttime){
        double exponent=0;
        double value=0;


        exponent=-1*((1/Averagetimespent)*currenttime);
            value=1-(Math.pow(Math.E,exponent));



        return value;
    }

    // Exponential algorithm for customers checkout returns a probability
    public double ExponenetialdistributionCheckout(double currenttime){
        double exponent=0;
        double value=0;

        exponent = -1 * ((1 / (historicalWait)) * currenttime);

            value=1-(Math.pow(Math.E,exponent));


        return value;
    }

}


