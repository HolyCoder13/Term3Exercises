public class Main {
    public static void main(String[] args){

        Car c1= new Car("BMW","m5",20,8,40,125000);
        try{
            c1.zatankuj(100);
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            c1.zatankujB(-5);
        } catch (ZaDuzoPaliwaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {


            c1.jedz(1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        try {


            int x = 1 / 0;

        }catch(Exception e){
            System.out.println(e);
        }
        try{
            metoda();

        }catch(OurExceptionChecked e){
            System.out.println(e);
        }
        metodaUnchecked();


        try{
            metodaUnchecked();
        }catch(OurExceptionUnchecked e){
            System.out.println(e);
        }
        System.out.println("Hello wrld");
    }

    public static void metoda() throws OurExceptionChecked{ //must throw
        System.out.println("Inside method, check the condition if not meet, throw exception");
        throw new OurExceptionChecked("Error in method");
    };

    public static void metodaUnchecked() throws OurExceptionUnchecked{ //may throw
        System.out.println("Inside method, check the condition if not meet, throw exception");
        throw new OurExceptionUnchecked("Error in unchecked method");
    }


}
