package zad_01;

public class TabliceMetodyPomocnicze {
    public static float obliczSrednia(float[] t){
        float srednia=0.0F;
        for(int i=0;i<t.length;i++){
            srednia+=t[i];
        }
        srednia=srednia/t.length;
        return srednia;
    }

    public static TablWynik znajdzMinOrazIndex(float[] t){
        float min = t[0];
        int index =0;
        for(int i=0;i<t.length;i++){
            if(t[i]<min){
                min=t[i];
                index=i;
            }
        }
        TablWynik wynik = new TablWynik(min,index);
        return wynik;
    }

    public static TablWynik znajdzMaxOrazIndex(float[] t){
        float max = t[0];
        int index =0;
        for(int i=0;i<t.length;i++){
            if(t[i]>max){
                max=t[i];
                index=i;
            }
        }
        TablWynik wynik = new TablWynik(max,index);
        return wynik;
    }
    public static int znajdzIndeksElementu(float[] t,float x){
        //int index =-1;
        for(int i=0; i<t.length;i++){
            if(t[i]==0){
                //index=i;
                return i;

            }
        }
        //return index;
        return -1;
    }

    public static PlusMinusZero obliczIlePlusMinusZer(float[] t){
        int ilePlus=0;
        int ileMinus=0;
        int ileZero=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>0){
                ilePlus++;
            }
            else if(t[i]<0){
                ileMinus++;
            }
            else{
                ileZero++;
            }
        }
        return new PlusMinusZero(ilePlus,ileMinus,ileZero);
    }


}