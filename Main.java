import proxy.Image;
import proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Proxy Pattern ---");
        Image image = new ProxyImage("house.jpg");
        image.displayThumbnail();
        image.displayFullImage();

    }
}
