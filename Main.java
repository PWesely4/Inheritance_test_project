public class Main {

    public static void main(String[] args) {
        Company Company1 = new Company();
        Company Company2 = new Company();

        Company1.name = "IBM";
        Company2.name = "Apple";

        Company1.getName();
        Company2.getName();

        Public opublic = new Public();
        opublic.name = "Google";
        opublic.stock_symbol = "goog";
        Public[] apublic = new Public[3];
        apublic[0] = opublic;
        System.out.println(apublic[0]);

        
    }
}
