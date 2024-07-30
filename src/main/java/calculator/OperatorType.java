package calculator;

public enum OperatorType {
    PLUS('+'), MINUS('-'), MULTI('*'), MOD('%'), DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType type(char operator){
        for(OperatorType type : values()){
            if(operator == type.symbol){
                return type;
            }
        }
        throw new IllegalArgumentException ("잘못된 기호");
    }
}
