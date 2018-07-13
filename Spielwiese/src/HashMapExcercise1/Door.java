package HashMapExcercise1;

import java.util.HashMap;

class Door {
	HashMap<String, AccessCode> doorCodes = new HashMap<String, AccessCode>();
	
	public HashMap<String, AccessCode> getDoorCodes() {
		return doorCodes;
	}


	public void addDoorKey(String key, AccessCode accessCodeDoor1) {
		// TODO Auto-generated method stub
		doorCodes.put(key, accessCodeDoor1);
	}

	public void useCode(String code) {
		if(doorCodes.containsKey(code)){
			AccessCode respectiveCode = doorCodes.get(code);
			respectiveCode.setNumberOfTimesUsed(respectiveCode.getNumberOfTimesUsed()+1);
			
			if(respectiveCode.getNumberOfTimesUsed() > 2) {
				respectiveCode.setValid(false);
				System.out.println("AccessCode no longer valid");
			}else if(respectiveCode.getNumberOfTimesUsed() < 2) {
				System.out.println("AccessCode valid");
			}
		}else {
			System.out.println("AccessCode invalid");
		}
		
	}
}
