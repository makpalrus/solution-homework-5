package proxy;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-res thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() { // We upload the image only if it has not been uploaded yet
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}
