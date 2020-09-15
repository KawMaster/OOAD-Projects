package com.company;

import java.io.FileNotFoundException;

public abstract class Feline extends Animal {
    Feline(String _sex, AnimalNames names) throws FileNotFoundException {
        super(_sex, names);
    }
}


class Cat extends Feline {
    Cat(String _sex, AnimalNames names) throws FileNotFoundException {
        super(_sex, names);
        super.SetSpecies("Cat");
        super.SetName("C", names);
    }
}


class Lion extends Feline {
    Lion(String _sex, AnimalNames names) throws FileNotFoundException {
        super(_sex, names);
        super.SetSpecies("Lion");
        super.SetName("L", names);
    }
}

class Tiger extends Feline {
    Tiger(String _sex, AnimalNames names) throws FileNotFoundException {
        super(_sex, names);
        super.SetSpecies("Tiger");
        super.SetName("T", names);
    }
}