
    import java.lang.Math;

    public class Snake {

        // driver code
        public static void main(String args[])
        {
            // define the range
            int max = 6;
            int min = 1;
            int range = max - min + 1;

        // generate random numbers within 1 to 6
        for (int i = 0; i < 10; i++)  {
            int rand = (int)(Math.random() * range) + min;

            // output is different everytime this code is executed
            System.out.println(rand);

        }
        }
}
