package Model.Service;

import Model.Domain.ComplexNumber;
import Model.Interfaces.iCalculable;

public class Decorator implements iCalculable {
    private Calculator oldCalculator;
    private Logger logger;
    public Decorator(Calculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }


    /**
     * @param first_num первое комплексное число
     * @param second_num второе комплексное число
     * @return
     * метод одновременно производит сложение двух чисел и сохраняет результат, а также выводит на консоль лог-сообщения
     * проверка знака мнимой части нужна для корректного вывода комплексного числа на консоль
     */
    @Override
    public ComplexNumber sum(ComplexNumber first_num, ComplexNumber second_num) {
        ComplexNumber result = oldCalculator.sum(first_num, second_num);
        if (first_num.getImag()>=0) {
            logger.log("Первое комплексное число: " + first_num.getReal() + "+" + first_num.getImag() + "i");
        }
        else {
            logger.log("Первое комплексное число: " + first_num.getReal() + first_num.getImag() + "i");
        }
        if (second_num.getImag()>=0) {
            logger.log("Второе комплексное число: " + second_num.getReal() + "+" + second_num.getImag() + "i");
        }
        else {
            logger.log("Второе комплексное число: " + second_num.getReal() + second_num.getImag() + "i");
        }
        logger.log("Результат сложения = " + result);
        return result;
    }

    @Override
    public ComplexNumber multi(ComplexNumber first_num, ComplexNumber second_num) {
        ComplexNumber result = oldCalculator.multi(first_num, second_num);
        if (first_num.getImag()>=0) {
            logger.log("Первое комплексное число: " + first_num.getReal() + "+" + first_num.getImag() + "i");
        }
        else {
            logger.log("Первое комплексное число: " + first_num.getReal() + first_num.getImag() + "i");
        }
        if (second_num.getImag()>=0) {
            logger.log("Второе комплексное число: " + second_num.getReal() + "+" + second_num.getImag() + "i");
        }
        else {
            logger.log("Второе комплексное число: " + second_num.getReal() + second_num.getImag() + "i");
        }
        logger.log("Результат умножения = " + result);
        return result;
    }

    @Override
    public ComplexNumber div(ComplexNumber first_num, ComplexNumber second_num) {
        ComplexNumber result = oldCalculator.div(first_num, second_num);
        if (first_num.getImag()>=0) {
            logger.log("Первое комплексное число: " + first_num.getReal() + "+" + first_num.getImag() + "i");
        }
        else {
            logger.log("Первое комплексное число: " + first_num.getReal() + first_num.getImag() + "i");
        }
        if (second_num.getImag()>=0) {
            logger.log("Второе комплексное число: " + second_num.getReal() + "+" + second_num.getImag() + "i");
        }
        else {
            logger.log("Второе комплексное число: " + second_num.getReal() + second_num.getImag() + "i");
        }
        logger.log("Результат деления = " + result);
        return result;

    }

//    @Override
//    public int getResult() {
//        int result = oldCalculator.getResult();
//        logger.log(String.format("Получение результата %d", result));
//        return result;
//    }



}
