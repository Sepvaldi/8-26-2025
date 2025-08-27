package bond;
public class SavingsBond {
    public String name;
    public double balance, rate;
    public int term, monthsreamini;

    public void setTermAndRate(int t){
        if (t >= 0 && t<12)
        rate = 0.005; 
        else if (t >= 12 && t<24)
        rate = 0.010;
        else if (t >= 24 && t<36)
        rate = 0.015;
        else if (t >= 36 && t<48)
        rate = 0.020;
        else if (t >= 48 && t<60)
        rate = 0.025; 
        else{
            System.out.println("Term tidak valid");
        }
    }

        public void earnInterest(){
            if (monthsreamini > 0) {
                balance = balance * rate / 12;
                monthsreamini--;
                System.out.println("Balance: $"+ balance);
                System.out.println("Rate: " +rate);
                System.out.println("Months Remaining: " + monthsreamini);
            }
            else{
                System.out.println("Bond Matured");
            }
        }
}


