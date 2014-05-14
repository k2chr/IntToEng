package kadai;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

public class KadaiTest {

	@Test
	public void tlanslateEngで0をテストする(){
		String expected = ("zero");
		String actual = IntToEng.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで7をテストする(){
		String expected = ("seven");
		String actual = IntToEng.translateEng(7);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで11をテストする(){
		String expected = ("eleven");
		String actual = IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで76をテストする(){
		String expected = ("seventy six ");
		String actual = IntToEng.translateEng(76);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで112をテストする(){
		String expected = ("one hundred twelve");
		String actual = IntToEng.translateEng(112);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで670をテストする(){
		String expected = ("six hundred seventy");
		String actual = IntToEng.translateEng(670);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで102をテストする(){
		String expected = ("one hundred two");
		String actual = IntToEng.translateEng(102);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで1000をテストする(){
		String expected = ("one thousand ");
		String actual = IntToEng.translateEng(1000);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで1002をテストする(){
		String expected = ("one thousand two");
		String actual = IntToEng.translateEng(1002);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで1234をテストする(){
		String expected = ("one thousand two hundred thirty four ");
		String actual = IntToEng.translateEng(1234);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEngで2060をテストする(){
		String expected = ("two thousand sixty");
		String actual = IntToEng.translateEng(2060);
		assertThat(actual,is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void tlanslateEngで10000以上が入力されたときIllegalArgumentExceptionを送出する() {
		IntToEng.translateEng(10000);
	}
}
	

