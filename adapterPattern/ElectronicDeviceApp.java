package adapterPattern;

public class ElectronicDeviceApp {

    public static void main(String[] args){
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneChargerOutlet = new SmartphoneAdapter(smartphoneCharger);

        // This is where the devices are plug into the power outlets
        System.out.println(laptopOutlet.plugIn());
        System.out.println(refrigeratorOutlet.plugIn());
        System.out.println(smartphoneChargerOutlet.plugIn());
    }
}
