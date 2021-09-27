package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestManager {

    @Test
    void testManager() {
        Manager man = new Manager();
        Films film1 = new Films(1, "http//1", "Stop", "Horror");
        Films film2 = new Films(2, "http//2", "Evil", "Horror");
        Films film3 = new Films(3, "http//3", "Hostel", "Horror");
        Films film4 = new Films(4, "http//4", "Trol", "Cartoon");
        Films film5 = new Films(5, "http//5", "Number 1", "Comedy");

        man.add(film1);
        man.add(film2);
        man.add(film3);
        man.add(film4);
        man.add(film5);


        Films[] actual = man.getAll();
        Films[] expected = new Films[]{film5, film4, film3, film2, film1};

        assertArrayEquals(expected, actual);


    }

    @Test
    void testManagerMax() {
        Manager man = new Manager();
        Films film1 = new Films(1, "http//1", "Stop", "Horror");
        Films film2 = new Films(2, "http//2", "Evil", "Horror");
        Films film3 = new Films(3, "http//3", "Hostel", "Horror");
        Films film4 = new Films(4, "http//4", "Trol", "Cartoon");
        Films film5 = new Films(5, "http//5", "Number 1", "Comedy");
        Films film6 = new Films(6, "http//6", "Number 2", "Comedy");
        Films film7 = new Films(7, "http//7", "Number 3", "Comedy");
        Films film8 = new Films(8, "http//8", "Number 4", "Comedy");
        Films film9 = new Films(9, "http//9", "Number 5", "Comedy");
        Films film10 = new Films(10, "http//10", "Number 6", "Comedy");
        Films film11 = new Films(11, "http//11", "Number 7", "Comedy");

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


        Films[] actual = man.getAll();
        Films[] expected = new Films[]{film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(expected, actual);


    }

}
