package Stepic.AdvancedJava.P7_Files.Lesson41_BuffersAndChannels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        try (RandomAccessFile file1 =
                     new RandomAccessFile("C:\\Users\\Артём\\Desktop\\Источник.txt", "rw");
             RandomAccessFile file2 =
                     new RandomAccessFile("C:\\Users\\Артём\\Desktop\\Потребитель.txt", "rw");
             FileChannel channelReader = file1.getChannel();
             FileChannel channelWriter = file2.getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(20);
            int byteRead = 1;
            while (byteRead > 0) {
                byteRead = channelReader.read(buffer);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    channelWriter.write(buffer);
                }
                buffer.clear();
            }
        }
        catch (IOException e) {throw new RuntimeException(e);}
    }
}
