public class Main {
    public boolean canConstruct(String ransomNote, String magazine) {
        int index;
        StringBuilder stringBuilder = new StringBuilder(magazine);
        for (char c : ransomNote.toCharArray()) {
            index = stringBuilder.indexOf(String.valueOf(c));
            if (index >= 0) {
                stringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
