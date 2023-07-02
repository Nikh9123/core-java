// enum season{
//     SUMMER , WINTER ,SPRING
// }

// public class EnumDemo2 {
//     public static void main(String[] args) {
//         for (season s : season.values()) {
//             System.out.println(s);
//         }
//     }
// }
enum Season {
    SUMMER, WINTER, SPRING
}

class EnumDemo2 {
    public static void main(String[] rk) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
