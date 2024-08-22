package org.example.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book {
  private String title;
  private String isbn;
  private Author author;
  private Publisher publisher;
  private double price;
  private LocalDate publishedDate;
  private List<String> genres;

  public Book() {}

  public Book(
      String title,
      String isbn,
      Author author,
      Publisher publisher,
      double price,
      LocalDate publishedDate,
      List<String> genres) {
    this.title = title;
    this.isbn = isbn;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
    this.publishedDate = publishedDate;
    this.genres = genres;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public LocalDate getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(LocalDate publishedDate) {
    this.publishedDate = publishedDate;
  }

  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  @Override
  public String toString() {
    return """
            Book{title='%s', isbn='%s', author='%s %s', publisher='%s', price='%s', publisherDate='%s', genres='%s'
            """.formatted(title, isbn, author.getFirstName(), author.getLastName(), publisher.getName(), price, publishedDate, genres);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    if (Double.compare(price, book.price) != 0) return false;
    if (!Objects.equals(title, book.title)) return false;
    if (!Objects.equals(isbn, book.isbn)) return false;
    if (!Objects.equals(author, book.author)) return false;
    if (!Objects.equals(publisher, book.publisher)) return false;
    if (!Objects.equals(publishedDate, book.publishedDate)) return false;
    return Objects.equals(genres, book.genres);
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = title != null ? title.hashCode() : 0;
    result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
    result = 31 * result + (author != null ? author.hashCode() : 0);
    result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
    temp = Double.doubleToLongBits(price);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (publishedDate != null ? publishedDate.hashCode() : 0);
    result = 31 * result + (genres != null ? genres.hashCode() : 0);
    return result;
  }
}
