package AbstractClassesAndInterfaces;

import java.util.ArrayList;
import java.util.List;


public class Task6_1{
    public static void main(String[] args) {
        UndoStringBuilder builder = new UndoStringBuilder();
        builder.append("Hello");
        builder.append(" World");
        System.out.println(builder);

        builder.delete(6, 11);
        System.out.println(builder);

        builder.undo();
        System.out.println(builder);
    }
}
class UndoStringBuilder {
    private StringBuilder stringBuilder;
    private List<String> operations;

    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
        operations = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        operations.add("append:" + str);
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        operations.add("delete:" + deleted);
    }

    public void undo() {
        if (!operations.isEmpty()) {
            String lastOperation = operations.remove(operations.size() - 1);
            String[] parts = lastOperation.split(":");
            String operation = parts[0];
            String value = parts[1];

            switch (operation) {
                case "append":
                    stringBuilder.delete(stringBuilder.length() - value.length(), stringBuilder.length());
                    break;
                case "delete":
                    stringBuilder.append(value);
                    break;
            }
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
