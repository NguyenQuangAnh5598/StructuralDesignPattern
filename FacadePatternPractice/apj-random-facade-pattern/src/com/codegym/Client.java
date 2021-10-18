package com.codegym;

public class Client {
    public void printRandomEvenList(){
        RandomListFacade randomListFacade = RandomListFacade.getInstance();
        randomListFacade.printRandomEvenList();
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.printRandomEvenList();
    }
}
