
package AnimeDWH;


public class AnimeDWH {

    int ID;
    String Name;
    String Type;
    String SecondaryType;
    String Provider;
    String Producer;
    double Rating;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getSecondaryType() {
        return SecondaryType;
    }

    public void setSecondaryType(String SecondaryType) {
        this.SecondaryType = SecondaryType;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return ID + "|" + Type + "|" + Provider + "|" + Producer + "|" + Rating;
    }
    
    
    
    
}
