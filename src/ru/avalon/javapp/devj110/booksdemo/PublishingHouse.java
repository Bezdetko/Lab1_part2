
package ru.avalon.javapp.devj110.booksdemo;


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
          if(name == null)
            throw new IllegalArgumentException("Название издетельста не должно быть пустой ссылкой");
          this.name = name;    
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null)
            throw new IllegalArgumentException("Город издетельста не должен быть пустой ссылкой");
        this.city = city;
    }

}