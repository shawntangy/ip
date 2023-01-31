public class Todo extends Task {

    public static final String TODO_ICON = "[T]";

    public Todo(String description) {
        super(description);
    }
    @Override
    public String toString() {
        return TODO_ICON + super.toString();
    }
}
