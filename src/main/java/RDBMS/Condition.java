package RDBMS;

public class Condition {
    public enum Operation {
        EQUAL, GREATER_THAN, LESS_THAN, EQ_GREATER_THAN, EQ_LESS_THAN
    }

    private Operation op;

    private String tableName;

    private String columnName;

    private String rightSide;

    public Condition(Operation op, String tableName, String columnName, String rightSide) {
        this.op = op;
        this.tableName = tableName;
        this.columnName = columnName;
        this.rightSide = rightSide;
    }

    public String getColumnName() {
        return columnName;
    }

    public boolean apply(String leftValue) {
        int comp = leftValue.compareTo(rightSide);
        switch (op) {
            case EQUAL:
                return comp == 0;
            case LESS_THAN:
                return comp < 0;
            case EQ_LESS_THAN:
                return comp < 1;
            case GREATER_THAN:
                return comp > 0;
            case EQ_GREATER_THAN:
                return comp > -1;
            default:
                throw new IllegalStateException( "Undefined Operation");
        }
    }
}
