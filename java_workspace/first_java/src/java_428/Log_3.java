package java_428;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log_3 {
	private static final Logger logger = Logger.getLogger(Log_3.class.getName());
	
	public static void main(String[] args) throws IOException{
		
		Handler handler = new FileHandler("loggingTest.txt");
		
		logger.addHandler(handler);
		logger.setLevel(Level.FINEST);
		logger.info("info ���� �޽���11");
		
		logger.fine("fine ���� �޽��� 22");
		logger.finest("finest ���� �޽��� 33");
		
		handler.flush();
		/*
		 * buffer�� �� ���� ���� ���α׷��� �����ϸ�
		 * buffer�� ����ִ� ������ ���Ͽ� �������� �ʴ´�
		 * �� �� flush()�� ȣ���ϸ� buffer�� ������ ���Ͽ� ��������.
		 * ����ڰ� ���� �� ���۸� ����ִ� ������ ���۸� ���� ����
		 * IO ������ ��� �ϴ� ���̰�, ��Ʈ��ũ������ ������ ���� Ŭ���̾�Ʈ�� ������ ������ ��
		 *  ����ڰ� ���� ����� ���� ����Ʈ
		 */
		
		handler.close();
		/* flush()�� close()�� ���� ���µ�,
		 * ��� close() �Լ��� ���������� flush()�Լ��� ȣ�� �մϴ�.
		 */
	}
}
