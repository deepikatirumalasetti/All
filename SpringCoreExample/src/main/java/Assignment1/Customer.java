package Assignment1;

public class Customer {
  private int id;

  private String name;

  private int contact;

  /**
   * @return id
   */
  public int getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(int id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return contact
   */
  public int getContact() {

    return this.contact;
  }

  /**
   * @param contact new value of {@link #getcontact}.
   */
  public void setContact(int contact) {

    this.contact = contact;
  }

  /**
   * @return address
   */
  public String getAddress() {

    return this.address;
  }

  /**
   * @param address new value of {@link #getaddress}.
   */
  public void setAddress(String address) {

    this.address = address;
  }

  private String address;

  // setters and getters
  void displayinfo() {

    System.out.println(this.id + "" + this.name);
    System.out.println(this.contact + "" + this.address);
  }

}
