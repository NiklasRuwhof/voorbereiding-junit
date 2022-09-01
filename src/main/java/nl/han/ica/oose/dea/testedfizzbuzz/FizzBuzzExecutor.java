package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int getal){
        String fizzBuzzString = "";
        if(getal%3==0){
            fizzBuzzString += "Fizz";
        }
        if(getal%5==0){
            fizzBuzzString += "Buzz";
        }
        if(getal%3 != 0 && getal%5 != 0){
            fizzBuzzString = String.valueOf(getal);
        }
        return fizzBuzzString;
    }
}
