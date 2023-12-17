package MlodyPucekIndustries.model.maps;
import MlodyPucekIndustries.model.utils.Vector2d;

public interface MoveValidator {
    boolean canMoveTo(Vector2d position);

    Vector2d validPosition(Vector2d position);
}