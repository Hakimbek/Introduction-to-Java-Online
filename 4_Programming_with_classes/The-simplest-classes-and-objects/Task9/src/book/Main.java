package book;

public class Main {
    public static void main(String[] args) {
        BookAggregation bookAggregation = new BookAggregation(new Book[] {
                new Book(1, "Путешествия Лемуэля Гулливера", new String[] {"Д.Свифт"}, "Асахий", 1984, 342, 10550, "b"),
                new Book(2, "Три мушкетера", new String[] {"А.Дюма"}, "Москва", 1985, 720, 15000, "a"),
                new Book(3, "Аэлита", new String[] {"А.Н.Толстой"}, "Ташкент", 1995, 390, 17000, "c"),
                new Book(4, "Квентин Дорвард", new String[] {"Вадьтер Скотт"}, "Москва", 1983, 502, 18000, "c"),
                new Book(5, "Записки о Шерлоке Холмсе", new String[] {"А.Конан Дойл"}, "Россия", 1981, 574, 18999, "a")
        });

        for (Book book : bookAggregation.getBooks()) {
            System.out.println(book);
        }

        bookAggregation.getByPublisher("Москва");
        bookAggregation.getByAuthor("А.Дюма");
        bookAggregation.getAfterTheYear(1990);
    }
}
