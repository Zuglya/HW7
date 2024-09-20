//public class Main {
//    public static void main(String[] args) {
//        //todo Тут увольняем айтишников
//        for(int id =0; id <= 100; id = id + 2) {
//            if(id == 0){
//                continue;
//            }
//            System.out.println("Уволен айтишник с id " + id);
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int id = 0;
        while (id <= 100) {
            if(id == 0) {
                id += 2;
                continue;
            }
            System.out.println("Уволен айтишник с id " + id);
            id += 2;
        }
    }
}