package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже"
                    + System.lineSeparator() + "Пешеходы по лужам,"
                    + System.lineSeparator() + "А вода по асфальту рекой."
                    + System.lineSeparator() + "И неясно прохожим"
                    + System.lineSeparator() + "В этот день непогожий,"
                    + System.lineSeparator() + "Почему я веселый такой?"
                    + System.lineSeparator()
                    + System.lineSeparator() + "Я играю на гармошке"
                    + System.lineSeparator() + "У прохожих на виду."
                    + System.lineSeparator() + "К сожаленью, день рожденья"
                    + System.lineSeparator() + "Только раз в году."
                    + System.lineSeparator()
                    + System.lineSeparator() + "Прилетит вдруг волшебник"
                    + System.lineSeparator() + "В голубом вертолете"
                    + System.lineSeparator() + "И бесплатно покажет кино."
                    + System.lineSeparator() + "С днем рожденья поздравит"
                    + System.lineSeparator() + "И, наверно, оставит"
                    + System.lineSeparator() + "Мне в подарок пятьсот эскимо."
                    + System.lineSeparator()
                    + System.lineSeparator() + "Я играю на гармошке"
                    + System.lineSeparator() + "У прохожих на виду."
                    + System.lineSeparator() + "К сожаленью, день рожденья"
                    + System.lineSeparator() + "Только раз в году."
                    + System.lineSeparator()
                    + System.lineSeparator() + "Я играю на гармошке"
                    + System.lineSeparator() + "У прохожих на виду."
                    + System.lineSeparator() + "К сожаленью, день рожденья"
                    + System.lineSeparator() + "Только раз в году.");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят."
                    + System.lineSeparator() + "Одеяла и подушки ждут ребят."
                    + System.lineSeparator() + "Даже сказка спать ложится,"
                    + System.lineSeparator() + "Что бы ночью нам присниться."
                    + System.lineSeparator() + "Ты ей пожелай:"
                    + System.lineSeparator() + "Баю-бай."
                    + System.lineSeparator()
                    + System.lineSeparator() + "Обязательно по дому в этот час"
                    + System.lineSeparator() + "Тихо-тихо ходит дрема возле нас."
                    + System.lineSeparator() + "За окошком всё темнее,"
                    + System.lineSeparator() + "Утро ночи мудренее."
                    + System.lineSeparator() + "Глазки закрывай,"
                    + System.lineSeparator() + "Баю-бай."
                    + System.lineSeparator()
                    + System.lineSeparator() + "Баю-бай, должны все люди ночью спать."
                    + System.lineSeparator() + "Баю-баю, завтра будет день опять."
                    + System.lineSeparator() + "За день мы устали очень,"
                    + System.lineSeparator() + "Скажем всем: «Спокойной ночи!»"
                    + System.lineSeparator() + "Глазки закрывай,"
                    + System.lineSeparator() + "Баю-бай.");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();

        song.music(0);
        song.music(1);
        song.music(2);
    }
}
