/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

import creational.singleton.Shape.Shape;
import creational.singleton.Shape.ShapeType;
import creational.singleton.ShapeFactory.ShapeFactory;

/**
 *
 * @author quang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory ft = new ShapeFactory();
        Shape r = ft.createShape(ShapeType.Rectangle);
        Shape t = ft.createShape(ShapeType.Triangle);
        Shape c = ft.createShape(ShapeType.Circle);
        
        System.out.println(r.toString());
        System.out.println(t.toString());
        System.out.println(c.toString());
        
        Shape r1 = ft.createShape(ShapeType.Rectangle);
        Shape t1 = ft.createShape(ShapeType.Triangle);
        Shape c1 = ft.createShape(ShapeType.Circle);
        
        r1.setBrush("Bút chì");
        t1.setPaper("A4");
        c1.setFrame("Khung nhựa");
        
        System.out.println("\n");
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        System.out.println(c1.toString());
    }
    
}
