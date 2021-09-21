package Business.WorkQueue;

public enum Status {
    Waiting("Waiting"),
    Accepted("Accepted"),
    Sending("Sending"),
    Refused("Refused"),
    Received("Received"),
    Delivery ("Confirm Delivery");
    

    private String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
