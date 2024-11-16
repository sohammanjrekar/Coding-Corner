package Algorithms.Bitwisealgo;
// Time and Space Complexity
// Time Complexity: O(log(n)^2)

// The time complexity of the division using bit manipulation involves two nested loops:

// Outer Loop: This loop runs while dividendAbs >= divisorAbs. In the worst case, this loop runs O(log(n)) times, where n is the dividend.

// Inner Loop: This loop involves left-shifting the tempDivisor until it is no longer less than or equal to dividendAbs. Each shift operation is O(1), but since we're shifting within a logarithmic range, this inner loop also runs O(log(n)) times in the worst case.

// Therefore, the overall time complexity is O(log(n) * log(n)), which simplifies to O(log(n)^2).

// Space Complexity: O(1)


public class dividetwointeger {
        public static void main(String[] args) {
            int dividend = 43;
            int divisor = 8;
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        }
    
        public static int divide(int dividend, int divisor) {
            if (divisor == 0) throw new ArithmeticException("Division by zero");
            if (dividend == 0) return 0;
            if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    
            boolean negative = (dividend < 0) ^ (divisor < 0);
            long dividendAbs = Math.abs((long) dividend);
            long divisorAbs = Math.abs((long) divisor);
            int result = 0;
    
            while (dividendAbs >= divisorAbs) {
                long tempDivisor = divisorAbs, multiple = 1;
                while (dividendAbs >= (tempDivisor << 1)) {
                    tempDivisor <<= 1;
                    multiple <<= 1;
                }
                dividendAbs -= tempDivisor;
                result += multiple;
            }
    
            return negative ? -result : result;
        }
    }
    
