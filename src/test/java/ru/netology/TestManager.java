package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestManager {

    @Test
    void testManager() {
        Manager man = new Manager();
        Film film1 = new Film(1, "http//1", "Stop", "Horror");
        Film film2 = new Film(2, "http//2", "Evil", "Horror");
        Film film3 = new Film(3, "http//3", "Hostel", "Horror");
        Film film4 = new Film(4, "http//4", "Trol", "Cartoon");
        Film film5 = new Film(5, "http//5", "Number 1", "Comedy");

        man.add(film1);
        man.add(film2);
        man.add(film3);
        man.add(film4);
        man.add(film5);


        Film[] actual = man.getAll();
        Film[] expected = new Film[]{film5, film4, film3, film2, film1};

        assertArrayEquals(expected, actual);


    }

    @Test
    void testManagerMax() {
        Manager man = new Manager(10);
        Film film1 = new Film(1, "http//1", "Stop", "Horror");
        Film film2 = new Film(2, "http//2", "Evil", "Horror");
        Film film3 = new Film(3, "http//3", "Hostel", "Horror");
        Film film4 = new Film(4, "http//4", "Trol", "Cartoon");
        Film film5 = new Film(5, "http//5", "Number 1", "Comedy");
        Film film6 = new Film(6, "http//6", "Number 2", "Comedy");
        Film film7 = new Film(7, "http//7", "Number 3", "Comedy");
        Film film8 = new Film(8, "http//8", "Number 4", "Comedy");
        Film film9 = new Film(9, "http//9", "Number 5", "Comedy");
        Film film10 = new Film(10, "http//10", "Number 6", "Comedy");
        Film film11 = new Film(11, "http//11", "Number 7", "Comedy");

        man.add(film1);
        man.add(film2);
        man.add(film3);
        man.add(film4);
        man.add(film5);
        man.add(film6);
        man.add(film7);
        man.add(film8);
        man.add(film9);
        man.add(film10);
        man.add(film11);


        Film[] actual = man.getAll();
        Film[] expected = new Film[]{film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(expected, actual);


    }

}
