# Module2_C0123K01
10/03/23

- Khai báo mảng: 

	int [] numbers = new int[5];		
	int[] numbers = {1, 7, 5, 1}; 		

- Khởi tạo nhanh mảng

- Duyệt mảng bằng vòng lặp for 
Bài tập 
BT1: Tính tổng các giá trị trong mảng

BT2: Đếm xem mảng có bao nhiêu số chẵn

BT3: Tìm giá trị nhỏ nhất của mảng

BT4: Thêm phần tử vào mảng

BT5: Xóa phần tử khỏi mảng

BT6: Gộp 2 mảng a, b lại với nhau

Bài tập vòng lặp ai chưa làm thì làm bù

Đọc bài trước, note lại và demo:
- Lớp Wrapper trong java
  Wrapper class trong Java là các lớp được sử dụng để bao bọc (wrap) các kiểu dữ 
  liệu nguyên thủy (primitive data types) như int, float, double, boolean, v.v. 
  để chúng có thể được sử dụng như các đối tượng (object) trong Java.
  Các wrapper class này cung cấp các phương thức để chuyển đổi giá trị của các 
  kiểu dữ liệu nguyên thủy thành đối tượng và ngược lại. Chúng cũng cung cấp các 
  phương thức để thực hiện các phép tính toán và so sánh giữa các đối tượng của 
  chúng. Ví dụ sử dụng wrapper class Integer để chuyển đổi một chuỗi sang số nguyên:
  
  String str = "123";
  Integer num = Integer.parseInt(str);
  System.out.println(num); // Output: 123


- Kiểu tham chiếu và tham trị trong Java

Truyền tham trị (Pass by Value):
Khi truyền tham trị vào phương thức, giá trị của biến được sao chép vào một tham số khác trong phương thức. Do đó, thay đổi giá trị của tham số trong phương thức sẽ không ảnh hưởng đến giá trị của biến ban đầu ở bên ngoài phương thức.

Truyền tham chiếu (Pass by Reference):
Khi truyền tham chiếu vào phương thức, địa chỉ của biến được sao chép vào tham số trong phương thức. Do đó, thay đổi giá trị của tham số trong phương thức sẽ ảnh hưởng đến giá trị của biến ban đầu ở bên ngoài phương thức.
Ví dụ:

13/03
