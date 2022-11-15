public abstract class Zwierz {

    private String name = "bez_imienia";

    public Zwierz(){};
    public Zwierz(String name){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getTyp();

    @Override
    public String toString() {
        return "Zwierz{" +
                "name='" + name + '\'' +
                '}';
    }
}
