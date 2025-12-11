package level02AandB;

import java.util.Objects;

public class Restaurant implements  Comparable <Restaurant> {

    private final String name;
    private final int qualification;

    public Restaurant(String name, int qualification) {
        this.name = name;
        this.qualification = qualification;

    }

    public String getName() {
        return name;
    }

    public int getQualification() {
        return qualification;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;

        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Restaurant other = (Restaurant) object;

        return qualification == other.qualification &&
                Objects.equals(name, other.name);
    }

    public int hashCode() {
        return Objects.hash(name, qualification);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareToIgnoreCase(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(other.qualification, this.qualification);

    }

    public String toString() {
        return "Restaurant{name='" + name + "', qualification=" + qualification + "}";

    }
}
