package javatasks;

public class day6minarray {

    public static void main(String[] args) {

        int input []={12,12,45,65,12,346,7,9,4,12,45,9,0,-95,4,3,1,3,3454};
        System.out.println(min(input));

    }


public static int min(int[] x){

    int min=x[0];

    for (int i=0; i< x.length;i++){

        if(x[i]<min){

            min=x[i];
        }

    }
return min;
}

}