package Model.Interfaces;

import Model.Domain.ComplexNumber;

public interface iCalculable {
    ComplexNumber sum(ComplexNumber first_num, ComplexNumber second_num);
    ComplexNumber multi(ComplexNumber first_num, ComplexNumber second_num);
    ComplexNumber div(ComplexNumber num, ComplexNumber divisor);
   // ComplexNumber getResult();
}
