import java.time.LocalDate;

public class Worker {

    private String name;
    private String last_name;
    private int birth;

    private int Pesel;
    private int employ_year;
    private char gend;
    private String company;
    private String occupation;

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getPesel() {
        return Pesel;
    }

    public void setPesel(int pesel) {
        Pesel = pesel;
    }

    public void setEmploy_year(int employ_year) {
        this.employ_year = employ_year;
    }

    public int getEmploy_year() {
        return employ_year;
    }

    public int getBirth() {
        return birth;
    }

    public char getGend() {
        return gend;
    }

    public String getCompany() {
        return company;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setGend(char gend) {
        this.gend = gend;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Worker(String name, String last_name, int birth, int pesel, int employ_year, char gend, String company, String occupation) {
        this.name = name;
        this.last_name = last_name;
        this.birth = birth;
        Pesel = pesel;
        this.employ_year = employ_year;
        this.gend = gend;
        this.company = company;
        this.occupation = occupation;
    }

    public Worker() {
    }

    public int getAge() {
        return LocalDate.now().getYear() - birth;
    }

    public int calculateJobSeniority() {
        return LocalDate.now().getYear() - employ_year;
    }

    public int calculateTimeToRetirement(){
        int timeTo = 0;
        if(gend == 'F')
            timeTo = 60-getAge();
        else //if(gend == 'M')
            timeTo = 65-getAge();

//        if(timeTo<0)
//            timeTo=0;
        return (timeTo<0)? 0:timeTo;
//        return timeTo;
    }
    public void Display(){
        System.out.println(toString());
    }



    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth=" + birth +
                ", Pesel=" + Pesel +
                ", employ_year=" + employ_year +
                ", gend=" + gend +
                ", company='" + company + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
