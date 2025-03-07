#include <iostream>
#include <cmath> 

int main()
 {
    double base, exponent;
    std::cout << "Enter base: ";
    std::cin >> base;
    std::cout << "Enter exponent: ";
    std::cin >> exponent;

    double result = std::pow(base, exponent);
    std::cout << base << "^" << exponent << " = " << result << std::endl;
  return 0;
}
