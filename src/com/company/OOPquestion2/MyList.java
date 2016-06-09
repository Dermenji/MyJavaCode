package com.company.OOPquestion2;

/**
 * Created by fns02 on 5/20/2016.
 */
public class MyList {
    private Link first;

    public MyList() {
        first = null;
    }

    // Список пока не содержит элементов // ------------------------------------------------------------
    public boolean isEmpty()       // true, если список пуст
    {
        return (first == null);
    } // ------------------------------------------------------------

    public void insertFirst(long dd) // Вставка элемента в начало списка
    {                           // Создание нового элемента
        Link newLink = new Link(dd);
        newLink.next = first;       // newLink --> старое значение first
        first = newLink;            // first --> newLink
    } // ------------------------------------------------------------

    public long deleteFirst()  // Удаление первого элемента
    {                       // (предполагается, что список не пуст)
        Link temp = first;      // Сохранение ссылки
        first = first.next;     // Удаление: first-->ссылка на второй элемент
        return temp.dData;      // Метод возвращает данные
    }                       // удаленного элемента // ------------------------------------------------------------

    public void displayList() {
        Link current = first;       // От начала списка
        while (current != null)      // Перемещение до конца списка
        {
            current.displayLink();   // Вывод данных
            current = current.next;  // Переход к следующему элементу
        }
        System.out.println("");
    }
}
