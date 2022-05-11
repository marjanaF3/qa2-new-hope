package lesson2;

import org.junit.jupiter.api.Test;

public class CarsAndTrains {
    @Test
    public void usingObjects() {
        Trains sigal = new Trains();
        sigal.setTrainModel("AKA");
        sigal.setAverageSpeed(150);
        sigal.setFuelConsuption(120);
        sigal.setFuelPrice(1);
        sigal.setTrainLoad(300);
        sigal.setTrainUnload(350);
        sigal.setLoadWeight(1);
        sigal.setDistanceTogo(500);

        Trains crown =new Trains();
        crown.setTrainModel("Fast");
        crown.setAverageSpeed(155);
        crown.setFuelConsuption(110);
        crown.setFuelPrice(1);
        crown.setTrainLoad(320);
        crown.setTrainUnload(350);
        crown.setLoadWeight(2);



        Cars scania = new Cars();
        scania.setCarModel("P 380");
        scania.setAverageSpeed(90);
        scania.setFuelConsuption(40);
        scania.setFuelPrice(2);
        scania.setLoadPrice(250);
        scania.setUnloadPrice(300);
        scania.setLoadWeight(1);

        Cars man = new Cars();
        man.setCarModel("Fire");
        man.setAverageSpeed(100);
        man.setFuelConsuption(25);
        man.setFuelPrice(2);
        man.setLoadPrice(200);
        man.setUnloadPrice(250);
        man.setLoadWeight(2);

        Cars volvo = new Cars();
        volvo.setCarModel("V100");
        volvo.setAverageSpeed(110);
        volvo.setFuelConsuption(30);
        volvo.setFuelPrice(2);
        volvo.setLoadPrice(175);
        volvo.setUnloadPrice(300);
        volvo.setDistanceTogo(500);
        volvo.setLoadWeight(1);


        System.out.println(volvo.getDistanceTogo()/100 * volvo.getFuelConsuption() + " " + "Liters for 500km distance");
        System.out.println(sigal.getDistanceTogo()/100 * sigal.getFuelConsuption() + " " + "Liters for 500km distance");
        System.out.println(volvo.getDistanceTogo() *((volvo.getFuelConsuption() * volvo.getFuelPrice())/100)*volvo.getLoadWeight() + volvo.getLoadPrice() + volvo.getUnloadPrice() + "EUR" + " " + "Cost of 1-tonne transportation");
        System.out.println(sigal.getDistanceTogo() *((sigal.getFuelConsuption() * sigal.getFuelPrice())/100)* sigal.getLoadWeight() + sigal.getTrainLoad() + sigal.getTrainUnload() + "EUR" + " " + "Cost of 1-tonne transportation on train");
        System.out.println(((sigal.getDistanceTogo() *(sigal.getFuelConsuption() * sigal.getFuelPrice())/100)* sigal.getLoadWeight() + (sigal.getTrainLoad() + sigal.getTrainUnload())) - ((volvo.getDistanceTogo() *((volvo.getFuelConsuption() * volvo.getFuelPrice())/100)*volvo.getLoadWeight()) + ( volvo.getLoadPrice() + volvo.getUnloadPrice())
        ) + "EUR" + " " + "Cheaper transportation with Volvo Truck car than with Sigal diesel train." );



        }



}
