package flyweight;

public class ConcreteMarker implements Marker {
    private final String type;

    public ConcreteMarker(String type) {
        this.type = type;
        System.out.println("Creating marker of type: " + type);
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + type + " at (" + x + ", " + y + ")");
    }
}
