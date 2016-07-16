package chapter5.ex4;

public interface WalksOnTwoLegs {
    default int getTemperature(){
        return 10;
    }

    void foo();
}
