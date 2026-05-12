package tool;

import bean.Health;

public class HealthLogic {
	public void execute (Health health) {
		double height=health.getHeight();
		double weight=health.getWeight();
		int bmi=(int)Math.round(weight / Math.pow(height/100.0, 2));
		health.setBmi(bmi);
		
		String bodyType;
		if(bmi < 18.5) {
			bodyType = "痩型";
		} else if(bmi < 25) {
			bodyType = "普通";
		}else {
			bodyType = "肥満";
		}
		
		health.setBodyType(bodyType);
	}
}
