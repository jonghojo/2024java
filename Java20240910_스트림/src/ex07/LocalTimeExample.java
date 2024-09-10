package ex07;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Instant start = Instant.now();
		
		for(long i=1; i<=10000000000L; i++)
			sum += i;
		
		Instant end = Instant.now();
		
		Duration between = Duration.between(start, end);
		
		System.out.println("소요시간 :" + between.toMillis()/1000.0);
			
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Local Zone ID :" + zoneId);
		
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		
		System.out.println("현재 날짜와 시간 : " + formatter.format(currentTime));
		
	}

}
