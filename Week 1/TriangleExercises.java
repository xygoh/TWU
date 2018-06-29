public class TriangleExercises {

    // Print one asterisk
    public static void easiest_exercise_ever(){
        System.out.println("*");
    }

    // Draw a horizontal line of length n
    public static void horizontal_line(int n){
        String s="*";
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<n; i++){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }

    // Draw a vertical line of length n
    public static void vertical_line(int n){
        for (int i=0; i<n; i++){
            easiest_exercise_ever();
        }
    }

    // Draw a right triangle of height n
    public static void right_triangle(int n){
        for (int i=0; i<n; i++){
            horizontal_line(i+1);
        }
    }
}
