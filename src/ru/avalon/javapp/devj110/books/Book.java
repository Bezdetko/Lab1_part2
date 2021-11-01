package ru.avalon.javapp.devj110.books;


import java.util.Arrays;

public class Book {
    private String name;
    private int year;
    private String[] authors;
    private PublishingHouse publishingHouse;  
            
             
    public Book(String name, int year, PublishingHouse publishingHouse) {
        setName(name);
        setYear(year);
        setPublishingHouse(publishingHouse);      
    }
    
    
      
    public Book(String name, int year, PublishingHouse publishingHouse, String ...authors) {
        this(name, year, publishingHouse);
        setAuthors(authors);    
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name==null || name.trim().equals(""))
            throw new IllegalArgumentException("Название книги не должно быть пустой ссылкой или незаполненной строкой");
        this.name = name;                
}

    public int getYear() {
        return year;
    }
        public void setYear(int year) {
        if(year <= 0)
            throw new IllegalArgumentException("Год издания должен быть строго больше нуля");
        this.year = year;
    }

    public int getAutorsNumber() {
        return authors.length;
    }

        

        public String[] getAuthors() {
        return authors;
    }
        public void setAuthors(String[] authors) {
            if (authors == null || name.trim().equals(""))
                throw new IllegalArgumentException("Массив авторов не должен содержать пустых ссылок или незаполненных строк");
            this.authors = authors;    
        }
        
        

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }
               

    
    public void setPublishingHouse(PublishingHouse publishingHouse) {
        if(publishingHouse == null)    
            throw new IllegalArgumentException("Издательство не должно быть пустой ссылкой");
        this.publishingHouse = publishingHouse;        
    }
    
    
    public String getAuthorByIndex(int index) {
    if ( authors==null || index <0 ||index > authors.length - 1)
        throw new IllegalArgumentException("Не верный индекс автора");
    return authors[index];   
    }
            

        
    public void print() {
        if (authors == null) {       
        System.out.println( "Название книги: " + name + "; Издательство: " + publishingHouse.getName()+ ", " + publishingHouse.getCity()+ "; Год издания" + year + "; ");
        }
        else if (getAutorsNumber() == 1) {
            System.out.println( "Название книги: " + name + "; Автор: "+ Arrays.toString(authors) +"; Издательство: " + publishingHouse.getName()+ ", " + publishingHouse.getCity()+ "; Год издания" + year + "; ");
        }
        else {System.out.println("Название книги: " + name + "; Авторы: "+ Arrays.toString(authors) +"; Издательство: " + publishingHouse.getName()+ ", " + publishingHouse.getCity()+ "; Год издания" + year + "; ");
        }
        System.out.println();
      
    }
    
    public static void printAll(Book[] books) {
        for(Book book: books)
            book.print();
    }    
}