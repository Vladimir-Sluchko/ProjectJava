package utils;

import java.util.HashSet;
import java.util.Set;

public class WordInSet {
    private String text;

    public WordInSet(String text) {
        this.text = text;
    }


    public Set<String> setWord(String text){
        this.text = deleteSimvol();
        Set<String> wordSet = new HashSet<>();
        String [] textWord = text.split(" ");
        for (String word:textWord) {
            wordSet.add(word);
        }
        return wordSet;
    }


    public String deleteSimvol(){
        this.text = text.replaceAll("(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)", " ").replaceAll(" +", " ");
        return text;
    }


    public Integer sizeSet(){
        this.text = deleteSimvol();
        return setWord(text).size();
    }

    public Set<String> print(){
        this.text = deleteSimvol();
        return setWord(text);
    }
}
