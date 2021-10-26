import java.util.Objects;

public class Snake {
    int start,end;

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snake)) return false;
        Snake jumper = (Snake) o;
        return getStart() == jumper.getStart() && getEnd() == jumper.getEnd();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getEnd());
    }
}
