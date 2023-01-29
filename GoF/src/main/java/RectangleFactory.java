import java.util.Random;

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        Random random = new Random();
        int width = random.nextInt(100);
        int height = random.nextInt(100);
        return new Rectangle(width, height);
    }
}