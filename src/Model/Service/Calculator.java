package Model.Service;
import Model.Domain.ComplexNumber;
import Model.Interfaces.iCalculable;

public class Calculator implements iCalculable {
    private ComplexNumber result;
    public Calculator() {
        this.result = null;
    }

    /**
     * @param first_num первое комплексное число
     * @param second_num второе комплексное число
     * @return
     * метод для сложения двух комплексных чисел - отдельно складываются действительные и мнимые части.
     */
    @Override
    public ComplexNumber sum(ComplexNumber first_num, ComplexNumber second_num) {
        double newReal = first_num.getReal() + second_num.getReal();
        double newImag = first_num.getImag() + second_num.getImag();
        result = new ComplexNumber(newReal, newImag);
        return result;
    }

    /**
     * @param first_num первое комплексное число
     * @param second_num второе комплексное число
     * @return
     * Метод для умножения двух комплексных чисел, ниже написана формула.
     */
    // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    @Override
    public ComplexNumber multi(ComplexNumber first_num, ComplexNumber second_num) {
        double newReal = first_num.getReal() * second_num.getReal() - first_num.getImag() * second_num.getImag();
        double newImag = first_num.getReal() * second_num.getImag() + first_num.getImag() * second_num.getReal();
        result = new ComplexNumber(newReal, newImag);
        return result;
    }

    /**
     * @param first_num первое комплексное число
     * @param second_num второе комплексное число
     * @return
     * метод для деления двух комплексных чисел, ниже написана формула
     */
    // (a+bi)/(c+di) = ((a+bi)*(c-di)/(c+di)*(c-di))
    @Override
    public ComplexNumber div(ComplexNumber first_num, ComplexNumber second_num) {
        double newReal = (first_num.getReal() * second_num.getReal() + first_num.getImag() * second_num.getImag()) / (second_num.getReal() * second_num.getReal() + second_num.getImag() * second_num.getImag());
        double newImag = (first_num.getImag() * second_num.getReal() - first_num.getReal() * second_num.getImag()) / (second_num.getReal() * second_num.getReal() + second_num.getImag() * second_num.getImag());
        result = new ComplexNumber(newReal, newImag);
        return result;
    }

//    @Override
//    public ComplexNumber getResult() {
//        return result;
//    }
}
