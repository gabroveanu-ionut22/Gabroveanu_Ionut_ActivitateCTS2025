package Composite;

public class CompositeDemo {
    public static void main(String[] args){
        Graphic circle= new Circle();
        Graphic rectangle = new Rectangle();
        CompositeGraphic graphic = new CompositeGraphic();
        graphic.add(circle);
        graphic.add(rectangle);

        CompositeGraphic fullDrawing = new CompositeGraphic();
        fullDrawing.add(circle);
        fullDrawing.add(rectangle);
        fullDrawing.draw();

    }
}
