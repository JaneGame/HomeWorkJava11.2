
package ru.netology;

public class AfishaManager {
    private AfishaRepository repo;

    public AfishaManager(AfishaRepository repo) {
        this.repo = repo;
    }

    private int limit = 10;

    public void add(Film film) {
        repo.save(film);
    }


    public Film[] getAll() {
        Film[] films = repo.findAll();
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