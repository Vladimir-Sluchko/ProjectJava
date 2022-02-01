package utils;

import api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private char[] removeCharacters = ".?,;:'\")\n\t( ".toCharArray();

    @Override
    public long search(String text, String word) {
        long count = 0;
        int fromIndex = -1;
        do{
            fromIndex = text.indexOf(word, fromIndex);
            if (fromIndex >= 0 && cheks(text, word, fromIndex)){
                ++count;
            }
            ++fromIndex;

        } while (fromIndex > 0);
        return count;
    }

    private boolean cheks(String text, String word, int fromIndex) {
        int worldLength = word.length();
        boolean chekBefore = false;
        boolean chekAfter = false;
        /*
        * проверяем является ли это слово первым в строке
        */

        if (fromIndex == 0){
            chekBefore = true;
        }
        /*
         * проверяем является ли это слово последним в строке
         */
        if (fromIndex == text.length() - worldLength){
            chekAfter = true;
        }
        for (char simv:this.removeCharacters){
            if (!chekBefore && (text.charAt(fromIndex - 1) == simv)){
                chekBefore = true;
            }
            if (!chekAfter && (text.charAt(fromIndex + worldLength) == simv)){
                chekAfter = true;
            }
            if(chekAfter && chekBefore){
                break;
            }
        }
        return chekAfter && chekBefore;
    }
}
