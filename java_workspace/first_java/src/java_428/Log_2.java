package java_428;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log_2 {
	
	private static final Logger logger = Logger.getLogger("korea.seoul");
	
	public static void main(String[] args) {	
		
		logger.info("�α��� ���۵˴ϴ�...");
		try {
			throw new Exception("���������� ���ܸ� �߻���Ų��.");
		}catch (Exception e) {
			logger.log(Level.WARNING, e.getMessage(), e);
		}
		logger.info("�Ϸ� �Ǿ���...");
	}
}
