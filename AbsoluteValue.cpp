/*Q8. (Challenge) Absolute Value & Clamp — No if-else
Write two C++ functions using only the ternary operator (no if, no else, no standard library):
int absolute(int n) — returns the absolute value of n.
int clamp(int val, int lo, int hi) — returns:
lo if val < lo
hi if val > hi
val otherwise
Test with the following cases in main() and print results in a table format:
| val | lo  | hi | absolute(val) | clamp(val, lo, hi) |
| --- | --- | -- | ------------- | ------------------ |
| -15 | -10 | 10 | ?             | ?                  |
| 0   | -10 | 10 | ?             | ?                  |
| 25  | -10 | 10 | ?             | ?                  |
| -3  | 0   | 5  | ?             | ?                  |
*/


#include <iostream>
using namespace std;
// Returns absolute value of n using only ternary operator
int absolute(int n) {
    return n < 0 ? -n : n;
}

// Returns clamped value of val between lo and hi using only ternary operator
int clamp(int val, int lo, int hi) {
    return val < lo ? lo : (val > hi ? hi : val);
}

int main() {
    int test_vals[] = { -15, 0, 25, -3 };
    int test_lo[] = { -10, -10, -10, 0 };
    int test_hi[] = { 10, 10, 10, 5 };

    std::cout << "val\tlo\thi\tabsolute(val)\tclamp(val, lo, hi)\n";
    std::cout << "---------------------------------------------------\n";

    for (int i = 0; i < 4; i++) {
        int val = test_vals[i];
        int lo = test_lo[i];
        int hi = test_hi[i];

        std::cout << val << "\t" << lo << "\t" << hi << "\t" 
                  << absolute(val) << "\t\t" << clamp(val, lo, hi) << "\n";
    }

    return 0;
}