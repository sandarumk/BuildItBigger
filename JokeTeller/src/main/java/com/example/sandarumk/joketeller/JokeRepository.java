package com.example.sandarumk.joketeller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dinu on 3/12/18.
 */

public class JokeRepository {

    private Map<Integer, String> jokesMap;

    public String getARandomJoke() {
        createJokesMap();
        int randomNumber = (int) (Math.random() * 20);
        System.out.println("Random Number: "+ randomNumber);
        String joke = jokesMap.get(randomNumber);
        System.out.println("Joke :"+joke);
        return joke;
    }
    /*
    The following jokes are taken from https://www.rd.com/joke/, http://www.short-funny.com/geek-jokes.php and https://onelinefun.com/
     */
    private void createJokesMap() {
        jokesMap = new HashMap<>();
        jokesMap.put(1, "So what if I don't know what \"Armageddon\" means? It's not the end of the world.");
        jokesMap.put(2, "Why don’t cats play poker in the jungle? Too many cheetahs.");
        jokesMap.put(3, "What do you call the cat that was caught by the police? The purrpatrator.");
        jokesMap.put(4, "What do cats like to eat for breakfast? Mice Krispies.");
        jokesMap.put(5, "What do you call a cat that lives in an igloo? An eskimew!");
        jokesMap.put(6, "What is a cat’s favorite song? Three Blind Mice.");
        jokesMap.put(7, "Why is it so hard for a leopard to hide? Because he’s always spotted.");
        jokesMap.put(8, "I always feel warm on my birthday because people don't stop toasting me.");
        jokesMap.put(9, "I like birthdays, but I think too many can kill you.");
        jokesMap.put(10, "If you feel a bit lonely, forgotten, or just need someone to cheer you up remember...You can always change your birthday on Facebook!");
        jokesMap.put(11, "I tried to say, “I’m a functional adult,” but my phone changed it to “fictional adult,” and I feel like that’s more accurate.");
        jokesMap.put(12, "Q: Why did the computer show up at work late? A: It had a hard drive.");
        jokesMap.put(13, "Thanks to autocorrect, 1 in 5 children will be getting a visit from Satan this Christmas.");
        jokesMap.put(14, "Moses had the first tablet that could connect to the cloud.");
        jokesMap.put(15, "I just asked my husband if he remembers what today is... Scaring men is easy.");
        jokesMap.put(16, "Everything always ends well. If not – it's probably not the end.");
        jokesMap.put(17, "Why are astronauts always so calm and efficient? Zero pressure in vacuum.");
        jokesMap.put(18, "A fine is a tax when you’ve been doing something wrong. A tax is a fine you get when you’ve been doing something right.");
        jokesMap.put(19, "Tomato is a fruit, right? Does that make ketchup a smoothie?");
        jokesMap.put(20, "Any mushroom can be eaten. The trick is to find those mushrooms that can be eaten more than once.");
    }
}
