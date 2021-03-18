package clothingDef; 

public  class Clothing {
    private String name; // is like an id and cant be doubled
    private String size;
    private String color;
    private byte season; // both seasons = 0, summer = 1, winter = 2,

    // Is supposed to be a generic type that extends clothing
    private Clothing prev;
    private Clothing next;


    Clothing(){
        this.prev = null;
        this.next = null;
    }

    // Getter and setter for super Class clothing
    public Clothing getPrev() {
        return prev;
    }
    public void setPrev(Clothing prev) {
        this.prev = prev;
    }
    public Clothing getNext() {
        return next;
    }
    public void setNext(Clothing next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public byte getSeason() {
        return season;
    }
    public void setSeason(byte season) {
        this.season = season;
    }
}