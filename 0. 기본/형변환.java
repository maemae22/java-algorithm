public class 형변환 {

    // String형 -> 숫자형 (int, double, float, long, short)
    String str = "1234";
    int i1 = Integer.parseInt(str);
    int i2 = Integer.valueOf(str);
    double d1 = Double.parseDouble(str);
    double d2 = Double.valueOf(str);
    float f1 = Float.parseFloat(str);
    float f2 = Float.valueOf(str);
    long l1 = Long.parseLong(str);
    long l2 = Long.valueOf(str);
    short s1 = Short.parseShort(str);
    short s2 = Short.valueOf(str);

    // 숫자형 (int, double, float, long, short) -> String형
    int i = 1234;
    String str1 = String.valueOf(i);
    String str2 = Integer.toString(i);
    double d = 1.23;
    String str3 = String.valueOf(d);
    String str4 = Double.toString(d);
    float f = (float) 1.23;
    String str5 = String.valueOf(f);
    String str6 = Float.toString(f);
    long l = 1234;
    String str7 = String.valueOf(l);
    String str8 = Long.toString(l);
    short s = 1234;
    String str9 = String.valueOf(s);
    String str10 = Short.toString(s);

}
