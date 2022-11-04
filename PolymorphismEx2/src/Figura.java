abstract public class Figura {
    private double width;
    private double height;

    Figura() {
        width = height = 0;
    }

    Figura(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public void zmaz(){
        this.width=0;
        this.height=0;
        System.out.println("Zmazano figure");

    }

    abstract public void rysuj();

}
