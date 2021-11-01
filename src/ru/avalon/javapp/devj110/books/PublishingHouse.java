package ru.avalon.javapp.devj110.books;

public class PublishingHouse {
    private String name;
    private String city;
        
    
    public PublishingHouse(String name, String city) {
    setName(name);
    setCity(city);
  }

   public String getName() {
        return name;
    }

    public void setName(String name) {
          if(name == null || name.trim().equals(""))
            throw new IllegalArgumentException("Название издетельста не должно быть пустой ссылкой или незаполненной строкой");
          this.name = name;    
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null || city.trim().equals(""))
            throw new IllegalArgumentException("Город издетельста не должен быть пустой ссылкой или незаполненной строкой");
        this.city = city;
    }
}