/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.ShapeFactory;

import creational.singleton.Shape.Circle.Circle;
import creational.singleton.Shape.Rectangle.Rectangle;
import creational.singleton.Shape.Shape;
import creational.singleton.Shape.ShapeType;
import creational.singleton.Shape.Triangle.Triangle;

/**
 *
 * @author quang
 */
public class ShapeFactory {

    public ShapeFactory() {
        
    }
    
    public Shape createShape(ShapeType type) {
        switch(type) {
            case Rectangle: return Rectangle.createInstance();
            case Triangle: return Triangle.createInstance();
            case Circle: return Circle.createInstance();
        }
        return null;
    }
}
