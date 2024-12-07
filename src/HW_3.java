public class HW_3 {
    public static void main(String[] args) {
        double[] numbers = {8.2, 3,4, -0.2, 2.0, 4.5, -5.4, 6.3, 5.5, -7.7, 12.4, -4.4, 2.4, 5.6, -7.2, 5.6};
        boolean findFirstNegative=false;
        double sum= 0; //Сумма положительных чисел
        int countOfNumbers=0; //сумма полож. чисел
        for (double num: numbers){
            if (!findFirstNegative){
                if(num<0){
                    findFirstNegative=true;
                }

            }
            else{
                if(num>0){
                    sum+=num;
                    countOfNumbers++;
                }
            }

        }
        double averageOfNumbers = sum/countOfNumbers;
        System.out.println("Среднее арифметическое чисел после первого отрицательного: "+ averageOfNumbers);
    }
}
