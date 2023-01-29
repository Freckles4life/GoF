class CircleGenerator extends ShapeGenerator {
    private ShapeFactory factory;

    public CircleGenerator(ShapeObserver observer, ShapeFactory factory) {
        super(observer);
        this.factory = factory;
    }

    @Override
    protected Shape createShape() {
        return factory.createShape();
    }
}