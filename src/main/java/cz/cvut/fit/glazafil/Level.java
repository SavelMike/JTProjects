package cz.cvut.fit.glazafil;

public enum Level {
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private final String name;

    private Level(String name) {
        this.name = name;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return "[" + this.name + "]: ";
    }
}
