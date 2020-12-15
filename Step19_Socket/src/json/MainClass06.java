package json;

import org.json.JSONObject;

/*
 * [Java 객체와 JSON 문자열의 관계]
 * 
 * Map => JSONObject => { }
 * 
 * List => JSONArray => [ ]
 * 
 * [JSON 문자열과 Java 객체, 데이터와의 관계]
 * 
 * { } => JSONObject
 * [ ] => JSONArray
 * 10 => int
 * 10.1 => double
 * "xxx" => String
 * true => boolean
 *   
 */
public class MainClass06 {
	public static void main(String[] args) {
		String info="{\"num\":1, \"name\":\"김구라\",\"isMan\":true}";
		System.out.println(info);
		// { }를 JSONObject로 바꿔준다.
		JSONObject obj=new JSONObject(info);
		// "num" 이라는 키값으로 int 1을 빼내기
		int a=obj.getInt("num");
		// "name" 이라는 키값으로 String "김구라" 빼내기
		String b=obj.getString("name");
		// "isMan" 이라는 키값으로 boolean true 빼내기
		boolean c=obj.getBoolean("isMan");
	}
}
















