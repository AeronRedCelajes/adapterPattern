package adapterPattern;

public class ElectronicDeviceApp {

    public static void main(String[] args){

        /*
            Aeron Red R. Celajes
            3BSCS-1
            Lab Assignment 6 Adapter Pattern
        */

        //instantiate all the devices
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        //instantiate all the specific power outlets depending on the device
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneChargerOutlet = new SmartphoneAdapter(smartphoneCharger);

        //this is where the devices are plug into the power outlets
        System.out.println(laptopOutlet.plugIn());
        System.out.println(refrigeratorOutlet.plugIn());
        System.out.println(smartphoneChargerOutlet.plugIn());
    }
}
