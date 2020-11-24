public class Materials {
    private String nameOfM = "bazalt";
    private String typeOfM = "soil";
    private int countOfM;
    private int priceOfM;
    private double wieghtOfM = 0.1;

    public String getNameOfM() {
        return nameOfM;
    }

    public void setNameOfM(String nameOfM) {
        if (!nameOfM.isEmpty()) {
            this.nameOfM = nameOfM;
        }
    }

    public String getTypeOfM() {
        return typeOfM;
    }

    public void setTypeOfM(String typeOfM) {
        if (!nameOfM.isEmpty()) {
            this.typeOfM = typeOfM;
        }

    }

    public int getCountOfM() {
        return countOfM;
    }

    public void setCountOfM(int countOfM) {
        if (countOfM > 0)
            this.countOfM = countOfM;
    }

    public int getPriceOfM() {
        return priceOfM;
    }

    public void setPriceOfM(int priceOfM) {
        if (priceOfM > 0)
            this.priceOfM = priceOfM;
    }

    public double getWieghtOfM() {
        return wieghtOfM;
    }

    public void setWieghtOfM(double wieghtOfM) {
        if (wieghtOfM >= 0.01)
            this.wieghtOfM = wieghtOfM;
    }

    public Materials(String nameOfM, String typeOfM, int countOfM, int priceOfM, double wieghtOfM) {
        setNameOfM(nameOfM);
        setTypeOfM(typeOfM);
        setCountOfM(countOfM);
        setPriceOfM(priceOfM);
        setWieghtOfM(wieghtOfM);
    }


    public int mPrice(){
        int matPerKilo = countOfM / (int)wieghtOfM ;
        return matPerKilo;
    }
}
