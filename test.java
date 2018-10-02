package kz.edu.nu.cs.exercise;

public class test {
    public static void main(String [] args){
        Request request = new Request();
        String s = request.checkNameAndPassword("user1","password1");
        System.out.println(s);
    }
}
