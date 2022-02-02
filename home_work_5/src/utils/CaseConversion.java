package utils;

import api.ISearchEngine;

import java.util.Locale;

public class CaseConversion implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public CaseConversion(ISearchEngine iSearchEngine){
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text.toLowerCase(),word.toLowerCase());
    }
}
