public class Mechanisms {
    private String name = "Cat";
    private String type = "excavator";
    private int produceYear = 1990;
    private char fuelType = 'd';

    public Mechanisms(String name, String type, int produceYear, char fuelType) {
        setName(name);
        setType(type);
        setProduceYear(produceYear);
        setFuelType(fuelType);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter mechanism's name.");
        } else
            this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.isEmpty()) {
            System.out.println("Please enter mechanism's type.");
        } else
            this.type = type;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        if (produceYear > 1990 && produceYear < 2020)
            this.produceYear = produceYear;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        if (fuelType == 'g') {
            this.fuelType = fuelType;
        } else if (fuelType == 'd') {
            this.fuelType = fuelType;
        }
    }
}
