package kadai;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class KadaiTest {

	@Test
	public void tlanslateEng��0���e�X�g����(){
		String expected = ("zero");
		String actual = IntToEng.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��7���e�X�g����(){
		String expected = ("seven");
		String actual = IntToEng.translateEng(7);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��11���e�X�g����(){
		String expected = ("eleven");
		String actual = IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��76���e�X�g����(){
		String expected = ("seventy six ");
		String actual = IntToEng.translateEng(76);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��112���e�X�g����(){
		String expected = ("one hundred twelve");
		String actual = IntToEng.translateEng(112);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��670���e�X�g����(){
		String expected = ("six hundred seventy");
		String actual = IntToEng.translateEng(670);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��102���e�X�g����(){
		String expected = ("one hundred two");
		String actual = IntToEng.translateEng(102);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��100���e�X�g����(){
		String expected = ("one hundred ");
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	
}
