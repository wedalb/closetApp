package clothingDef; 

public class Jewelry extends Clothing{
    private String[] METALCOLORS = {"silver", "gold", "rose-gold", "white-silver", "black", "fabric"};
    private String metalColor; // color of metal: silver, gold, rose-gold, white-silver, black, fabric

    public Jewelry(){
        super();
    }

    public String[] getMETALCOLORS() {
        return METALCOLORS;
    }
    public void setMETALCOLORS(String[] METALCOLORS) {
        this.METALCOLORS = METALCOLORS;
    }
}
