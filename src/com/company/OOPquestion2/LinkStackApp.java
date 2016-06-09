package com.company.OOPquestion2;

/**
 * Created by fns02 on 5/20/2016.
 */
public class LinkStackApp {

    public static void main(String[] args) {
        MyStack theStack = new MyStack(); // Создание стека
        theStack.push(20);                    // Вставка элементов
        theStack.push(40);
        theStack.displayStack();              // Вывод содержимого стека
        theStack.push(60);                    // Вставка элементов
        theStack.push(80);
        theStack.displayStack();              // Вывод содержимого стека
        theStack.pop();                       // Извлечение элементов
        theStack.pop();
        theStack.displayStack();              // Вывод содержимого стека
    }
}
