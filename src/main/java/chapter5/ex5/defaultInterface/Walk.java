package chapter5.ex5.defaultInterface;

public interface Walk {
    default int getSpeed(){
        return 10;
    }
}
