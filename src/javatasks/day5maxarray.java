package javatasks;

public class day5maxarray {
    public static void main(String[] args) {

       int [] input1={12,15,99,8,1,55,2,78,1};
        System.out.println(max(input1));
    }

    public static int max(int [] x){

        int max=x[0];

        for (int i=0; i< x.length;i++) {

            if (x[i]>max){

                max=x[i];
            }

        }
        return max;
        }

    }


