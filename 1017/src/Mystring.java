import java.util.Arrays;
import java.util.Objects;

public class Mystring {
    String string;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mystring)) return false;
        Mystring mystring = (Mystring) o;
        return Objects.equals(string, mystring.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    public Mystring(char[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }
    public Mystring(char[] value,int offset,int count){
        this.value = Arrays.copyOfRange(value,offset,count);
    }

    public Mystring toUpperCase(){

     }
     public boolean equalslgnoreCase(Mystring o){
     }
}
