package codegym.todo;

public class ToDoList {
    private Entry[] list;
    private int length = 0;

    public ToDoList(int maxLength) {
        list = new Entry[maxLength];
    }

    public void showToDoList() {
        for (int i = 0; i < this.length; i++) {
            System.out.println("Entry {id: " + i + ", priority: " + list[i].getPriority() + ", notes: " + list[i].getNotes());
        }
    }

    public void sortList() {
        Entry bk;
        for (int i = 0; i < this.length; i++) {
            for (int j = i+1; j < this.length; j++) {
                if (list[i].getPriority() < list[j].getPriority()) {
                    bk = list[i];
                    list[i] = list[j];
                    list[j] = bk;
                }
            }
        }
    }

    public boolean removeEntry(int id) {
        int index = id-1;
        if (!(index >= 0 && index < this.length)) {
            return false;
        }
        for (int i = index; i < this.length; i++) {
            list[i] = list[i+1];
        }
        this.length -= 1;
        return true;
    }

    public void addEntry(Entry entry) {
        list[length] = entry;
        length +=1;
    }

    public Entry getEntryById(int id) {
        return list[id-1];
    }
}
