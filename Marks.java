public abstract class Marks {

    abstract void getPercentage();
}

class A extends Marks {
    private double w;
    private double x;
    private double y;

    public A(double w, double x, double y) {
    this.w=w;
    this.x=x;
    this.y=y;
    }

    @Override
    void getPercentage(){
        System.out.println((w+x+y)/3);
    }

}

class B extends Marks {
    private double w;
    private double x;
    private double y;
    private double z;

    public B(double w, double x,
             double y, double z){
        this.w=w;
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    void getPercentage(){
        System.out.println((w+x+y+z)/4);
    }

}