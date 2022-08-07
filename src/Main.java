import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //## Минимальный **уровень**
        //1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
        // Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        //2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        //3. Написать конструкторы для обоих классов, заполняющие все поля.
        //4. Создать геттеры для всех полей автора и всех полей книги.
        //5. Создать сеттер для поля «Год публикации» у книги.
        //6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
        // Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        //    Метод main не должен находиться в классах Book и Author.
        //    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        //7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

        //Средний уровень
        //Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
        //Написать статические методы для работы с массивом в классе, где располагается метод main:
        //Добавить книгу (найти свободную ячейку массива и положить туда книгу).
        // Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
        //         b.   Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”
        //Критерии оценки
        //В методе main создан массив и заполнен созданными ранее объектами.
        //Методы объявлены корректно.
        //Методы корректно справляются со своей задачей.
        Author ivanIvanov = new Author("Иван", "Иванов");
        Author petrPetrov = new Author("Пётр", "Петров");
        Author sidrSidorov = new Author("Сидр", "Сидоров");
        Book firstBook = new Book("Первая книга", ivanIvanov, 2021);
        Book secondBook = new Book("Вторая книга", petrPetrov, 1998);
        firstBook.setPublishYear(2005);
        Book[] booksLib = {firstBook, secondBook};

        // средний уровень
        Book thirdBook = new Book("Третья книга", sidrSidorov, 1980);
        printLibrary(addBookToBooksLib(booksLib, thirdBook));

    }

    public static Book[] addBookToBooksLib(Book[] libs, Book book) {
        Book[] bookLibResized = Arrays.copyOf(libs, libs.length + 1);
        bookLibResized[bookLibResized.length - 1] = book;
        return bookLibResized;
    }

    public static void printLibrary(Book[] library) {
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getAuthor().getAuthorSurname() + " " + library[i].getAuthor().getAuthorName() + ": " + library[i].getBookName() + ": " + library[i].getPublishYear());
        }

    }

}