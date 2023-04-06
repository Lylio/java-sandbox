package ProgramToTheInterface;

import Enums.Colours;

public interface Polygon {

    Colour colour;
    void getArea(double length, double breadth) {
    };

    void setColor(Color colour) {
    }

    void getColour() {
        return colour;
    }
}
