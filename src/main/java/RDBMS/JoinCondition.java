package RDBMS;

public class JoinCondition {
    private Condition.Operation op;



    private  String leftColumnName;

    private String rightColumnName;

    public JoinCondition(Condition.Operation op, String leftColumnName, String rightColumnName) {
        this.op = op;
        this.leftColumnName = leftColumnName;
        this.rightColumnName = rightColumnName;
    }

    public String getLeftColumnName() {
        return leftColumnName;
    }

    public String getRightColumnName() {
        return rightColumnName;
    }

    public boolean apply(String leftValue,String rightValue) {
        int comp = leftValue.compareTo(rightValue);
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
