package BubbleSort;

public class BubbleSort {

        public static void main(String[] args) {
            Integer []m = {24, 32, 12, 1, -10, 22, 48, 7, 15};

            for (int i = 0; i < m.length; i++ ){
                int num = m[i];

                for (int j = i - 1; j >= 0; j--){
                    int leftNumber = m[j];

                    if (num < leftNumber){
                        m[j+1]=leftNumber;
                        m[j]= num;
                    }else{
                        break;
                    }


                }
            }
            for (Integer n :  m){
                System.out.println(n + ",");
            }
        }
    }

