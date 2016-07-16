package chapter5.ex5.defaultInterface;

public interface HasFins {
    default int getNumberOfFins() {
        return 4;
    }
    default double getLongestFinLength() {
        return 20.0;
    }
    default boolean doFinsHaveScales() {
        return true;
    }
}
