public class CD implements ToBeStored {
    private final String artist, title;
    private final int publishedYear;
    private final double weight;

    public CD(String artist, String title, int publishedYear) {
        this.artist = artist;
        this.title = title;
        this.publishedYear = publishedYear;
        this.weight = 0.1;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.artist+": "+this.title +" ("+this.publishedYear+")";
    }
}
