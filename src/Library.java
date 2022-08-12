import java.util.Arrays;
import java.util.Objects;

public class Library {
    ////Сложный уровень
    //        // Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
    //        //Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют. Работать с массивом можно только через внутренние нестатические методы класса Library.
    //        //2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле массива тем размером, что пришел параметром.
    //        //3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
    //        //4. Создать новые нестатические методы в классе Library:
    //        //Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
    //        //       Формат: “The Stand by Stephen King was published in 1978”
    //        //Изменить год публикации книги по ее названию.
    //        //       В метод подаются два параметра, а именно: название и новый год публикации. Нужно найти книгу и изменить ее год публикации.
    //        //Критерии оценки
    //        //Класс Library создан корректно.
    //        //Массив корректно перенесен в виде поля в класс Library.
    //        //Конструктор класса Library написан корректно.
    //        //Корректно перенесены методы, модификатор static удален.
    //        //Объявлены новые методы.
    //        //Методы корректно справляются со своей задачей.
    private Book[] library;

    public Library(Book[] bookLibs, int libSize) {
        if (bookLibs.length>libSize) {
            throw new RuntimeException("Новый размер библиотеки меньше, чем есть книг");
        }
        library = Arrays.copyOf(bookLibs, libSize);
    }

    public Book[] addBookToBooksLib(Book book) {
        for (int i = 0; ; i++) {
            if (Objects.isNull(library[i])) {
                library[i] = book;
                break;
            }
        }
        return library;
    }

    public void printLibrary(Book[] library) {
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }

    public void printBookByName(String bookName) {
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            if (book.getBookName().equals(bookName)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Книга " + bookName + " не найдена");
    }

    public void changePublishYear(String bookName, int newPublishYear) {
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            if (book.getBookName().equals(bookName)) {
                book.setPublishYear(newPublishYear);
                return;
            }
        }
        System.out.println("Книга " + bookName + " не найдена");
    }
}
