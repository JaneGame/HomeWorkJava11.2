package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class TestRepository {
    private AfishaRepository repo = new AfishaRepository();
    Film film1 = new Film(1, "http//1", "Stop", "Horror");
    Film film2 = new Film(2, "http//2", "Evil", "Horror");
    Film film3 = new Film(3, "http//3", "Hostel", "Horror");
    Film film4 = new Film(4, "http//4", "Trol", "Cartoon");
    Film film5 = new Film(5, "http//5", "Number 1", "Comedy");


    @BeforeEach
    public void setUp() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
    }

    @Test
    void removeByIdTest() {

        repo.removeById(1);

        Film[] actual = repo.findAll();
        Film[] expected = {film2, film3, film4, film5};

        assertArrayEquals(expected, actual);

    }

    @Test
    void findByIdTest() {
        Film actual = repo.findById(1);
        Film expected = film1;

        assertEquals(expected, actual);
    }

    @Test
    void findByNoIdTest() {
        Film actual = repo.findById(6);
        Film expected = null;

        assertEquals(expected, actual);
    }

    @Test
    void removeAllTest() {
        Film[] actual = repo.removeAll();
        Film[] expected = {};

        assertArrayEquals(expected, actual);
    }
}
