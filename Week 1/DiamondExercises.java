public class DiamondExercises {

    /* Print a centered triangle of height n
     * Default Usage: o=1, padding=0 */
    public static void isosceles_triangle(int n,int o,int padding){
        int i=1;
        int j=0;
        int space=0;
        int asterisk=0;
        StringBuilder sb= new StringBuilder();

        for (i=1; i<=n; i++){
            if (o==1){ // right side up triangle
                space=n-i;
                asterisk=(2*i)-1;
            }else if (o==2){ // upside down triangle
                space=i-1;
                asterisk=(2*n)-(2*i-1);
            }

            for (j=0; j<space+padding; j++){
                sb.append(" ");
            }

            for (j=0; j<asterisk; j++){
                sb.append("*");
            }

            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }

    // Print a centered diamond of diameter n
    public static void diamond(int n){
        // print normal triangle n-1
        isosceles_triangle(n-1,1,1);
        // print line n asterisks
        TriangleExercises.horizontal_line(2*n-1);
        // print upside down triangle n-1
        isosceles_triangle(n-1,2,1);
    }

    // Print a centered diamond with my name in the middle
    public static void diamond_with_name(int n){
        String name="Christie";
        int l=name.length();
        StringBuilder sb= new StringBuilder();
        int max=2*n-1;
        int triangle_padding=1;
        int name_padding=0;

        // decide how much padding
        if (l<max){
            // padding for name
            name_padding=(int) Math.floor((double)(max-l)/2);
        }else if(l>max) {
            // padding for triangles
            triangle_padding = (int) Math.ceil((double) (l - max) / 2);
        }

        // print normal triangle n-1
        isosceles_triangle(n-1,1,triangle_padding);

        // print name
        for (int i=0; i<name_padding; i++){
            sb.append(" ");
        }
        sb.append(name);
        System.out.println(sb.toString());

        // print upside down triangle n-1
        isosceles_triangle(n-1,2,triangle_padding);
    }
}
