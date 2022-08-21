
package Books;


public class Bookinfo {

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTopic() {
        return topic;
    }

    public String getEdition() {
        return edition;
    }

    public String getLanguaje() {
        return languaje;
    }

    public String getCover() {
        return cover;
    }
    
    public String getSinopsis(){
        return Sinopsis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    
    public void setSinopsis(String sinopsis){
        this.Sinopsis=sinopsis;
    }
    
    static String title;
    static String author;
    static String ISBN;
    static String year;
    static String genre;
    static String topic;
    static String edition;
    static String languaje;
    static String cover;
    static String Sinopsis;

    public Object getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
