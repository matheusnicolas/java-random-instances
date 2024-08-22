package builders;

import static utils.TestUtils.randomInstance;

import java.time.LocalDate;
import org.example.models.Author;
import org.example.models.Book;
import org.example.models.Publisher;

public class BookBuilder {

  private final Book book;

  private BookBuilder(final Book book) {
    this.book = book;
  }

  public BookBuilder withTitle(String title) {
    book.setTitle(title);
    return this;
  }

  public BookBuilder withIsbn(String isbn) {
    book.setIsbn(isbn);
    return this;
  }

  public BookBuilder withAuthor(Author author) {
    book.setAuthor(author);
    return this;
  }

  public BookBuilder withPublisher(Publisher publisher) {
    book.setPublisher(publisher);
    return this;
  }

  public BookBuilder withPrice(double price) {
    book.setPrice(price);
    return this;
  }

  public BookBuilder withPublishedDate(LocalDate publishedDate) {
    book.setPublishedDate(publishedDate);
    return this;
  }

  /**
   * Creates a new instance of {@link BookBuilder}, initializing it with a randomly generated
   * {@link Book} object. The {@code randomInstance} method is used to generate this initial
   * random {@link Book} object, providing default values that can be further customized
   * using the builder pattern.
   *
   * <p>This method is particularly useful in testing scenarios where you need to quickly create
   * and customize {@link Book} objects with randomized data. The generated builder allows
   * for easy manipulation of the {@link Book} fields before building the final object.
   *
   * @return a new instance of {@link BookBuilder} initialized with a randomly generated {@link Book} object
   */
  public static BookBuilder builder() {
    return new BookBuilder(randomInstance(Book.class));
  }

  public Book build() {
    return this.book;
  }
}
