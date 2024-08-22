package builders;

import static utils.TestUtils.randomInstance;

import java.time.LocalDate;
import java.util.List;
import org.example.models.Author;
import org.example.models.Book;

public class AuthorBuilder {
  private final Author author;

  private AuthorBuilder(final Author author) {
    this.author = author;
  }

  public AuthorBuilder withFirstName(String firstName) {
    author.setFirstName(firstName);
    return this;
  }

  public AuthorBuilder withLastName(String lastName) {
    author.setLastName(lastName);
    return this;
  }

  public AuthorBuilder withBirthDate(LocalDate birthDate) {
    author.setBirthdate(birthDate);
    return this;
  }

  public AuthorBuilder withBooks(List<Book> books) {
    author.setBooks(books);
    return this;
  }

  public static AuthorBuilder builder() {
    return new AuthorBuilder(randomInstance(Author.class));
  }

  public Author build() {
    return this.author;
  }
}
