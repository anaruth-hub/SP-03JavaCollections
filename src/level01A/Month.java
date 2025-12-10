package level01A;

import java.util.Objects;

public class Month {
    private final String name;

    public Month(String name) {
        this.name = Objects.requireNonNull(name,  "name cannot be null" );
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Month)) return false;

        Month other = (Month) o;

        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();


    }
}