package week1.subject2.ex1;

public class MyDate {
    int year;
    int month;
    private int day;
    boolean valid = false;

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate( int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
// 1, 3, 5, 7, 8, 10, 12
    public String isValid() {
        if ((0 < month && month <= 12) && (0 < day && day <= 31))
        {
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12 :
                    if (day <= 31) valid = true;
                    break;
                case 2 :
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0))
                    {
                        if (day <= 29)
                            valid = true;
                    }
                    else
                    {
                        if (day <= 28)
                            valid = true;
                    }
                    break;
                case 4, 6, 9, 11 :
                    if (day <= 30) valid = true;
                    break;
            }

        }

        if (valid == true)
            return year + "년 " + month + "월 " + day + "일은 유효한 날짜입니다.";
        else
            return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜입니다.";

    }

}
