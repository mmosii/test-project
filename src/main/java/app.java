public class app {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public app(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum(){
        return getA()+getB();

    }
}
