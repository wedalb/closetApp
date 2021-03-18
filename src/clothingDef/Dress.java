package clothingDef;

/**
 * Dress has also a dress length
 */
public class Dress extends Clothing{
    public final String[] DRESS_LENGTH = {"mini", "maxi", "knee-length", "above knee", "below knee", "ankle length"};
    private String length;

    public Dress(){
        super();
    }

    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
}
