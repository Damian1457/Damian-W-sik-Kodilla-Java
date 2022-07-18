package com.kodilla.good.patterns.challenges.movie;

import com.kodilla.good.patterns.challenges.movie.MovieStore;

import java.util.stream.Collectors;

public class MovieStoreRun {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String title = movieStore.getMovies().entrySet().stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(title);
    }

}
