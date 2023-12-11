public class Schet {
    public static String vichislitViragenie(String viragenie) {
        String[] chasti = viragenie.split(" ");

        if (chasti.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        String operand1 = chasti[0].replaceAll("\"", "");
        String operator = chasti[1];
        String operand2 = chasti[2].replaceAll("\"", "");
        if (operand1.length()>10) {
            throw new IllegalArgumentException("Длина строки более 10 символов");
        }


        switch (operator) {
            case "+":
                return addStrings(operand1, operand2);
            case "-":
                return subtractString(operand1, operand2);
            case "*":
                return multiplyString(operand1, Integer.parseInt(operand2));
            case "/":
                return divideString(operand1, Integer.parseInt(operand2));
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция");
        }
    }

    public static String addStrings(String operand1, String operand2) {
        return operand1 + operand2;
    }

    public static String subtractString(String operand1, String operand2) {
        if (operand1.contains(operand2)) {
            return operand1.replace(operand2, "");
        } else {
            return operand1;
        }
    }

    public static String multiplyString(String operand1, int operand2) {
        if (operand2>10 || operand2<0) {
            throw new IllegalArgumentException("Число выходит за рамки диапозона от 1 до 10");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < operand2; i++) {
            result.append(operand1);
        }
        if (result.length()>40){
            return result.substring(0, 40) + "...";

        }
        return result.toString();
    }

    public static String divideString(String operand1, int operand2) {
        int length = operand1.length() / operand2;
        if (length > 40) {
            return operand1.substring(0, 40) + "...";
        } else {
            return operand1.substring(0, length);
        }
    }
}
