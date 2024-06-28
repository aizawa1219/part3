package chapter16_1;

public class Sample2 {

	public static void main(String[] args) {
		Reg.test("Tom", "Tom", "tom");
		Reg.test(".im",		 "Jim", "Tom");
		Reg.test("[a-z]xx",		"Axx","gxx", "8xx");
		Reg.test("[a-zA-Z]xx",		"Axx","gxx", "8xx");
		Reg.test("[PSA]xx","Axx","gxx", "8xx");
		Reg.test("[^PSA]xx","Axx","gxx", "8xx");
		Reg.test(".*apple",		"XXXapple", "XXX", "apple");
		Reg.test(".+apple",		"XXXapple", "XXX", "apple");
		Reg.test("^apple.*",	"appleXX", "apple", "XXappleXXX");
		Reg.test(".*apple$",	"XXXapple", "apple", "XXXappleXXX");
		Reg.test("\\d+",  "2302", "apple_#");
		Reg.test("\\D+",  "2302", "apple_#");
		Reg.test("ap\\s+ple",  "ap  ple", "ap##ple");
		Reg.test("ap\\S+ple",  "ap  ple", "ap##ple");
		Reg.test("\\w+",  "apple_12", "#$%&");
		Reg.test("\\W+",  "apple_12", "#$%&");
		Reg.test("\\d{3}",   "123", "1234", "12345", "123456");
		Reg.test("\\d{3,}",   "123", "1234", "12345", "123456");
		Reg.test("\\d{3,5}",   "123", "1234", "12345", "123456");
		Reg.test("[Tj]im|[Tt]om|[Ss]am",  "Jim", "Kim", "tom", "sam");
		Reg.test("(1[012]|[1-9])(am|pm)",  "10am", "8pm", "13pm");
		Reg.test("(?i)(tim|tom|sam)",  "Jim", "Kim", "Tom", "Sam");
		Reg.test("(?-i)(tim|tom|sam)",  "Jim", "Kim", "Tom", "Sam");
		Reg.test("(?=.*tom).*", "xtom130", "tom", "tom.13$");
		Reg.test("(?=.*tom).{6,10}", "xtom130", "tom", "tom.13$");
		Reg.test("(?=.*tom)\\w+", "xtom130", "tom", "tom.13$");
		Reg.test("(?=.*tom)(?=.*[@#$%]).*", "xtom130", "tom", "tom.13$");
		Reg.test("(?=.*tom)(?!.*[0-9]).*", "xtom130", "tom", "tom.13$");
	}

}

