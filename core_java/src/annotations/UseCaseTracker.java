package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl){
		for(Method m : cl.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null){
				System.out.println("Found UseCase:"+ uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		
		for(Integer useCase: useCases){
			System.out.println("Missing Use Case-"+ useCase);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 1, 2, 3, 4);
		trackUseCases(useCases, PasswordUtil.class);
	}
}
