import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Podaj kod pocztowy: ");
        Scanner sc = new Scanner(System.in);
        String kod = sc.nextLine();

        try{
            WalidatorKoduPocztowego.WalidujKodPocztowy(kod);
        }catch(BlednyKodPocztowyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
