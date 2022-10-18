public class Main {
    public static void main(String[] args){
        blueCollarWorker blueCollar1 = new blueCollarWorker("D", "M",1993,1234,2001,'F',"company","worker",60,12);
        blueCollar1.display();
        System.out.println(blueCollar1.calculatePayment());
        System.out.println(blueCollar1.calculateTimeToRetirement());

        whiteCollarWorker whiteCollar1 = new whiteCollarWorker("aa", "bb",1987,12777,2000,'M',"company","office",67);
        whiteCollar1.display();
        System.out.println(whiteCollar1.getSalary());
        System.out.println(whiteCollar1.calculateTimeToRetirement());

        CommissionWorker commision1 = new CommissionWorker("D", "M", 1997, 19234, 2007, 'M', "asd", "asdd", new double[]{123.0,1234.0,123456});
        System.out.println("Ile razy zarobil wiecej niz 1000: "+commision1.calculateBiggerIncomes(1000));
        System.out.println("Ile do emerytury: "+commision1.calculateTimeToRetirement());
    }
}
