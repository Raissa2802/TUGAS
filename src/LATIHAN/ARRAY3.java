package LATIHAN;

public class ARRAY3 {
    public static void main(String[] args) {
        String kelompok_0_group_0[] = {"wirya","daniel","agnaya","bintang"};
        String kelompok_0_group_1[] = {"rahmat","luis","yuventus",null};
        String kelompok_1_group_0[] = {"naufal","pandu","putra","chandra"};
        String kelompok_1_group_1[] = {"aril","charel","devi","desur"};                                
        String kelompok_2_group_0[] = {"denaia","wulan","jizah","acha"};
        String kelompok_2_group_1[] = {"ara","ica","miftah","fajar"};
        
        String kelompok_0[][] = {
            {"wirya","daniel","agnaya","bintang"},
            {"rahmat","luis","yuventus",null},
        };
        String kelompok_1[][] = {
            {"naufal","pandu","putra","chandra"},
            {"aril","charel","devi","desur"},
        };
        String  kelompok_2[][] = {
            {"denaia","wulan","jizah","acha"},
            {"ara","ica","miftah","fajar"},
        };

        String kelompok[][][] = {
            {
                {"wirya","daniel","agnaya","bintang"},
                {"rahmat","luis","yuventus",null}
            },
            {
                {"naufal","pandu","putra","chandra"},
                {"aril","charel","devi","desur"}
            },
            {
                {"denaya","wulan","ajizah","acha"},
                {"ara","ica","miftah","fajar"}
            }
        };
        System.out.print(kelompok[1][1][2]); //devi
    }  
}
