import enums.Sex;
import persons.Actor;
import persons.Choreographer;
import persons.Director;
import persons.MusicAuthor;
import shows.Ballet;
import shows.Opera;
import shows.Show;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        //Создать трёх актеров и двух режиссёров
        Actor actorOne = new Actor("Тест", "Тестовый", Sex.FEMALE, 175.5);
        Actor actorTwo = new Actor("Тестяра", "Тестововый", Sex.MALE, 200);
        Actor actorThree = new Actor("Тестик", "Тествойнов", Sex.FEMALE, 150.1);

        Director directorOne = new Director("ТестовРеж", "Фамильтест", Sex.FEMALE, 5);
        Director directorTwo = new Director("ТестовРежВторой", "Фамильтествтор", Sex.FEMALE, 1);


        //Также создайте одного автора музыки и одного хореографа
        MusicAuthor musicAuthor = new MusicAuthor("Тестун", "Тествойноватый", Sex.MALE);
        Choreographer choreographer = new Choreographer("Хортест", "Хореогрофатыйтестов", Sex.MALE);

        //Создать три спектакля: обычный, оперный и балет
        Show show = new Show("Простое тестовое шоу",
                directorOne,
                2,
                new ArrayList<>());

        Opera opera = new Opera(
                "Опера для тестового выступления",
                directorTwo,
                1.5,
                new ArrayList<>(),
                musicAuthor,
                "Текст для оперного либретто",
                100);

        Ballet ballet = new Ballet(
                "Балет тестовый чуть",
                directorOne,
                1.7,
                new ArrayList<>(),
                musicAuthor,
                "Длинный текст либретто балета",
                choreographer);

        //Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.
        show.addActor(actorOne);
        show.addActor(actorTwo);

        opera.addActor(actorTwo);
        opera.addActor(actorThree);

        ballet.addActor(actorOne);
        ballet.addActor(actorTwo);
        ballet.addActor(actorThree);

        //Для каждого спектакля выведите на экран список актёров
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        ballet.printDirector();

        //Замените актёра в одном из спектаклей на актёра из другого спектакля
        // (на вход подаётся объект нового актёра и фамилия того, которого он заменяет) и ещё раз выведите для него список актёров
        opera.replacementActor(actorOne, "Тестововый");
        opera.printListOfActors();

        //Попробуйте заменить в другом спектакле несуществующего актёра
        ballet.replacementActor(actorThree, "Несуществующий");

        //Для оперного и балетного спектакля выведите на экран текст либретто
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
