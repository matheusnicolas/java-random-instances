package org.example;

import org.example.models.Address;
import org.example.models.Author;
import org.example.models.Book;
import org.example.models.Publisher;

import java.time.LocalDate;
import java.util.List;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.printf("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {
      // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon
      // src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
      // for you, but you can always add more by pressing <shortcut
      // actionId="ToggleLineBreakpoint"/>.
      System.out.println("i = " + i);
    }
    var author = new Author("Isaac", "Asimov", LocalDate.of(1920, 1, 2), null);
    var publisher = new Publisher("Editora XYZ", null, 1950, null);
    var book = new Book(
            "Eu, Robô",
            "978-0-553-29364-7",
            author,
            publisher,
            29.90,
            LocalDate.of(1950, 1, 1),
            List.of("Ficção Científica")
    );
    var address = new Address(
            "123 Rua Principal",
            "São Paulo",
            "SP",
            "01234-567",
            "Brasil"
    );

    System.out.println(author);
    System.out.println(publisher);
    System.out.println(book);
    System.out.println(address);
  }
}
