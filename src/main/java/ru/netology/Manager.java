package ru.netology;

public class Manager {
    private Film[] films = new Film[0];
    private int limit = 10;

    public Manager(int limit) {
        this.limit = limit;
    }

    public Manager() {
    }

    public void add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public Film[] getAll() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];

        for (int i = 0; i < resultLength; i++) {

            int index = films.length - i - 1;
            result[i] = films[index];


        }
        return result;
    }
}




