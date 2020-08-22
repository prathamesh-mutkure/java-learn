package sample;

class Model {

    float calculate(float num1, float num2, String operator){

        float result;

        switch (operator){

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    result = 0;
                    break;
                }
                result = num1 / num2;
                break;
            default:
                result = 0;
        }

        return result;

    }

}
