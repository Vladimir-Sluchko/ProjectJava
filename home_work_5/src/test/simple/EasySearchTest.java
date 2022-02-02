package test.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.EasySearch;

public class EasySearchTest {
    private final EasySearch es = new EasySearch();

    @Test
    public void getEsasySearch(){
        Assertions.assertEquals(1,es.search("Привет, как дела!","Привет"));
    }

    @Test
    public void getEsasySearch1(){
        Assertions.assertEquals(2,es.search("Привет Привет!","Привет"));
    }
}
