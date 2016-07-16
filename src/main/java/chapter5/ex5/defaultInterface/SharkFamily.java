package chapter5.ex5.defaultInterface;

public interface SharkFamily extends HasFins {
    default int getNumberOfFins() {
        return 8;
    }
    double getLongestFinLength();
}
