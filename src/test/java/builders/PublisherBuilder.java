package builders;

import static utils.TestUtils.randomInstance;

import java.util.List;
import org.example.models.Address;
import org.example.models.Book;
import org.example.models.Publisher;

public class PublisherBuilder {
  private final Publisher publisher;

  private PublisherBuilder(final Publisher publisher) {
    this.publisher = publisher;
  }

  public PublisherBuilder withName(String name) {
    publisher.setName(name);
    return this;
  }

  public PublisherBuilder withAddress(Address address) {
    publisher.setAddress(address);
    return this;
  }

  public PublisherBuilder withFoundedYear(int foundedYear) {
    publisher.setFoundedYear(foundedYear);
    return this;
  }

  public PublisherBuilder withPublishedBooks(List<Book> publishedBooks) {
    publisher.setPublishedBooks(publishedBooks);
    return this;
  }

  public Publisher build() {
    return this.publisher;
  }

  public static PublisherBuilder builder() {
    return new PublisherBuilder(randomInstance(Publisher.class));
  }
}
