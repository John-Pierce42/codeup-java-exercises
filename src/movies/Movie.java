package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movie, String categories){
        this.name = movie;
        this.category = categories;
    }

    public String getCategory(){
        return category;
    }


}
