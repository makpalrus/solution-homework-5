import flyweight.Marker;
import flyweight.MarkerFactory;
import proxy.Image;
import proxy.ProtectionProxyImage;
import proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Proxy Pattern ");
        Image image = new ProxyImage("house.jpg");
        image.displayThumbnail();
        image.displayFullImage();

        System.out.println("\n Protection Proxy ");
        Image protectedImage = new ProtectionProxyImage("home.jpg", false);
        protectedImage.displayThumbnail();
        protectedImage.displayFullImage();

        Image authorizedImage = new ProtectionProxyImage("home.jpg", true);
        authorizedImage.displayThumbnail();
        authorizedImage.displayFullImage();




        System.out.println("\n Flyweight Pattern ");
        Marker hospital = MarkerFactory.getMarker("Hospital");
        Marker restaurant = MarkerFactory.getMarker("Restaurant");

        hospital.display(10, 20);
        restaurant.display(30, 40);

        Marker anotherHospital = MarkerFactory.getMarker("Hospital");
        anotherHospital.display(50, 60);

        System.out.println("Total marker types created: " + MarkerFactory.markers.size());

    }
}
