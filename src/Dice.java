import java.util.Objects;

public class Dice {
    private int noofdice;

    public Dice(int noofdice) {
        this.noofdice = noofdice;
    }

    public int getNoofdice() {
        return noofdice;
    }

    public void setNoofdice(int noofdice) {
        this.noofdice = noofdice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dice)) return false;
        Dice dice = (Dice) o;
        return getNoofdice() == dice.getNoofdice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoofdice());
    }
     public int diceval(){
         int min=1,max=6;
        return (int) (((Math.random())*(max-min))+min);
     }
}
