package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String movies, String categories){
        this.name = movies;
        this.category = categories;
    }

    public String getCategory(){
        return category;
    }

    public String setCategory(String category){
        return category;
    }

    public String getName(){
        return name;
    }
    public String SetName(String name){
        return name;
    }

}
