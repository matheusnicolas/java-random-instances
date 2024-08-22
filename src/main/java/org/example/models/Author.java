package org.example.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Author {
  private String firstName;
  private String lastName;
  private LocalDate birthdate;
  private List<Book> books;

  public Author() {}

  public Author(String firstName, String lastName, LocalDate birthdate, List<Book> books) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
    this.books = books;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  @Override
  public String toString() {
    return """
            Author{firstName='%s', lastName='%s', birthdate='%s', books='%s'}
            """.formatted(firstName, lastName, birthdate, books);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Author author = (Author) o;

    if (!Objects.equals(firstName, author.firstName)) return false;
    if (!Objects.equals(lastName, author.lastName)) return false;
    if (!Objects.equals(birthdate, author.birthdate)) return false;
    return Objects.equals(books, author.books);
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
    result = 31 * result + (books != null ? books.hashCode() : 0);
    return result;
  }
}
