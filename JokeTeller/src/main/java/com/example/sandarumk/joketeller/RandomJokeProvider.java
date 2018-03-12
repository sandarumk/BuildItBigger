package com.example.sandarumk.joketeller;

public class RandomJokeProvider {

    public static String getAJoke(){
        JokeRepository jokeRepository = new JokeRepository();
        return jokeRepository.getARandomJoke();
    }

}
