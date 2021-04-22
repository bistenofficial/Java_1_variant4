import java.util.Scanner;
public class mn {
    public static void main(String args[]) {
        int [] mass = new int[3]; 
        ZNAK gor = new ZNAK("", "", new int[3]);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фамилию");
        gor.setLast_name(input.nextLine());
        System.out.println("Введите имя");
        gor.setName(input.nextLine());

        System.out.println("Введите дату месяц год через / ");
        gor.setDate(convertDate(input.nextLine().split("/")));
        //convertDate(input.nextLine().split("."));

        gor.ZODIAC(gor);
        System.out.println("Фамилия: "+gor.getLast_name());
        mass = gor.getDate();
        for (int j= 0;j<3;j++)
        {
            System.out.println(mass[j]);
        }
        System.out.println("Имя: "+gor.getName());

        gor.setDate(new int[]{20,20,2020});
        gor.ZODIAC(gor);
        System.out.println("Фамилия: "+gor.getLast_name());
        mass = gor.getDate();
        for (int j= 0;j<3;j++)
        {
            System.out.println(mass[j]);
        }
        System.out.println("Имя: "+gor.getName());
    }

    static public int[] convertDate(String[] sDate) {
        return new int[]{Integer.parseInt(sDate[0]), Integer.parseInt(sDate[1]), Integer.parseInt(sDate[2])};
        //return new int[]{0, 1, 2};
    }
}
