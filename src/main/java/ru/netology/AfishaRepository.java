package ru.netology;

public class AfishaRepository {
//    findAll - возвращает массив всех хранящихся в массиве объектов
//    save - добавляет объект в массив
//    findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
//    removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
//    removeAll* - полностью вычищает репозиторий

    private Film[] films = new Film[0];

    public Film[] findAll() {
        return films;
    }

    public void save(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film findById(int id) {
        for (Film film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public Film[] removeAll() {
        films = new Film[0];
        return films;
    }

}
