package org.tqa;

/**
 * Sentence App to find longest word, shortest word
 * and their lengths in a sentence
 *
 */
public class App 
{
    String sentence;

    public App(String sentence) {
        this.sentence = sentence;
    }

    public String longestWord() {
        String[] sarr = sentence.split(" ");
        int maxIdx = 0;
        for (int i = 1; i < sarr.length; i++) {
            if (sarr[i].length() > sarr[maxIdx].length()) {
                maxIdx = i;
            }
        }
        return sarr[maxIdx];
    }

    public String shortestWord() {
        String[] sarr = sentence.split(" ");
        int minIdx = 0;
        for (int i = 1; i < sarr.length; i++) {
            if (sarr[i].length() < sarr[minIdx].length()) {
                minIdx = i;
            }
        }
        return sarr[minIdx];
    }

    public int getShortestWordLength() {
        return this.shortestWord().length();
    }

    public int getLongestWordLength() {
        return this.longestWord().length();
    }
}
