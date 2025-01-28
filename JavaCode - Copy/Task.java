// Define the third class
class Task {
    // Define the enums
    enum Status {
        ACTIVE, INACTIVE, PENDING
    }

    enum Priority {
        HIGH, MEDIUM, LOW
    }

    enum Role {
        ADMIN, USER, GUEST
    }

    // Define normal variables
    private String description;
    private boolean isEnabled;

    // Constructor
    public Task(String description, boolean isEnabled) {
        this.description = description;
        this.isEnabled = isEnabled;
    }

    // Getter methods
    public String getDescription() {
        return description;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
