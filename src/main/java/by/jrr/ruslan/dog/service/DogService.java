package by.jrr.ruslan.dog.service;


public class DogService {
public static final String DOG_VOICE="Hau-hau";
    public static final String DOG_SLEEP="Dog sleep";
    public static final String DOG_EAT="Dog eat";

    public String voice() {
            return DOG_VOICE;
        }

    public String eat() {
      return DOG_EAT;
    }


    public String sleep() {
        return DOG_SLEEP;
    }

}