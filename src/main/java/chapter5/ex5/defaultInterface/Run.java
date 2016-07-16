package chapter5.ex5.defaultInterface;

public interface Run {
    default int getSpeed(){
        return 20;
    }
}
