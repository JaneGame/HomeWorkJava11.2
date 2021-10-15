package ru.netology;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class TestManager {

    private AfishaRepository repo = Mockito.mock(AfishaRepository.class);
    AfishaManager man = new AfishaManager(repo);
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

    @Test
    void testManager() {
        Film[] returned = {film1, film2, film3, film4, film5};
        doReturn(returned).when(repo).findAll();


        Film[] actual = man.getAll();
        Film[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(expected, actual);

        verify(repo).findAll();

    }

    @Test
    void testManagerMax() {
        Film[] returned = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        doReturn(returned).when(repo).findAll();



        Film[] actual = man.getAll();
        Film[] expected = new Film[]{film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(expected, actual);


    }

}
