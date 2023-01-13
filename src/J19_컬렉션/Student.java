package J19_컬렉션;

import lombok.AllArgsConstructor;		//ctrl + shift + o 안쓰는 것들 정리
import lombok.Data;

//@NoArgsConstructor 		//기본 생성자
//@RequiredArgsConstructor
@AllArgsConstructor		//전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data				//Getter, Setter, EqualsAndHashCode, ToString 4개를 묶어서 @Data

public class Student {
	private String name; //이름
	private int year; //학년
//	private final String address;
}
