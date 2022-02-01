package Lesson14.lambda;

@FunctionalInterface
public interface Icall {
    boolean call(String number);
    default boolean callToMather(){
        return call("+37565456545");
    }
}
