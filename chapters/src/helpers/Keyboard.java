package helpers;

import java.io.*;

/**
 * This is a helper class to help students accept user input from the keyboard
 * in their programs.
 *
 * @author Teleskola.mt
 * @version 0.1
 */
public class Keyboard
{
    public static String readString() {
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (Exception e) {
    
        }
        return null;
    }
    
    public static int readInt() {
        return Integer.parseInt(readString());
    }
    
    public static byte readByte(){
        return Byte.parseByte(readString());
    }

    public static short readShort(){
        return Short.parseShort(readString());
    }

    public static long readLong(){
        return Long.parseLong(readString());
    }

    public static float readFloat(){
        return Float.parseFloat(readString());
    }

    public static double readDouble(){
        return Double.parseDouble(readString());
    }

    public static char readChar(){
        return readString().charAt(0);
    }

    public static boolean readBoolean(){
        return Boolean.parseBoolean(readString());
    }
}