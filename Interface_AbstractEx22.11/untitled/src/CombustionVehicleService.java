public class CombustionVehicleService {
    Combustion[] tabCombustion;

    public CombustionVehicleService(Combustion[] tabCombustion) {
        this.tabCombustion = tabCombustion;
    }

    public Combustion[] getTabCombustion() {
        return tabCombustion;
    }

    public void setTabCombustion(Combustion[] tabCombustion) {
        this.tabCombustion = tabCombustion;
    }

    public void wyswietlSpalanieNaDystans(int dystans){
        for(Combustion c:tabCombustion)
            System.out.println(c.ilePaliwaNaDystans(dystans));
    }
}
