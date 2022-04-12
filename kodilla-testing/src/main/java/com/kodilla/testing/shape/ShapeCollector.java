package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;

    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public Shape getFigure() {
        return shapeCollection.remove(0);

    }

   public Shape getFigure(int n) {
        if (n < shapeCollection.size() && n >= 0) {
            return shapeCollection.get(n);
        } else {
            return null;
        }
   }

    public void showFigures() {
        System.out.println(shapeCollection.toString());
    }



}
