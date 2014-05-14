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
	public void tlanslateEng��1000���e�X�g����(){
		String expected = ("one thousand ");
		String actual = IntToEng.translateEng(1000);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��1002���e�X�g����(){
		String expected = ("one thousand two");
		String actual = IntToEng.translateEng(1002);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��1234���e�X�g����(){
		String expected = ("one thousand two hundred thirty four ");
		String actual = IntToEng.translateEng(1234);
		assertThat(actual,is(expected));
	}
	@Test
	public void tlanslateEng��2060���e�X�g����(){
		String expected = ("two thousand sixty");
		String actual = IntToEng.translateEng(2060);
		assertThat(actual,is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void tlanslateEng��10000�ȏオ���͂��ꂽ�Ƃ�IllegalArgumentException�𑗏o����() {
		IntToEng.translateEng(10000);
	}
}
	

