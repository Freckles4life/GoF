class RectangleGenerator extends ShapeGenerator {
    private ShapeFactory factory;

    public RectangleGenerator(ShapeObserver observer, ShapeFactory factory) {
        super(observer);
        this.factory = factory;
    }

    @Override
    protected Shape createShape() {
        return factory.createShape();
    }
}