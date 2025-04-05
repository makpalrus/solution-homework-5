package proxy;

public class ProtectionProxyImage implements Image {
    private String filename;
    private RealImage realImage;
    private boolean isAuthorized;

    public ProtectionProxyImage(String filename, boolean isAuthorized) {
        this.filename = filename;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-res thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        if (!isAuthorized) {
            System.out.println("Access Denied: You must be logged in to view the full image.");
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}

