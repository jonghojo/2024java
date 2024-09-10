package ex08;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample02 {

	public static void main(String[] args) {
		
		ZoneId.getAvailableZoneIds()
		.stream()
		.filter(s->s.startsWith("Europe"))
		.sorted()
		.forEach(ZoneId -> System.out.println(ZoneId));
		
		
		ZonedDateTime parisDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Paris 현재 날짜 와 시간 : " + formatter.format(parisDateTime));
	}

}
