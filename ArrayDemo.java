//https://github.com/mbganesh/Data-Structure--Java.git


class Array{
    public static void main(String[] args) {
        // program without array...
        int mark_a = 90 , mark_b = 87 , mark_c = 65 , mark_d = 66 , mark_e = 84 , mark_f = 96;
        // find average of above marks.
        float result = (mark_a + mark_b + mark_c + mark_d + mark_e + mark_f)/6 ;
        System.out.println("Result in non-array block : " + result);



        // program with array...
        int marks[] = {90,87,65,66,84,96};
        float display = 0;
        for(int i = 0 ; i < 6 ; i++){
            display = display + marks[i];
        }
        System.out.println("Result in Array block : " + display/6);
    }
}
