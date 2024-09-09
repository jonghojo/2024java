package Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private long id;  //영화 고유 번호
	private String title;  //영화 제목
	private String genre; //영화 장르
	
	private static final File file = 
			new File("src/Movie/Movies.txt");
	
	
	public String getTitle() {
		return title;
	}
	
	public long getId() {
		return id;
	}


	public Movie(String title, String genre) {
		this.id = Instant.now().getEpochSecond();
		this.title = title;
		this.genre = genre;
	}

	public Movie(long id, String title, String genre ) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true); //true -> append(추가)
		
		fw.write(this.toFileString() + "\n");
		fw.close();
	}
	
	private String toFileString() {
		return String.format("%d,%s,%s",id,title,genre);
	}
	
	public static Movie findAll(String movieId) {
		Movie movie = null;
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(movieId.equals(temp[0])) {
					new Movie(Long.parseLong(temp[0]),temp[1],temp[2]);
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return movie;
	} 

	public static List<Movie> findAll() throws IOException {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		BufferedReader br = null;
		String line = null;  //"127175707,에벤져스,판타지"
		
		/*
		 * temp[0] -> "127175707"
		 * temp[1] ->  에벤져스
		 * temp[2] -> 판타지
		 */
		try {
			br = new BufferedReader(new FileReader(file));
			
			while( (line =  br.readLine()) != null) {
				String[] temp = line.split(",");  
	
				Movie movie = 
						new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				
				movies.add(movie);   
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		br.close();
		return movies;
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)", id, title, genre);
	}

	public static void delete(String movieId) {
		
		BufferedReader br = null; //BufferedReader객체선어
		String text = "";		  //파일에서 읽어온 텍스트를 저장할 문자열
		String line = "";		  //파일에서 한 줄씩 읽어올 문자열
		
		try {
			// 파일을 읽기 위해 BufferedReader를 FileReader로 초기화
			br = new BufferedReader(new FileReader(file));
			
			// 파일의 모든 줄을 읽음
			while((line=br.readLine())!=null ) {
				String[] temp = line.split(",");  //각 줄을 쉼표(,)로 구분하여 배열에 저장
				if(movieId.equals(temp[0])) {     //movieID가 첫 번쨰 요소(temp[0])와 같으면 해당 줄을 삭제
					continue;
				}
				text += line + "\n"; //삭제되지 않은 줄은 text에 추가
			}
			br.close(); //BufferedReader를 닫음
			
			FileWriter fw = new FileWriter(file);
			fw.write(text); //새로운 내용으로 파일을 덮어씀
			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
