public class derpo{
    public static void main(String[] args){
     int plz = 5;
        int ty = 8;
        int yw = 1;
        while (yw < 2)
        {
            ty++;
            yw = ty / plz;
            if (ty == 10)
            {
                System.out.println(plz);
                plz = 6;

            }
            System.out.println("x");
        }
        System.out.println(ty + "+" + yw);
    }
}