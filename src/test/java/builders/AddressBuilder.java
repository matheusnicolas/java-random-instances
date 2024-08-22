package builders;

import static utils.TestUtils.randomInstance;

import org.example.models.Address;

public class AddressBuilder {

  private final Address address;

  private AddressBuilder(final Address address) {
    this.address = address;
  }

  public AddressBuilder withStreet(String street) {
    address.setStreet(street);
    return this;
  }

  public AddressBuilder withCity(String city) {
    address.setCity(city);
    return this;
  }

  public AddressBuilder withZipCode(String zipCode) {
    address.setCity(zipCode);
    return this;
  }

  public AddressBuilder withCountry(String country) {
    address.setCountry(country);
    return this;
  }

  public static AddressBuilder builder() {
    return new AddressBuilder(randomInstance(Address.class));
  }

  public Address build() {
    return this.address;
  }
}
