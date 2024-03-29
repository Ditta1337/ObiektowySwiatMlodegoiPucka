package MlodyPucekIndustries.model.utils;

public enum MapDirection {
    N,
    S,
    W,
    E,
    NW,
    NE,
    SW,
    SE;

    public int parseDirection(MapDirection direction) {
        return switch(direction) {
            case N -> 0;
            case NE -> 1;
            case E -> 2;
            case SE -> 3;
            case S -> 4;
            case SW -> 5;
            case W -> 6;
            case NW -> 7;
        };
    }

    public MapDirection spin(int value) {
        return switch ((parseDirection(this) + value) % 8) {
            case 0 -> N;
            case 1 -> NE;
            case 2 -> E;
            case 3 -> SE;
            case 4 -> S;
            case 5 -> SW;
            case 6 -> W;
            case 7 -> NW;
            // todo: fix
            default -> throw new IllegalStateException("Unexpected value: " + ((parseDirection(this) + value) % 8));
        };
    }


    public Vector2D toUnitVector() {
        return switch(this) {
            case N -> new Vector2D(0, 1);
            case S -> new Vector2D(0, -1);
            case W -> new Vector2D(-1, 0);
            case E -> new Vector2D(1, 0);
            case NW -> new Vector2D(-1, 1);
            case NE -> new Vector2D(1, 1);
            case SW -> new Vector2D(-1, -1);
            case SE -> new Vector2D(1, -1);
        };
    }

    @Override
    public String toString() {
        return switch(this) {
            case N -> "↑";
            case S -> "↓";
            case W -> "←";
            case E -> "→";
            case NW -> "↖";
            case NE -> "↗";
            case SW -> "↙";
            case SE -> "↘";
        };
    }

}

