public class throwsexample {

        //defining a method
        public static void checkNum(int num) {
            if (num < 1) {
                throw new ArithmeticException("\nNumber is negative, cannot calculate square");
            }
            else {
                System.out.println("Square of " + num + " is " + (num*num));
            }
        }
        //main method
        public static void main(String[] args) {
            throwsexample obj = new throwsexample();
            obj.checkNum(-3);
            System.out.println("Rest of the code..");
        }
    }

