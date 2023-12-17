package MlodyPucekIndustries.model.elements;

import MlodyPucekIndustries.model.utils.Vector2d;

public class Water implements WorldElement{
    private final Vector2d position;

    public Water(Vector2d position){
        this.position = position;
    }

    @Override
    public Vector2d getPosition() {
        return this.position;
    }

    @Override
    public boolean isAt(Vector2d position) {
        return this.position.equals(position);
    }

    @Override
    public String toString() {
        return "~";
    }
}