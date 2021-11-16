import org.apache.commons.lang3.StringUtils;

public class textUtils{
    public static String getText(){
        String[] names = ["Elisheva", "Shulamit", "Tamar"]
        return StringUtils.join(names, ", ")
    }
}