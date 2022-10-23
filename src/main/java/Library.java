import java.util.*;

public class Library {
    private String name;
    private String countryOfOrigin;
    private String[] countriesOfAccess;
    private ArrayList<Book> booksOfCollection;

    Library(String name, String countryOfOrigin, String[] countriesOfAccess, ArrayList<Book> books){
        this.booksOfCollection = books;
        this.countriesOfAccess = countriesOfAccess;
        this.countryOfOrigin = countryOfOrigin;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String[] getCountriesOfAccess() {
        return countriesOfAccess;
    }

    public void setCountriesOfAccess(String[] countriesOfAccess) {
        this.countriesOfAccess = countriesOfAccess;
    }

    public ArrayList<Book> getBooksOfCollection() {
        return booksOfCollection;
    }

    public void setBooksOfCollection(ArrayList<Book> booksOfCollection) {
        this.booksOfCollection = booksOfCollection;
    }
}
