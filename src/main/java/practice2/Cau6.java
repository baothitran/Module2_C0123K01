package practice2;
//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class Cau6 {
        public static void main(String[] args) {
            int[] a = {2,6,10};
            int[] b = {2, 4, 6, 8, 10};

            boolean allInB = true;
            for (int i = 0; i < a.length; i++) {
                boolean checkInB = false;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        checkInB = true;
                        break;
                    }
                }
                if (!checkInB) {
                    allInB = false;
                    break;
                }
            }
            if (allInB) {
                System.out.println("Tất cả các phần tử trong mảng a đều nằm trong mảng b");
            } else {
                System.out.println("Không phải tất cả các phần tử trong mảng a đều nằm trong mảng b");
            }

        }
    }

