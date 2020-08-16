package Shri;

public class Generic<T> {
    private T[] iteams= (T[])new Object[10];
    private int count;
    public void add(T iteam){
        iteams[count++]=iteam;
    }
    public T get(int Index){
        return iteams[Index];
    }
}
