package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		Date nowPlus14HoursAnd3Minutes = new Date(now.getTime() + 14*3600L*1000 + 3*60L*1000);
		Date now1 = new Date(System.currentTimeMillis());
		System.out.println(now);
		System.out.println(nowPlus14HoursAnd3Minutes);
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DAY_OF_YEAR,1);
		cal.add(Calendar.MINUTE,-10);
		Date newDate = cal.getTime();
		System.out.println(newDate.toGMTString());
		cal.setTime(now);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.SECOND));

		Calendar lastDayOfMonth = Calendar.getInstance();
		lastDayOfMonth.setTime(now);
		lastDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		lastDayOfMonth.add(Calendar.MONTH,1);
		lastDayOfMonth.add(Calendar.DATE, -1);
		System.out.println(lastDayOfMonth.getTime());
		//Locale.setDefault(new Locale("th","TH"));
		Calendar thaiCalendar = Calendar.getInstance(new Locale("th","TH"));
		System.out.println(thaiCalendar.getTime().toLocaleString());
		// FORMAT i18N
		Locale.setDefault(new Locale("ro","RO"));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMMM/yyyy hh:mm:ss.sss");
		System.out.println(sdf.format(now));
		Timer timer = new Timer(true);
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("In timer");
			}
		}, 4000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
