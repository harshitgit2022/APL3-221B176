public class Main {
    public static void main(String[] args) {
       Offerings offering=new Tea();
       System.out.println(offering.getPrice());
       offering=new Rum(offering);
       System.out.println(offering.getName()+offering.getPrice());
    }
}