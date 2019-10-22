package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String n;
        if(isKnighted==true) {
        	if(isWoman==true) {
        		n = "Lady " + name;        	
        	}else {
        		n = "Sir " + name;
        	}
        }else {
        	if(isWoman==true) {
        		n = "Ms. " + name;        	
        	}else {
        		n = "Mr. " + name;
        	}
        }
        return "Hello, " + n + ".";
    }
}






