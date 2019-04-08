//package lab4.Example;
//
//import java.util.Comparator;
//
//public class MyComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//        int differenceSurname = o1.getSurname().compareTo(o2.getSurname());
//
//        if (differenceSurname > 0) {
//            return -1;
//        } else {
//            if (differenceSurname < 0) {
//                return 1;
//            } else {
//
//                int differenceName = o1.getName().compareTo(o2.getName());
//                if (differenceName > 0) {
//                    return 1;
//                } else {
//                    if (differenceName < 0) {
//                        return -1;
//                    } else {
//                        return 0;
//                    }
//                }
//
//            }
//        }
//    }
//}