package ru.netology.test;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;


public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));
    static final Random random = new Random();

    DataGenerator() {
    }


    public static String generateDate() {
        int shift = random.nextInt(365);

        String Date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
        return Date;
    }

    public static String generateCity() {
        List<String> cities = new ArrayList<>();
        cities.add("Майкоп");
        cities.add("Горно-Алтайск");
        cities.add("Уфа");
        cities.add("Улан-Удэ");
        cities.add("Махачкала");
        cities.add("Магас");
        cities.add("Нальчик");
        cities.add("Элиста");
        cities.add("Черкесск");
        cities.add("Петрозаводск");
        cities.add("Сыктывкар");
        cities.add("Симферополь");
        cities.add("Йошкар-Ола");
        cities.add("Саранск");
        cities.add("Якутск");
        cities.add("Владикавказ");
        cities.add("Казань");
        cities.add("Кызыл");
        cities.add("Ижевск");
        cities.add("Абакан");
        cities.add("Грозный");
        cities.add("Чебоксары");
        cities.add("Барнаул");
        cities.add("Чита");
        cities.add("Петропавловск-Камчатский");
        cities.add("Краснодар");
        cities.add("Красноярск");
        cities.add("Пермь");
        cities.add("Владивосток");
        cities.add("Ставрополь");
        cities.add("Хабаровск");
        cities.add("Благовещенск");
        cities.add("Архангельск");
        cities.add("Астрахань");
        cities.add("Белгород");
        cities.add("Брянск");
        cities.add("Владимир");
        cities.add("Волгоград");
        cities.add("Вологда");
        cities.add("Воронеж");
        cities.add("Иваново");
        cities.add("Иркутск");
        cities.add("Калининград");
        cities.add("Калуга");
        cities.add("Кемерово");
        cities.add("Киров");
        cities.add("Кострома");
        cities.add("Курган");
        cities.add("Курск");
        cities.add("Гатчина");
        cities.add("Липецк");
        cities.add("Магадан");
        cities.add("Красногорск");
        cities.add("Мурманск");
        cities.add("Нижний Новгород");
        cities.add("Великий Новгород");
        cities.add("Новосибирск");
        cities.add("Омск");
        cities.add("Оренбург");
        cities.add("Орёл");
        cities.add("Пенза");
        cities.add("Псков");
        cities.add("Ростов-на-Дону");
        cities.add("Рязань");
        cities.add("Самара");
        cities.add("Саратов");
        cities.add("Южно-Сахалинск");
        cities.add("Екатеринбург");
        cities.add("Смоленск");
        cities.add("Тамбов");
        cities.add("Тверь");
        cities.add("Томск");
        cities.add("Тула");
        cities.add("Тюмень");
        cities.add("Ульяновск");
        cities.add("Челябинск");
        cities.add("Ярославль");
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        cities.add("Севастополь");
        cities.add("Биробиджан");
        cities.add("Нарьян-Мар");
        cities.add("Ханты-Мансийск");
        cities.add("Анадырь");
        cities.add("Салехард");
        //String city = faker.address().cityName();
        String city = cities.get(random.nextInt(cities.size() - 1));
        return city;
    }

    public static String generateName() {
        List<String> names = new ArrayList<>();
        names.add("Крылова Мария");
        names.add("Васильев Григорий");
        names.add("Михайлова Таисия");
        names.add("Парфенов Николай");
        names.add("Гришина Елизавета");
        names.add("Павлова Таисия");
        names.add("Тарасова Виктория");
        names.add("Сычев Артём");
        names.add("Афанасьев Богдан");
        names.add("Егоров Никита");
        names.add("Сергеева Анастасия");
        names.add("Казакова Ксения");
        names.add("Кузнецов Константин");
        names.add("Абрамов Всеволод");
        names.add("Кузьмина Дарина");
        names.add("Соколов Максим");
        names.add("Виноградов Алексей");
        names.add("Ершова Мария");
        names.add("Козлова Софья");
        names.add("Попова Алиса");
        names.add("Семенов Тигран");
        names.add("Сидоров Артём");
        names.add("Маслова Екатерина");
        names.add("Никитин Сергей");
        names.add("Анисимова Мелания");
        names.add("Моисеев Вадим");
        names.add("Тарасова Екатерина");
        names.add("Савельева Полина");
        names.add("Меркулова Вероника");
        names.add("Баранова Алиса");
        names.add("Виноградов Илья");
        names.add("Александрова София");
        names.add("Никифорова Алёна");
        names.add("Алексеева Вероника");
        names.add("Гришина Кира");
        names.add("Александров Глеб");
        names.add("Сорокин Михаил");
        names.add("Афанасьев Андрей");
        names.add("Шубин Роман");
        names.add("Болдырева Анна");
        names.add("Мухина Анастасия");
        names.add("Егорова Дарья");
        names.add("Беляков Матвей");
        names.add("Воробьев Эмин");
        names.add("Жданов Арсений");
        names.add("Щербакова Ксения");
        names.add("Аксенова Виктория");
        names.add("Соколова Ева");
        names.add("Волкова Мирослава");
        names.add("Царев Роман");
        names.add("Захарова Анастасия");
        names.add("Гущина Милана");
        names.add("Черняева София");
        names.add("Пахомова Милана");
        names.add("Смирнов Дмитрий");
        names.add("Фролов Юрий");
        names.add("Гришин Михаил");
        names.add("Матвеев Роман");
        names.add("Анисимова Варвара");
        names.add("Михеева Ева");
        names.add("Власов Дмитрий");
        names.add("Тарасов Максим");
        names.add("Архипов Руслан");
        names.add("Зайцев Иван");
        names.add("Ефремов Илья");
        names.add("Матвеева Арина");
        names.add("Горохов Тимофей");
        names.add("Кошелев Кирилл");
        names.add("Осипов Александр");
        names.add("Фролова Евдокия");
        names.add("Александрова Виктория");
        names.add("Терентьев Роман");
        names.add("Карташова Полина");
        names.add("Морозов Михаил");
        names.add("Самсонова Пелагея");
        names.add("Носова Полина");
        names.add("Бирюкова Светлана");
        names.add("Орлов Никита");
        names.add("Гаврилова Нина");
        names.add("Осипов Егор");
        names.add("Семенов Виктор");
        names.add("Мещерякова Ева");
        names.add("Виноградов Арсений");
        names.add("Столяров Виктор");
        names.add("Васильев Марк");
        names.add("Сахаров Роман");
        names.add("Лаврентьева София");
        names.add("Смирнов Георгий");
        names.add("Морозов Александр");
        names.add("Сидорова Анна");
        names.add("Лазарев Лев");
        names.add("Козин Александр");
        names.add("Крюкова София");
        names.add("Борисова Варвара");
        names.add("Кузнецов Андрей");
        names.add("Терехов Матвей");
        names.add("Леонова Василиса");
        names.add("Жданов Мирон");
        names.add("Карпов Руслан");
        names.add("Горюнова Мария");
        String name = names.get(random.nextInt(names.size() - 1));
        //String name = faker.name().fullName();
        return name;
    }

    public static String generatePhone() {
        String phone = faker.numerify("+79#########");
        return phone;
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            int shift;
            UserInfo user = new UserInfo(
                    generateDate(), generateDate(), generateCity(), generateName(), generatePhone());
            return user;
        }

    }

    @Value
    public static class UserInfo {
        String firstDate;
        String secondDate;
        String city;
        String name;
        String phone;
    }
}



