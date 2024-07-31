package calculator;

public enum OperatorType {
    PLUS('+'), MINUS('-'), MULTI('*'), MOD('%'), DIVIDE('/');

    private final char symbol; //symbol의 필드는 열거형 상수의 기호가 불변임을 보장함

    OperatorType(char symbol) {
        this.symbol = symbol;  //symbol생성자
    }

    public static OperatorType type(char operator){ // operator에서 받아온 연산자가 올바르게 매칭되는지 확인하는 메서드
        for(OperatorType type : values()){ // OperatorType 열거형의 각 상수를 type변수에 하나씩 할당하여 반복함.
            if(operator == type.symbol){ //operator와 symbol하고 같으면 type으로 리턴하여 App.java로 이동한다.
                return type;
            }
        }
        throw new IllegalArgumentException ("잘못된 기호"); // 다른 문자열을 넣었을시 생기는 예외처리
    }
}
