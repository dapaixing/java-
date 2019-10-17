import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<cpdomains.length;i++){
            String[] num = cpdomains[i].split(" ");
            String[] strings =  num[1].split("\\.");
            String domain = "";
            for (int j = strings.length-1;j>=0;j--){
                if (j == strings.length-1){
                    domain += strings[j];
                }else {
                    domain = strings[j]+"." + domain;
                }

                if (map.get(domain) == null){
                    map.put(domain,Integer.parseInt(num[0]));
                }else {
                    map.put(domain,map.get(domain) + Integer.parseInt(num[0]));
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}