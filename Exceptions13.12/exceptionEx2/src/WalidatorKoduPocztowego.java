public class WalidatorKoduPocztowego {
    public static String regex = "^\\d{2}-\\d{3}$";

    public static void WalidujKodPocztowy(String s) throws BlednyKodPocztowyException{
        if(!s.matches(regex)){
            throw new BlednyKodPocztowyException("Blendny kod pocztowy");
        }
    }
}
