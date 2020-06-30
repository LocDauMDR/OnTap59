/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.Shape;

/**
 *
 * @author quang
 */
public abstract class Shape {
    String brush, paper, frame;

    public Shape() {
        brush = "Cọ vẽ";
        paper = "A3";
        frame = "Khung gỗ";
    }

    public abstract String draw();

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return brush + ", " + paper + ", " + frame + ": " + draw();
    }  
    
}
