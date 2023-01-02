package Assignment1;

public class Address {
  String City;

  String State;

  String Street;

  String zip;

  String Country;

  /**
   * @return city
   */
  public String getCity() {

    return this.City;
  }

  /**
   * @param city new value of {@link #getcity}.
   */
  public void setCity(String city) {

    this.City = city;
  }

  /**
   * @return state
   */
  public String getState() {

    return this.State;
  }

  /**
   * @param state new value of {@link #getstate}.
   */
  public void setState(String state) {

    this.State = state;
  }

  /**
   * @return street
   */
  public String getStreet() {

    return this.Street;
  }

  /**
   * @param street new value of {@link #getstreet}.
   */
  public void setStreet(String street) {

    this.Street = street;
  }

  /**
   * @return zip
   */
  public String getZip() {

    return this.zip;
  }

  /**
   * @param zip new value of {@link #getzip}.
   */
  public void setZip(String zip) {

    this.zip = zip;
  }

  /**
   * @return country
   */
  public String getCountry() {

    return this.Country;
  }

  /**
   * @param country new value of {@link #getcountry}.
   */
  public void setCountry(String country) {

    this.Country = country;
  }

  public void addressdetails() {

    System.out.println("city" + this.City + "state" + this.State + "street" + this.Street + "zip" + this.zip + "country"
        + this.Country);
  }

}