import Model.Interfaces.iCalculable;
import Model.Service.Calculator;
import Model.Service.Decorator;
import Model.Service.Logger;
import View.ViewCalculator;


/**
 * НАЗВАНИЕ ПРОЕКТА: КАЛЬКУЛЯТОР КОМПЛЕКСНЫХ ЧИСЕЛ
 * ОПИСАНИЕ ПРОЕКТА: РЕАЛИЗУЕТ СЛОЖЕНИЕ, ДЕЛЕНИЕ И УМНОЖЕНИЕ КОМПЛЕКСНЫХ ЧИСЕЛ, ВВЕДЁННЫХ ПОЛЬЗОВАТЕЛЕМ
 * ДАТА СОЗДАНИЯ: 01.04.2024
 * АВТОР: ХАЙРУЛИН ВЛАДЛЕН
 * ВЕРСИЯ: 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        //iCalculable calcOld = new Calculator();
        iCalculable decorator = new Decorator(new Calculator(), new Logger());
        ViewCalculator view = new ViewCalculator(decorator);
        view.run();

    }
}
