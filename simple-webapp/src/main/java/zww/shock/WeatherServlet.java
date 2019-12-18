package zww.shock;

import zww.shock.WeatherService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WeatherServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		WeatherService weatherService = new WeatherService();
		
		
		PrintWriter out = response.getWriter();
		out.println(weatherService.outPut());
		out.flush();
		out.close();
	}

}
