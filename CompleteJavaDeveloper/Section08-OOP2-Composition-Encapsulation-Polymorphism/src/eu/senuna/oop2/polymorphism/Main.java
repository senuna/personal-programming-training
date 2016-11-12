package eu.senuna.oop2.polymorphism;

/**
 * Created by senuna on 12.11.16.
 */

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
       return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet Eart";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }

    //No plot method
}


//method to randomly choose movie

public class Main {
    public static void main(String[] args) {
        for (int i =1; i <11; i++){
            Movie movie =randomMovie();
            System.out.println(
                    "Movie #" + i +
                    " : " + movie.getName()+ "\n" +
                    "Plot : " + movie.plot() + "\n");
        }

        //look especially for nr 5!
        // it takest plo() from 
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
