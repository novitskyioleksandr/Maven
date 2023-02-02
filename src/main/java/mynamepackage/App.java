package mynamepackage;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, String> user = new HashMap<>();
        user.put("name", "Oleksandr");
        user.put("lastName", "Novitskyi");

        System.out.println(new Gson().toJson(user));
    }
}
