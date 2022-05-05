package Assignments.Assignment7.Q1;

import java.util.ArrayList;

public class Main1
{
    public static void main(String[] args)
    {
        ArrayList<Rodent> rodents = new ArrayList<>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());

        for (Rodent rodent : rodents)
        {
            rodent.eat();
            rodent.hunt();
        }

    }
}
