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
	public void tlanslateEngで100をテストする(){
		String expected = ("one hundred ");
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	
}
