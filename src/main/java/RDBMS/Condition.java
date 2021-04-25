package RDBMS;

public class Condition {
    public enum Operation {
        EQUAL, NOT_EQUAL,TRUE, GREATER_THAN, LESS_THAN, EQ_GREATER_THAN, EQ_LESS_THAN
    }

    private Operation op;

    private String columnName;

    private String rightSide;

    public Condition(Operation op, String columnName, String rightSide) {
        this.op = op;
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
            case NOT_EQUAL:
                return comp != 0;
            case TRUE:
                return true;
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
