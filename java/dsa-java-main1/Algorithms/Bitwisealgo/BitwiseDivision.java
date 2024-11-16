package Algorithms.Bitwisealgo;

    public class BitwiseDivision {
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
    
