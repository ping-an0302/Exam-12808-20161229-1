package hand.Exam_12808_20161229_1;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hand.Exam_12808_20161229_1.bean.Film;
import hand.Exam_12808_20161229_1.service.IFilmService;

public class AppTest {

	public static void main(String[] args) {
		//读取spring配置文件
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springs/ApplicationContext.xml");
		
		//ApplicationContext启动
		context.start();
		
		//控制台获取参数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入电影名称(title): ");
		String title = scan.nextLine();
		System.out.println("请输入电影描述(description): ");
		String description = scan.nextLine();
		System.out.println("请输入语言 ID(language_id): ");
		long language_id = scan.nextLong();
		
		//model
		Film film = new Film();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		
		//调用service层的
		IFilmService service = (IFilmService)context.getBean("service");
		service.savafilm(film);
		
		//ApplicationContext关闭
		context.stop();
	}
}
