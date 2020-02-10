public class Bottle {
    private int contents;

    public Bottle(int contents) {
        this.contents = contents;
    }

    public int getContents(){
        return this.contents;
    }

    public int drink() {return this.contents - 10; }

    public int empty() {return this.contents - this.contents; }

    public int refill() {return this.contents - this.contents + 100;}

}
