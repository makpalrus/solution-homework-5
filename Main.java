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

    }
}
