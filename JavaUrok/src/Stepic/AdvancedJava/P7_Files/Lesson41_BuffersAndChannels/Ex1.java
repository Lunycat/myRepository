package Stepic.AdvancedJava.P7_Files.Lesson41_BuffersAndChannels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\Артём\\Desktop\\text.txt", "rw");
             FileChannel channel = file.getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(47);
            StringBuilder stih = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                Thread.sleep(300);
                System.out.println("Read: " + (char)byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stih.append(buffer.get());
                    Thread.sleep(300);
                    System.out.println(stih);
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
