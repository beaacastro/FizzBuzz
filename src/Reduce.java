public class Reduce {
    public static void main(String[] args) {
        Integer numOfSteps = 0;
        int num = 100;

        while (num != 0){

            if (num % 2 == 0){
                num = num/2;
                numOfSteps += 1;

            } else {
                num = num - 1;
                numOfSteps += 1;
            }
        }
        System.out.println(numOfSteps);



    }
}
