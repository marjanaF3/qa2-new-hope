package lesson2;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Trains {
    private String trainModel;
    private float fuelConsuption;
    private int averageSpeed;
    private float fuelPrice;
    private int trainLoad;
    private int trainUnload;
    private int distanceTogo;

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    private int loadWeight;

    public int getDistanceTogo() {
        return distanceTogo;
    }

    public void setDistanceTogo(int distanceTogo) {
        this.distanceTogo = distanceTogo;
    }

    public String getTrainModel() {
        return trainModel;
    }

    public void setTrainModel(String trainModel) {
        this.trainModel = trainModel;
    }

    public float getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(float fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public float getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(float fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public int getTrainLoad() {
        return trainLoad;
    }

    public void setTrainLoad(int trainLoad) {
        this.trainLoad = trainLoad;
    }

    public int getTrainUnload() {
        return trainUnload;
    }

    public void setTrainUnload(int trainUnload) {
        this.trainUnload = trainUnload;
    }
}

     /*
    public float getTrainCost(float km){
        float x = getFuelConsuption(km)+trainLoad+trainUnload;
        System.out.println(x);
        return x;

    }

    private float getFuelConsuption (float km) {
        return (km * fuelConsuption);
    }
}

      */
