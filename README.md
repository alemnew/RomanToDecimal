# RomanToDecimal

Roman number to decimal integer converter. The program converts roman numbers within the range I to MMMMCMXCIX 
(i.e. 1 to 4999 in the decimal notation). In roman numbering system the base numerals are `I`, `V`, `X`, `L`, `C`, `D`, 
and `M` representing 1, 5, 10, 50, 100, 500, and 100, respectively. With these numerals we can safely represent integers
from 1 to 4999 with a roman numeral by using addition and subtraction scheme. Integers starting from 5000 follow the same 
patter by adding other symbols to the base roman numerals. The program does not consider integers greater than 4999 and 
hence the details are left future work. 

The following rule shows how to form a valid roman number from the base numerals. 
- `I`, `X`, and `C` can be consecutively repeated at a maximum of three times. This can represent integers with the base 
 numeral `times` the number of repetition. 
- `V`, `L`, and `D` cannot repeat consecutively. These numerals can exist in a roman numeral to represent either 
themselves, the next three numbers that are a product of the predecessor base numeral, or the number equivalent to the 
given numerals minus the predecessor base numeral. 
- `M` can appear a maximum of four times consecutively to represent the numbers that are a product of `M` with the number
repetitions.   

# Code structure 

- [RomanToDecimal.java](src/fi/documill/main/RomanToDecimal.java) contains the main source code. 
- [RomanToDecimalTest.java](src/fi/documill/test/RomanToDecimalTest.java)  contains the test cases for the program. 

# How use it? 
The program is developed and tested with the latest version of Java (Java SE 13).  If your system does not have Java 
installed, please install it from [Oracle](https://www.oracle.com/technetwork/java/javase/downloads/index.html) website. 

To compile the poker game follow these steps:
1. Clone the code to your machine
    - `git clone https://gitlab.com/alemnew/RomanToDecimal.git`
2. Open in any IDE (IntelliJ IDEA or eclipse) and follow the IDE instruction to build and run.
3. Run the program and provide the input string from the keyboard.
4. For exiting the program type `quit`. 
