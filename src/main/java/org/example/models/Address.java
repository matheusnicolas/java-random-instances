package org.example.models;

import java.util.Objects;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zipcode;
  private String country;

  public Address() {}

  public Address(String street, String city, String state, String zipcode, String country) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.country = country;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return """
            Address{street='%s', city='%s', state='%s', zipcode='%s', country='%s'}
            """.formatted(street, city, state, zipcode, country);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Address address = (Address) o;

    if (!Objects.equals(street, address.street)) return false;
    if (!Objects.equals(city, address.city)) return false;
    if (!Objects.equals(state, address.state)) return false;
    if (!Objects.equals(zipcode, address.zipcode)) return false;
    return Objects.equals(country, address.country);
  }

  @Override
  public int hashCode() {
    int result = street != null ? street.hashCode() : 0;
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
    result = 31 * result + (country != null ? country.hashCode() : 0);
    return result;
  }
}
