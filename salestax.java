class SalesTaxCalculator{
    int amount;
    double taxrate;
    void setAmntRate(int a, double r){
        amount = a;
        taxrate = r;
    }

    double calculateTax(){
        return (amount * taxrate)/100;
    }
}

class SalesTax{
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        SalesTaxCalculator ob1 = new SalesTaxCalculator();
        ob1.setAmntRate(a, r);
        double rs = ob1.calculateTax();
        System.out.println("The total tax calculated = "+rs);
    }
}