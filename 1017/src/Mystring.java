import java.util.Arrays;

public class Mystring {
    private final char[] value;

    public Mystring(char[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }
    public Mystring(char[] value,int offset,int count){
        this.value = Arrays.copyOfRange(value,offset,count);
    }
}
