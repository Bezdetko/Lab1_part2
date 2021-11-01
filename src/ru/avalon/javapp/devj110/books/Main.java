package ru.avalon.javapp.devj110.books;

public class Main {

    public static void main(String[] args) {

        
        PublishingHouse publishingHouse1 = new PublishingHouse("Проспект", "Москва");
        PublishingHouse publishingHouse2 = new PublishingHouse("Питер", "Санкт-Петербург");
        PublishingHouse publishingHouse3 = new PublishingHouse("БХВ", "Санкт-Петебург");
        PublishingHouse publishingHouse4 = new PublishingHouse("Диалектика", "Киев");


        Book[] books = new Book[]{
            new Book("Computer Science: основы программирования на Java ООП, алгоритмы и структуры данных", 2018, publishingHouse2, "Седжвик Роберт", "Уэйн Кевин"),
            new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", 2019, publishingHouse3, "Вигерс Карл"),
            new Book("Java. Полное руководство, 10-е издание", 2018, publishingHouse4, "Шилдт Герберт"),
            new Book("C/C++. Процедурное программирование", 2017, publishingHouse3, "Полубенцева М.И"),
            new Book("Конституция РФ, Проспект", 2020, publishingHouse1)
        };
        
        Book.printAll(books);
        
        publishingHouse3.setCity("Санкт-Петербург");
       
        System.out.println();
        Book.printAll(books); 
        //вывод изменился для всех книг, изданных издательством «БХВ», т.к. сначала для издательства был изменен город а затем был вызван printALL()
     
     
        //Вывод автора по идексу
        System.out.println("Для книги в масииве книг под идексом [0] автор книги под индексом [1]: " + books[0].getAuthorByIndex(1));      
    
    
    
    }
}
