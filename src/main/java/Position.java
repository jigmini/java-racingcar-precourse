public class Position {
    private int position;

    public Position() {
        position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void addPosition() {
        position++;
    }

    @Override
    public String toString() {
        return String.valueOf(position);
    }
}
