package javaFaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static  Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeAdress());
        System.out.println(generateFakeProgrammingLanguage());


    }

    public  static String generateFakeFirstName(){
        Faker faker = new Faker();
        return "Hello my name is " + faker.name().firstName();
    }
    public static String generateFakeLastName(){
        return "Surname is: " + faker.name().lastName();
    }
    public static String generateFakeAdress(){
        return "Email is: " + faker.internet().emailAddress();
    }
    public static String generateFakeProgrammingLanguage(){
        return faker.programmingLanguage().name();
    }


}
