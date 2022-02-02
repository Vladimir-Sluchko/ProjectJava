package decorator;

import api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
     private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine){
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {

        text = deleteSimvol(text);
        return iSearchEngine.search(text, word);
    }

    public String deleteSimvol(String text){
        return text.replaceAll("(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)", " ").replaceAll(" +", " ");
    }
}
