package generating_patterns.prototype;

import generating_patterns.prototype.model.Apple;
import generating_patterns.prototype.model.Samsung;
import generating_patterns.prototype.model.SmartPhone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SmartPhone note100 = new Samsung("Note100");
        SmartPhone iphone13 = new Apple("iPhone13");

        System.out.println(note100);
        System.out.println(iphone13);

        System.out.println("=== Products for VIPs ===");

        SmartPhone note10Gold = note100.clone();
        note10Gold.setAdditionalPrice(50);
        System.out.println(note10Gold);

        SmartPhone iphoneX128 = iphone13.clone();
        iphoneX128.setAdditionalPrice(100);
        System.out.println(iphoneX128);
    }
}
