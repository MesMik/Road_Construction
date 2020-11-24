public class Work implements Work_price {
    Materials m1 = new Materials("Granular", "soil", 16, 2900, 10.5);
    int fillValue = m1.getCountOfM();
    int cutValue = m1.getCountOfM();
    int quantity = fillValue + cutValue;

    Mechanisms track1 = new Mechanisms("Kamaz", "track", 2011, 'd', 4, 15);
    int price1 = track1.fPrice();
    Workers foreman1 = new Workers("Vaghinak", "Galstyan", 1988, 'm', 2.5, 150000);

    @Override
    public void workPrice() {
        int wPrice = track1.fPrice() * 16 + quantity + foreman1.getSalary();
        System.out.println("This work costs - " + wPrice + " $");
    }
}
