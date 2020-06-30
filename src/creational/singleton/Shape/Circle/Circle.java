/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.Shape.Circle;

import creational.singleton.Shape.Shape;

/**
 *
 * @author quang
 */
public class Circle extends Shape{

    private static Circle instance;
    
    public static Circle createInstance() {
        if (instance == null)
            instance = new Circle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tròn";
    }
    
}
