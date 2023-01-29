// 3. Template Method: Define the steps of an algorithm, allowing subclasses to provide specific implementation
abstract class ShapeGenerator {
    ShapeObserver observer;

    public ShapeGenerator(ShapeObserver observer) {
        this.observer = observer;
    }

    public void generateShape() {
        Shape shape = createShape();
        ShapeStore.getInstance().addShape(shape);
        observer.update();
    }

    protected abstract Shape createShape();
}