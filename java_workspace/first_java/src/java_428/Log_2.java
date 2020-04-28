package java_428;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log_2 {
	
	private static final Logger logger = Logger.getLogger("korea.seoul");
	
	public static void main(String[] args) {	
		
		logger.info("로깅이 시작됩니다...");
		try {
			throw new Exception("고의적으로 예외를 발생시킨다.");
		}catch (Exception e) {
			logger.log(Level.WARNING, e.getMessage(), e);
		}
		logger.info("완료 되었음...");
	}
}
