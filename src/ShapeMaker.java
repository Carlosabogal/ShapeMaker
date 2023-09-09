public class ShapeMaker {
        private DrawingStrategy drawingStrategy;

        public ShapeMaker(DrawingStrategy drawingStrategy) {
            this.drawingStrategy = drawingStrategy;
        }

        public void draw() {
            drawingStrategy.draw();
        }
    }

