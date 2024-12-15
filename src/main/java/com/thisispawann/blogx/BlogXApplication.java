package com.thisispawann.blogx;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootApplication
public class BlogXApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(BlogXApplication.class, args);
//        JSONObject person = new JSONObject();
        //ADD key value pairs
//        person.put("name","Suman Shrestha");
//        person.put("age",30);
//        person.put("isMarried",false);

        //add as nested JSONObject

//        JSONObject address = new JSONObject();
//        address.put("street","123 Main st");
//        address.put("city","New york");
//        address.put("zip","1002");
//        person.put("address",address);
//
//        //print the jsonobject
//        System.out.println("JSON object person: "+person.toString(4));

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name","John");
        hashMap.put("age",30)   ;
        hashMap.put("isMarried",false);

        System.out.println("***************");
        System.out.println("DIRect form hashmap to string: "+hashMap.toString());
        System.out.println("***************");
        //Convert hashmap to JSONobject and then to JSON string
        JSONObject jsonObject = new JSONObject(hashMap);
        String jsonStringg = jsonObject.toString();
        System.out.println("Hashmap as JSON String: "+jsonStringg);



        //Custom string formatting
        StringBuilder sb = new StringBuilder("{");

        for (HashMap.Entry<String, Object> entry : hashMap.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue()).append(",");
        }
        if (sb.length()>1) sb.setLength(sb.length()-2);
        sb.append("}");

        System.out.println("Custom HashMap as String: "+sb.toString());
        System.out.println("************************************");
        JSONObject person = new JSONObject();
        person.put("name","Alice");
        person.put("age",30);
        person.put("isStudent",false       );
        person.put("hobbies",new JSONArray(Arrays.asList("reading","hiking","cooking")));

        System.out.println("person: "+person);

        String jsonString="{\"name\":\"Alice\",\"age\":30,\"isStudent\":false," +
                "\"hobbies\":[\"reading\",\"hiking\",\"cooking\"]}";

        JSONObject anum = new JSONObject(jsonString);
        System.out.println(anum);

        String name=person.getString("name");
        int age = person.getInt("age");
        boolean isStudent = person.getBoolean("isStudent");
        JSONArray hobbies = person.getJSONArray("hobbies");

        System.out.println(name+age+isStudent+hobbies);

        String nickname = person.optString("nickName", "No Nickname");
        System.out.println("********************");
        System.out.println(nickname);

person.put("age",31);
        System.out.println("*****"+person);

        HashMap<String ,Object> map = new HashMap<>();
        map.put("name","John Doe");
        map.put("age",30);
        map.put("isMarried",false);

        //Convert HashMap to JSON string using Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(map);
        System.out.println(map);
        System.out.println("________________________________");
        System.out.println("Hashmap as JSON String (Jackson): "+s  );
    }

}
