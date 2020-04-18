package entities;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person {
    public abstract String firstName();

    public abstract String lastName();

    public abstract Integer age();

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    public abstract Builder toBuilder();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setFirstName(String firstName);

        public abstract Builder setLastName(String lastName);

        public abstract Builder setAge(Integer age);

        public abstract Person build();
    }
}
