import java.util.*;

class BankAcc{
    private double mem_bal;
    BankAcc(double mem_bal){
        this.mem_bal=mem_bal;
    }
    void calc(intrest i){
        balance=i.cal_intr(i.rate);


    }
    private class intrest{
        private double rate;
        intr(double rate){
            this.rate=rate;
        
        }
        double cal_intr(double rate){
            return (mem_bal*rate/100);
        }
        }
    }           
}

