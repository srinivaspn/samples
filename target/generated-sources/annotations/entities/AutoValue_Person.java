package entities;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Person extends Person {

  private final String firstName;

  private final String lastName;

  private final Integer age;

  private AutoValue_Person(
      String firstName,
      String lastName,
      Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public String firstName() {
    return firstName;
  }

  @Override
  public String lastName() {
    return lastName;
  }

  @Override
  public Integer age() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{"
         + "firstName=" + firstName + ", "
         + "lastName=" + lastName + ", "
         + "age=" + age
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Person) {
      Person that = (Person) o;
      return this.firstName.equals(that.firstName())
          && this.lastName.equals(that.lastName())
          && this.age.equals(that.age());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= firstName.hashCode();
    h$ *= 1000003;
    h$ ^= lastName.hashCode();
    h$ *= 1000003;
    h$ ^= age.hashCode();
    return h$;
  }

  @Override
  public Person.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Person.Builder {
    private String firstName;
    private String lastName;
    private Integer age;
    Builder() {
    }
    private Builder(Person source) {
      this.firstName = source.firstName();
      this.lastName = source.lastName();
      this.age = source.age();
    }
    @Override
    public Person.Builder setFirstName(String firstName) {
      if (firstName == null) {
        throw new NullPointerException("Null firstName");
      }
      this.firstName = firstName;
      return this;
    }
    @Override
    public Person.Builder setLastName(String lastName) {
      if (lastName == null) {
        throw new NullPointerException("Null lastName");
      }
      this.lastName = lastName;
      return this;
    }
    @Override
    public Person.Builder setAge(Integer age) {
      if (age == null) {
        throw new NullPointerException("Null age");
      }
      this.age = age;
      return this;
    }
    @Override
    public Person build() {
      String missing = "";
      if (this.firstName == null) {
        missing += " firstName";
      }
      if (this.lastName == null) {
        missing += " lastName";
      }
      if (this.age == null) {
        missing += " age";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Person(
          this.firstName,
          this.lastName,
          this.age);
    }
  }

}
