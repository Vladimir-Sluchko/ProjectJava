package utils;

import java.util.*;

public class WordInMap {

    private String text;
    int top;
    public WordInMap(String text){
        this.text = text;
    }

    public Map<String,Integer> wordMap(){
        this.text = deleteSymvol();
        Map<String,Integer> wordmap = new HashMap<>();
        String[] textWord = text.split(" ");
        for (String word:textWord) {
            if(wordmap.containsKey(word)){
                Integer number = wordmap.get(word);
                wordmap.put(word,++number);
            } else wordmap.put(word,1);
        }

        return wordmap;
    }


    public List<String> wordSortList(int top){
        this.text = deleteSymvol();
        List wordList = new ArrayList(wordMap().entrySet());
        Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        List wordList2 = new ArrayList();
        for (int i = 0; i < top; i++) {
            wordList2.add(wordList.get(i));
        }
        return wordList2;

    }


    public String  deleteSymvol(){
        this.text = text.replaceAll("(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)", " ").replaceAll(" +", " ");
        return text;
    }
}
