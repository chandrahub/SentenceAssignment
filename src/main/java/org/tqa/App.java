package org.tqa;

/**
 * Sentence App to find longest word, shortest word
 * and their lengths in a sentence
 *
 */
public class App 
{
    private final String sentence;

    public App(String sentence) {
        this.sentence = sentence;
    }

    private String[] splitSentence() {
        return sentence.split(" ");
    }

    public String longestWord() {
        String[] strArr = splitSentence();
        int maxIdx = 0;
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() > strArr[maxIdx].length()) {
                maxIdx = i;
            }
        }
        return strArr[maxIdx];
    }

    public String shortestWord() {
        String[] strArr = splitSentence();
        int minIdx = 0;
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() < strArr[minIdx].length()) {
                minIdx = i;
            }
        }
        return strArr[minIdx];
    }

    public int getShortestWordLength() {
        return this.shortestWord().length();
    }

    public int getLongestWordLength() {
        return this.longestWord().length();
    }
}
