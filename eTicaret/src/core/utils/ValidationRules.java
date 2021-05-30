package core.utils;

public class ValidationRules {
	public static boolean validate(boolean...logics){
		for(boolean b : logics) {
			if(!b) return false;
		}
		return true;
	}

}
