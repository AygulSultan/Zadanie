public class Main {
    public static void main(String[] args) {
        Balyk balyk=new Balyk();
        balyk.setName("Forel");
        balyk.setColor("Raduzhnaya");
        balyk.setWeight(2.03);

        System.out.println("balyktyn aty: "+balyk.getName());
        System.out.println("balyktyn tusu: "+balyk.getColor());
        System.out.println("balyktyn salmagy: "+balyk.getWeight());


        Popugay popugay=new Popugay();
        popugay.setName("Volnistyi");
        popugay.setColor("Zelenyi");
        popugay.setWeight(0.78);

        System.out.println("popugaidyn aty: "+popugay.getName());
        System.out.println("popugaidyn tusu: "+popugay.getColor());
        System.out.println("popugaidyn salmagy: "+popugay.getWeight());


        Myshyk myshyk=new Myshyk();
        myshyk.setName("Vislouhaya");
        myshyk.setColor("Golubaya");
        myshyk.setWeight(3.14);

        System.out.println("myshyktyn aty: "+myshyk.getName());
        System.out.println("myshyktyn tusu: "+myshyk.getColor());
        System.out.println("myshyktyn salmagy: "+myshyk.getWeight());

        It it=new It();
        it.setName(" Haski");
        it.setColor("Seraya");
        it.setWeight(7.534);

        System.out.println("ittin aty: "+it.getName());
        System.out.println("ittin tusu: "+it.getColor());
        System.out.println("ittin salmagy: "+ it.getWeight());






    }
}