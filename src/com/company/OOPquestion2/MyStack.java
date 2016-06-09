package com.company.OOPquestion2;

/**
 * Created by fns02 on 5/20/2016.
 */
public class MyStack {
    private MyList theList; //-------------------------------------------------------------

    public MyStack()             // Конструктор
    {
        theList = new MyList();
    } //-------------------------------------------------------------

    public void push(long j)     // Размещение элемента на вершине стека
    {
        theList.insertFirst(j);
    }

    public long pop()            // Извлечение элемента с вершины стека
    {
        return theList.deleteFirst();
    } //-------------------------------------------------------------

    public boolean isEmpty()       // true, если стек пуст
    {
        return (theList.isEmpty());
    } //-------------------------------------------------------------

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
