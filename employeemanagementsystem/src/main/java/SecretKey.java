public class SecretKey {
    private String key;

    // Constructor
    public SecretKey(String key) {
        this.key = key;
    }

    // Getter
    public String getKey() {
        return key;
    }

    // Setter
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "SecretKey [key=PROTECTED]";
    }
}

