public class Main {
    public static void main(String[] args) {

        ShapeMaker circle = new ShapeMaker(new CircleDrawing());
        ShapeMaker rectangle = new ShapeMaker(new RectancleDrawing());
        ShapeMaker square = new ShapeMaker(new SquareDrawing());

        circle.draw();
        rectangle.draw();
        square.draw();


    }
}