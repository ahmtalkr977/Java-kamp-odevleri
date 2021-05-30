package core.utils;

public class RegisterRules {
	public static boolean register(boolean...logics) {
		for(boolean b : logics) {
			if(!b) return  false;
		}
		return true;
	}

}
