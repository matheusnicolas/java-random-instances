# Randomized Test Data Generation

This repository provides a utility implementation that simplifies the process of generating randomized instances of objects for testing purposes. The primary focus is on leveraging the [EasyRandom](https://github.com/j-easy/easy-random) library to create randomized test data, enabling more robust and varied unit tests.

## Overview

In unit testing, especially when working with complex objects, it's often necessary to create multiple instances with different data to thoroughly test your code. Manually creating these instances can be time-consuming and error-prone. This implementation provides a streamlined approach by using the EasyRandom library to automatically generate randomized instances of objects.

### Key Features

- **EasyRandom Integration**: The implementation uses EasyRandom to generate random values for object attributes.
- **Syntactic Sugar for Builders**: A `TestUtils` class provides a `randomInstance` method that can be used within builder patterns to initialize objects with randomized data.
- **Configurable Randomization**: The EasyRandom parameters are pre-configured to scan the classpath for concrete types and set collection sizes, ensuring that generated objects are practical and realistic for testing.

## Usage

### Generating Random Instances

The core functionality is provided by the `TestUtils` class, which includes the `randomInstance` method. This method generates a random instance of any class passed to it.

#### Example

```java
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
```
#### You can use with a class as well, but with the builders you can approach a more flexible approach

```java
import static com.example.TestUtils.randomInstance;

public class ExampleTest {

    @Test
    void testWithRandomBook() {
        Book randomBook = randomInstance(Book.class);
        assertNotNull(randomBook);
        // Further assertions and tests
    }
}
```

### Java Version Used

This project uses Java 17. Please ensure your environment is set up with Java 17 to avoid any compatibility issues.