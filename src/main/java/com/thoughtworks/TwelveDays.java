package com.thoughtworks;

class TwelveDays {

    String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
                      "ninth", "tenth", "eleventh", "twelfth"};
    String[] presents = {"a Partridge in a Pear Tree.", "two Turtle Doves, and ", "three French Hens, ",
                         "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ",
                          "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ", "eleven Pipers Piping, ",
                          "twelve Drummers Drumming, "};

    void lyrics() {
        System.out.println(verses(1,12));
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++)
            verses.append(verse(i)).append("\n\n");
        return verses.toString();
    }

    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder();
        verse.append("On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ");

        for (int i = verseNumber - 1; i >= 0; i--)
            verse.append(presents[i]);
        return verse.toString();
    }
}
