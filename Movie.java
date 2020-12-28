class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    
}
