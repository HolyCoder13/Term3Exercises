import java.util.Arrays;

public class CommissionWorker extends Worker{
    private double[] monthly_paid;
    public CommissionWorker(){}

    public CommissionWorker(String name, String last_name, int birth, int pesel, int employ_year, char gend, String company, String occupation, double[] monthly_paid) {
        super(name, last_name, birth, pesel, employ_year, gend, company, occupation);
        this.monthly_paid = monthly_paid;
    }

    public double[] getMonthly_paid() {
        return monthly_paid;
    }

    public void setMonthly_paid(double[] monthly_paid) {
        this.monthly_paid = monthly_paid;
    }

    @Override
    public String toString() {
        return "CommissionWorker{" +
                "monthly_paid=" + Arrays.toString(monthly_paid) +
                "} " + super.toString();
    }

    public double calculateAverageSalary(){
        double sum = 0;
        for(double s:monthly_paid){
            sum+=s;
        }
        return sum/monthly_paid.length;
    }

    public double calculateTotalIncome(){
        double sum = 0;
        for(double s:monthly_paid){
            sum+=s;
        }
        return sum;
    }

    public int calculateBiggerIncomes(double param){
        int licznik=0;
        for (double s:monthly_paid)
            if(s>param)
                licznik++;

        return licznik;
    }
}
