import java.io.*;

public class WriteATextFile {
    public static void main(String[] args) throws IOException {
        //Ghi file văn bản
        try {
            //mở file để ghi
//            FileWriter writer = new FileWriter("Hello.txt");

            /*Bộ nhớ đệm (buffer) cho ta một nơi lưu trữ tạm thời để tăng hiệu quả của thao tác đọc/ghi dữ liệu.
            /*Cách sử dụng BufferWriter như sau BufferWriter writer = new BufferWriter(new FileWriter(aFile);
            /*Sau lệnh trên thì ta chỉ cần làm việc với BufferWriter mà không cần để ý đến đối tượng FileWriter vừa tạo nữa.*/

            BufferedWriter writer=new BufferedWriter(new FileWriter("Hello.txt"));
            //write() ghi một đối tượng string ra file
            writer.write("Hello  a tuyền 1");
            writer.write("wth");
            //đóng file khi xong việc
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Đọc tệp văn bản
        /*Đọc từ file văn bản là công việc có quy trình tương tự ghi file, chỉ khác
        là giờ ta dùng một đối tượng FileReader để trực tiếp thực hiện công việc đọc
        file và một đối tượng BufferReader nối với nó để tăng hiệu quả đọc.*/
        try {
            File file = new File("Hello.txt");

            //Nối FileReader với một file text
            FileReader fileReader = new FileReader(file);

            //nối BufferedReader với FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                //đọc từng dòng cho đến khi ko đọc đc gì nữa
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
