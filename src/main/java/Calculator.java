public class Calculator {
        private int num1;
        private int num2;
        private double num3;
        private double num4;



    public Calculator(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public int getAddSum() {return this.num1 + this.num2; }
    public int getSubtractSum() {return this.num1 - this.num2;}
    public int getMultiplySum() {return this.num1 * this.num2;}
    public double getDivideSum() {return this.num3 / this.num4;}
}
