package it.develhope.ifStatement;

public class Ok {

    public String myName = "Giuseppe";

    public void evenOrOdd(){
        if(myName.length()%2==0){
            System.out.println("The number of letters in your name is even");
        }else{
            System.out.println("The number of letters in your name is odd");
        }
    }
}
