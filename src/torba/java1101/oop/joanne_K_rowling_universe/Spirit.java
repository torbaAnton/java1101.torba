package torba.java1101.oop.joanne_K_rowling_universe;

public class Spirit {
    /*
    *@javadoc
    * прозрачность может быть от 0 до 1
    *
    *
    *
    *
     */
     private float transparency;
    /*
     *@javadoc
     * бестелесность от 0 до 1
     *
     *
     *
     *
     */
     private float incorporeality;

    /*
     *@javadoc
     * прозрачность
     *
     *
     *
     *
     */
     private Temperament temperament;
     private String name;
     private String location;
     private String description;
     private Sex sex;

     public Spirit() {

     }

    public Spirit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Temperament getTemperament() {
        return temperament;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public float getIncorporeality() {
        return incorporeality;
    }

    public void setIncorporeality(float incorporeality) {
        this.incorporeality = incorporeality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String changeLocation(){
         return "I changed my location";
     }
     public String speak(){
         return null;
     }
     public String think(){
         return "I am Groot";
     }
    public float getTransparency(){
         return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }
    public String toString(){
        return "Name is: "+getName()+"\n"+"Description is: "+getDescription()+"\n"+"Incorporeality is: "+getIncorporeality()
                +"\n"+"Location is: "+getLocation()+"\n"+"Sex is: "+getSex()+"\n"+"Temperament is: "+getTemperament()+"\n"+"Transparency is: "+getTransparency()+"\n";
    }

}

