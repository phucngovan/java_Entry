package codegym.todo;

public class Entry {
    private static int count = 0;
    private int priority = 0;
    private String notes;

    public Entry() {

    }

    public Entry(int priority, String notes) {
        this.priority = priority;
        this.notes = notes;
        count++;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public static int getCount() {
        return count;
    }
}
