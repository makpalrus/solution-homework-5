package proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }


    private void loadImageFromDisk() {
        System.out.println("Loading high-res image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-res thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying high-res image: " + filename);
    }
}
