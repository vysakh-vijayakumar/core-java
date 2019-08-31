package annotations;

import java.util.List;

public class PasswordUtil {

	@UseCase(id = 1, description="passowrd must contain atleast one numeric")
	public boolean validatePassword(String pwd){
		return false;
	}
	
	@UseCase(id = 2)
	public String encryptPassword(String pwd){
		return null;
	}
	
	@UseCase(id = 3, description="new passowrd cannot equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords, String password){
		return false;
	}	
}
