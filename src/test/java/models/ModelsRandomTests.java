package models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import builders.AddressBuilder;
import builders.BookBuilder;
import builders.PublisherBuilder;
import org.example.models.Address;
import org.example.models.Book;
import org.example.models.Publisher;
import org.junit.jupiter.api.Test;

public class ModelsRandomTests {

  @Test
  public void shouldCreateModelCompleteWithTitleAndPriceAndPublisherNameNotRandomized() {

    String title = "Game of Thrones";
    double price = 25.00;
    String publisherName = "Bantam Spectra";

    Publisher publisher = PublisherBuilder.builder().withName(publisherName).build();

    Book book =
        BookBuilder.builder().withTitle(title).withPublisher(publisher).withPrice(price).build();

    assertEquals(book.getTitle(), title);
    assertEquals(book.getPrice(), price);
    assertEquals(publisher.getName(), publisherName);
    // ATTENTION: If you output the book object, you can see that the uninformed values are randomized
    // System.out.println(book);
  }

  @Test
  public void shouldCreateAddressRandomized() {
    Address address = AddressBuilder.builder().build();
    assertNotNull(address.getStreet());
    assertNotNull(address.getCity());
    assertNotNull(address.getState());
    assertNotNull(address.getZipcode());
    assertNotNull(address.getCountry());
  }

  @Test
  public void shouldAssertAllAddressFieldsWithoutRandomInstanceAsNull() {
    Address address = new Address();
    assertNull(address.getStreet());
    assertNull(address.getCity());
    assertNull(address.getState());
    assertNull(address.getZipcode());
    assertNull(address.getCountry());
  }
}
