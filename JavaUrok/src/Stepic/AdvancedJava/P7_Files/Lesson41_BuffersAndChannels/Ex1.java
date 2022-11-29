package Stepic.AdvancedJava.P7_Files.Lesson41_BuffersAndChannels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        try (RandomAccessFile file1 =
                     new RandomAccessFile("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.txt", "rw");
             RandomAccessFile file2 =
                     new RandomAccessFile("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Потребитель.txt", "rw");
             FileChannel channelRead = file1.getChannel();
             FileChannel channelWrite = file2.getChannel())
        {
<<<<<<< HEAD
            StringBuilder stih = new StringBuilder();
            ByteBuffer bufferRead = ByteBuffer.allocate(20);
            int countReadBuffer = 1;
            while (countReadBuffer > 0) {
                countReadBuffer = channelRead.read(bufferRead);
                System.out.printf("Было прочитано %d байт\n", countReadBuffer);
                bufferRead.flip();
                while (bufferRead.hasRemaining()) {
                    stih.append((char) bufferRead.get());
                }
                bufferRead.clear();
=======
            ByteBuffer buffer = ByteBuffer.allocate(20);
            StringBuilder stih = new StringBuilder();
            int byteRead = 1;
            while (byteRead > 0) {
                byteRead = channel.read(buffer);
                System.out.println("Read: " + (char)byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stih.append(buffer.get());
                    System.out.println(stih);
                }
                buffer.clear();
>>>>>>> 0fcb2fd2 (update Lesson41)
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println(stih);

            file2.seek(300); // Установить курсор на 300 пункте
            String text = "\nАбоба боба абобка";
            ByteBuffer bufferWrite = ByteBuffer.wrap(text.getBytes());
            channelWrite.write(bufferWrite);
        }
        catch (IOException e) {throw new RuntimeException(e);}
    }
}
