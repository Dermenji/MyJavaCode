package com.company.OOPquestion2;

/**
 * Created by fns02 on 5/20/2016.
 */
public class Link {
    public long dData;
    public Link next; // next element in list

    public Link(long dd) {        // Конструктор
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }    // Вывод содержимого элемента

}
