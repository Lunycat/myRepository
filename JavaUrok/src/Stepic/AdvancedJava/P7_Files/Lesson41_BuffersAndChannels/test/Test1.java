package Stepic.AdvancedJava.P7_Files.Lesson41_BuffersAndChannels.test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\Артём\\Desktop\\text.txt", "rw");
        FileChannel channel = file.getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(20);
            channel.read(buffer);
            buffer.flip();
            for (int i = 0; i < 3; i++) {
                System.out.println((char) buffer.get());
            }
            System.out.println("---------------------------------");
            buffer.rewind();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
