package org.example.models;

import java.util.List;
import java.util.Objects;

public class Publisher {
  private String name;
  private Address address;
  private int foundedYear;
  private List<Book> publishedBooks;

  public Publisher() {}

  public Publisher(String name, Address address, int foundedYear, List<Book> publishedBooks) {
    this.name = name;
    this.address = address;
    this.foundedYear = foundedYear;
    this.publishedBooks = publishedBooks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getFoundedYear() {
    return foundedYear;
  }

  public void setFoundedYear(int foundedYear) {
    this.foundedYear = foundedYear;
  }

  public List<Book> getPublishedBooks() {
    return publishedBooks;
  }

  public void setPublishedBooks(List<Book> publishedBooks) {
    this.publishedBooks = publishedBooks;
  }

  @Override
  public String toString() {
    return """
            Publisher{name='%s', address='%s', foundedYear='%s', publishedBooks='%s'} 
            """.formatted(name, address, foundedYear, publishedBooks);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Publisher publisher = (Publisher) o;

    if (foundedYear != publisher.foundedYear) return false;
    if (!Objects.equals(name, publisher.name)) return false;
    if (!Objects.equals(address, publisher.address)) return false;
    return Objects.equals(publishedBooks, publisher.publishedBooks);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + foundedYear;
    result = 31 * result + (publishedBooks != null ? publishedBooks.hashCode() : 0);
    return result;
  }
}
