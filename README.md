## Test Cases

Triangle(double a, double b, double c)

| Input | Expected | Actual |
| ------------- |:-------------:| :-----:|
| 1, 2, 2 | ISOSCELES | ISOSCELES |
| 2, 1, 2 | ISOSCELES | ISOSCELES |
| 2, 2, 1 | ISOSCELES | ISOSCELES |
| 2, 2, 2 | EQUILATERAL | EQUILATERAL |
| 1, 1, 1 | EQUILATERAL | EQUILATERAL |
| a, 2, 1 | not a number | syntax error |
| 4, 5, 6 | SCALENE | SCALENE |
| 6, 4, 5 | SCALENE | SCALENE |
| 5, 6, 4 | SCALENE | SCALENE |
| 1, 2, 3 | INVALID | INVALID |
| 0, 0, 0 | INVALID | INVALID |
| -10, 1, 2 | INVALID | INVALID |
| 1, -1, 2 | INVALID | INVALID |
