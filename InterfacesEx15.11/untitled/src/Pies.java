public class Pies extends Zwierz implements Speakable,Moveable {

    public Pies(){
    }

    public Pies(String name){
      super(name);
    }

    @Override
    public String getTyp() {
        return "Pies";
    }

    public String getVoice(int voice){
        if(voice==LOUD)
            return "HAU";
        else return "hau";
    }
    @Override
    public void start(){
        System.out.println("Pies wystartwoal");
    }
    @Override
    public void stop(){
        System.out.println("Pies zatrzymal sie");
    }


}
