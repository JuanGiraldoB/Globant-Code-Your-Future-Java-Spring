package Entities;

public class Movie {

    private String title;
    private Integer duration;
    private Integer minimumAge;
    private String director;

    public Movie(String title, Integer duration, Integer minimumAge, String director) {
        this.title = title;
        this.duration = duration;
        this.minimumAge = minimumAge;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", minimumAge=" + minimumAge +
                ", director='" + director + '\'' +
                '}';
    }
}
