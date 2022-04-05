package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTsk {


    public String country,title,Genre,releaseDate,director;
    public ArrayList<String>casts=new ArrayList<>();

    public MovieTsk(String country, String title,String Genre,String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre=Genre;
        this.releaseDate = releaseDate;
        this.director = director;
       casts=new ArrayList<>();


    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
      casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "MovieTsk{" +
                ", title='" + title + '\'' +
                "name of country='" + country + '\'' +
                "Genre='" + Genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", Director='" + director + '\'' +
                ", total number of casts" + casts.size() +
                '}';
    }
}
/*
 Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

 */