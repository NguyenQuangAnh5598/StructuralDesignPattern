package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    private static final RandomListFacade RANDOM_LIST_FACADE = new RandomListFacade();
   private ListFilter listFilter;
   private ListPrinter listPrinter;
   private RandomList randomList;
   private RandomNumber randomNumber;

    private RandomListFacade() {
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
        this.randomList = new RandomList();
        this.randomNumber = new RandomNumber();
    }
    public static RandomListFacade getInstance() {
        return RANDOM_LIST_FACADE;
    }

    public void printRandomEvenList() {
      List<Integer> number = this.randomList.generateList(20,1,100);
      List<Integer> number1 =  this.listFilter.filterOdd(number);
      this.listPrinter.printList(number1);
   }
}
