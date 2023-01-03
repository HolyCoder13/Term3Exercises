public class KlasaZewnetrzna {
    private int number;
    private static int staticNumber;

    public KlasaZewnetrzna(int number) {
        this.number = number;
    }

    public class KlasaWewnetrzna{
        class KlasaLokalna{
            public  void printFromLocal(){
                System.out.println("klas lokalna invoked!");
            }
        }
        private int a;

        public KlasaWewnetrzna(int a) {
            this.a = a;
        }

        public void printVariable(){
            System.out.println(a);

        }
    }

    public static class KlasaWewnetrznaStatyczna{
        public static void printVariableStatic(){
            System.out.println(staticNumber);
        }
        public void useInterfaceMethod(Interface interfejs){

        }
    }


}
