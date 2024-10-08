package Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {

		
		private long id;
		private long movieId;
		private String movieTitle;
		private String SeatName;
		
		public static final File file = new File("src/Movie/reservation.txt");
		
		public String getSeatName() {
			return SeatName;
		}
		
		public long getId() {
			return id;
		}

		public Reservation(long id, long movieId, String movieTitle, String SeatName) {
			this.id =id;
			this.movieId = movieId;
			this.movieTitle = movieTitle;
			this.SeatName = SeatName;
		}
		
		public Reservation(long movieId, String movieTitle, String SeatName) {
			
			this( Instant.now().toEpochMilli(), movieId, movieTitle, SeatName);
			
		}
		
		public static Reservation findById(String reservationId) {//예매확인
			Reservation reservation = null;
			BufferedReader br = null;
			String line = null;
			try {
				br = new BufferedReader(new FileReader(file));
				while((line = br.readLine())!= null) {
					String[] temp = line.split(",");
					
					if(reservationId.equals(temp[0])) {
						reservation = new Reservation(
								Long.parseLong(temp[0]),//발급번호
								Long.parseLong(temp[1]),//영화 ID
								temp[2],//영화제목
								temp[3]//좌석명
								);
						break;
					}
				}
				br.close();
				return reservation;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		
		@Override
		public String toString() {
//			return "영화 :" + movieTitle + ", 좌석 :" + SeatName ;
			return String.format("영화 :%s, 좌석 :%s", movieTitle, SeatName);
		}

//		public static void delete(String id) {
//			BufferedReader br = null;
//			String text = "";
//			String line = "";
//			
//			try {
//				br = new BufferedReader(new FileReader(file));
//				
//				while((line=br.readLine())!=null ){
//					String[] temp = line.split(",");
//					if(id.equals(temp[0])) {   
//						continue;
//				}
//				text += line + "\n";
//				}
//				br.close();
//				
//				FileWriter fw = new FileWriter(file);
//				fw.write(text);
//				
//				fw.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		public static Reservation delete(String reservationid) {//예매취소
			Reservation reservation = null;
			BufferedReader bf = null;
			StringBuilder text = new StringBuilder();
			String line = null;
			
			try {
				
				bf = new BufferedReader(new FileReader(file));
				
				while((line=bf.readLine())!=null ) {
					String[] temp = line.split(",");
					
					if(reservationid.equals(temp[0])) {
						reservation = new Reservation(Long.parseLong(temp[0]),Long.parseLong(temp[1]),
								temp[2],temp[3]);
						
						continue;
					}
					text.append(line+"\n"); //text += line + "\n"; 대체사용
				}
				
				bf.close();
				
				FileWriter fw = new FileWriter(file);
				fw.write(text.toString());
				fw.close();
				return reservation;
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			return null;
		}
		//영화ID에 해당하는 예약 현황을 보여줌
		public static ArrayList<Reservation> findMovieId(String movieId) {//영화예매
			
			 ArrayList<Reservation> reservations = new  ArrayList<Reservation>();
			 
			 BufferedReader bf = null;
			 String line = null;
			 try {
				bf = new BufferedReader(new FileReader(file));
				while((line = bf.readLine()) != null) {
					String[] temp = line.split(",");
					if(movieId.equals(temp[1])) {
						long id = Long.parseLong(temp[0]);
						long mId = Long.parseLong(temp[1]);
						String movieTitle = temp[2];
						String seatName = temp[3];
						
						Reservation r = new Reservation(id, mId, movieTitle, seatName);
						reservations.add(r);
						/*
						 * reservations.add(new Reservation(Long.parseLong(temp[0])
						 * , Long.parseLong(temp[1])
						 * , temp[2], temp[3]));
						 */
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return reservations;
		}

		public void save() throws IOException {
			
			FileWriter fw = new FileWriter(file,true);//true -> 가존파일에 Append 하기
			fw.write(this.toFileString() + "\n");
			fw.close();
			
		}

		private String toFileString() {
			return String.format("%d,%d,%s,%s", id, movieId, movieTitle, SeatName);
		}

}


