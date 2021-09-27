package ru.netology;

import ru.netology.Films;

public class Manager {
    private Films[] films = new Films[0];

    public void add(Films film) {
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    private int limit = 10;

    public Films[] getAll() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        Films[] result = new Films[resultLength];

        for (int i = 0; i < resultLength; i++) {

            int index = films.length - i - 1;
            result[i] = films[index];


        }
        return result;
    }
}




