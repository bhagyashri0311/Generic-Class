package Shri;

public class GenericMain {
    public static void main(String args[]){
        Generic<Integer> g= new Generic<Integer>();
       g.add(1);
       g.add(2);
       Generic<String> g1=new Generic<String>();
       g1.add("shri");
       g1.add("bhagya");
        System.out.println(g1.get(1));
        System.out.println(g.get(0));
    }}
