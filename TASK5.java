package ua.com.samsungitschool;

class Main {

    public static void main(String[] args) {
        boolean result = isBelongToSection(5, 0, 9, 10, 19);
    }

    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if (x >= fromA && x <= toB || x >= fromSecondA && x <= toSecondB) {
        	return true;
        }
        
        return false;
    }
}
