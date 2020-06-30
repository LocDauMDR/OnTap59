/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.Shape.Triangle;

import creational.singleton.Shape.Shape;

/**
 *
 * @author quang
 */
public class Triangle extends Shape{

    private static Triangle instance;
    
    public static Triangle createInstance() {
        if (instance == null)
            instance = new Triangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tam giác";
    }
    
}
