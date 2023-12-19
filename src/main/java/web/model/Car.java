package web.model;


public class Car {
    private String model;
    private int series;
    private long mileage;
    public Car(String model, int series, long mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public long getMileage() {
        return mileage;
    }
}
