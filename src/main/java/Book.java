import java.util.ArrayList;
import java.util.*;
import java.util.Date;

public class Book implements Comparator<Book> {
    private String name;
    private String author;
    private
    Date published;
    private
    ArrayList<String> genres;
    private
    ArrayList<String> departments;
    private
    String countriesAvailable;
    private
    ArrayList<String> bibliography;
    private boolean isAvailable;

    public Book(String name, String author, Date published, ArrayList<String> genres, ArrayList<String> departments, String countriesAvailable, ArrayList<String> bibliography) {
        this.name = name;
        this.author = author;
        this.published = published;
        this.genres = genres;
        this.departments = departments;
        this.countriesAvailable = countriesAvailable;
        this.bibliography = bibliography;
        this.isAvailable = true;
    }



    @Override
    public int compare(Book book, Book t1) {
        return 0;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }

    public String getCountriesAvailable() {
        return countriesAvailable;
    }

    public void setCountriesAvailable(String countriesAvailable) {
        this.countriesAvailable = countriesAvailable;
    }

    public ArrayList<String> getBibliography() {
        return bibliography;
    }

    public void setBibliography(ArrayList<String> bibliography) {
        this.bibliography = bibliography;
    }

    public static boolean test(){
        return true;
    }

}
