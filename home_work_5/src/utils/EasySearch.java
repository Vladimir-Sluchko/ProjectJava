package utils;

import api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private char[] spliterCharter = ".?,;!:'\")\n\t( ".toCharArray();

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
        if(chekAfter && chekBefore){
            return true;
        }
        /*char charakterBefore = text.charAt(fromIndex - 1);
        char charakterAfter = text.charAt(fromIndex + worldLength);*/
        for (char simv:this.spliterCharter){
            if(chekAfter && chekBefore){
                break;
            }
            if (!chekBefore && (text.charAt(fromIndex - 1) == simv)){
                chekBefore = true;
            }
            if (!chekAfter && (text.charAt(fromIndex + worldLength) == simv)){
                chekAfter = true;
            }
        }
        return chekAfter && chekBefore;
    }
}
