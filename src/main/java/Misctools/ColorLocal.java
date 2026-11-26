package Misctools;

public enum ColorLocal {
    WHITE,
    BLACK;

    public ColorLocal opposite() {
        return this == WHITE ? BLACK : WHITE;
    }
}
